# Spring Boot Microservice Deployment to GKE (End-to-End)
## 1. Develop the Spring Boot Application
- Develop the application using Java and Spring Boot.
- Implement REST APIs, business logic, and database connectivity.
- Test the application locally.
```bash
mvn spring-boot:run
```
or
```bash
java -jar target/user-service.jar
```
## 2. Package the Application
Generate the executable JAR.
```bash
mvn clean package
```
Output:
```text
target/user-service.jar
```
## 3. Create Docker Image
Create a Dockerfile.
```dockerfile
FROM eclipse-temurin:21-jdk
COPY target/user-service.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
```
Build the Docker image.
```bash
docker build -t user-service:v1 .
```
Verify the image.

```bash
docker images
```

Run the container locally.

```bash
docker run -d -p 8080:8080 --name user-service user-service:v1
```

Check running containers.

```bash
docker ps
```

View container logs.

```bash
docker logs user-service
```

## 4. Authenticate with Google Cloud

Login to GCP.

```bash
gcloud auth login
```

Set the active project.

```bash
gcloud config set project <PROJECT_ID>
```

Verify configuration.

```bash
gcloud config list
```

## 5. Create Artifact Registry (One-Time Setup)

Create a Docker repository.

```bash
gcloud artifacts repositories create spring-repo --repository-format=docker --location=us-central1
```

Configure Docker authentication.

```bash
gcloud auth configure-docker us-central1-docker.pkg.dev
```

List repositories.

```bash
gcloud artifacts repositories list
```

## 6. Tag Docker Image

```bash
docker tag user-service:v1 us-central1-docker.pkg.dev/<PROJECT_ID>/spring-repo/user-service:v1
```

## 7. Push Image to Artifact Registry

```bash
docker push us-central1-docker.pkg.dev/<PROJECT_ID>/spring-repo/user-service:v1
```

Verify the image.

```bash
gcloud artifacts docker images list us-central1-docker.pkg.dev/<PROJECT_ID>/spring-repo
```

## 8. Create GKE Cluster (One-Time Setup)

```bash
gcloud container clusters create user-cluster --zone us-central1-a --num-nodes 2
```

Verify the cluster.

```bash
gcloud container clusters list
```

## 9. Connect kubectl to the GKE Cluster

```bash
gcloud container clusters get-credentials user-cluster --zone us-central1-a
```

Verify the nodes.

```bash
kubectl get nodes
```

## 10. Create Kubernetes Deployment

Create `deployment.yaml`.

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: user-service
spec:
  replicas: 3
  selector:
    matchLabels:
      app: user-service
  template:
    metadata:
      labels:
        app: user-service
    spec:
      containers:
      - name: user-service
        image: us-central1-docker.pkg.dev/<PROJECT_ID>/spring-repo/user-service:v1
        ports:
        - containerPort: 8080
```

Deploy the application.

```bash
kubectl apply -f deployment.yaml
```

Verify deployment.

```bash
kubectl get deployments
kubectl get pods
```

## 11. Expose the Application

Create `service.yaml`.

```yaml
apiVersion: v1
kind: Service
metadata:
  name: user-service
spec:
  selector:
    app: user-service
  type: LoadBalancer
  ports:
  - port: 80
    targetPort: 8080
```

Deploy the service.

```bash
kubectl apply -f service.yaml
```

Verify the service.

```bash
kubectl get svc
kubectl get svc user-service
```

## 12. Verify the Deployment

```bash
kubectl get deployments
kubectl get pods
kubectl get svc
kubectl describe deployment user-service
kubectl describe pod <pod-name>
kubectl logs <pod-name>
kubectl exec -it <pod-name> -- /bin/sh
```

## 13. Deploy a New Version (Rolling Update)

Build the new image.

```bash
docker build -t user-service:v2 .
```

Tag the image.

```bash
docker tag user-service:v2 us-central1-docker.pkg.dev/<PROJECT_ID>/spring-repo/user-service:v2
```

Push the image.

```bash
docker push us-central1-docker.pkg.dev/<PROJECT_ID>/spring-repo/user-service:v2
```

Update the Deployment.

```bash
kubectl set image deployment/user-service user-service=us-central1-docker.pkg.dev/<PROJECT_ID>/spring-repo/user-service:v2
```

Monitor rollout.

```bash
kubectl rollout status deployment/user-service
kubectl rollout history deployment/user-service
kubectl rollout undo deployment/user-service
```

## Complete Deployment Flow

```text
Spring Boot Code → Develop the application with REST APIs and business logic.
↓
mvn clean package → Compile the project and generate the executable JAR.
↓
Generate JAR → Ready for containerization.
↓
docker build → Create a Docker image from the JAR.
↓
Docker Image → Portable container containing the application.
↓
docker run (Local Testing) → Verify the application works locally.
↓
gcloud auth login → Authenticate with Google Cloud.
↓
docker tag → Tag the image for Artifact Registry.
↓
docker push → Upload the Docker image to Artifact Registry.
↓
Artifact Registry → Securely store Docker images.
↓
Create GKE Cluster → Provision the Kubernetes cluster.
↓
gcloud container clusters get-credentials → Configure kubectl to access the GKE cluster.
↓
kubectl apply -f deployment.yaml → Create the Deployment and Pods.
↓
Pods Created → Run the Spring Boot application inside containers.
↓
kubectl apply -f service.yaml → Expose Pods using a Kubernetes Service.
↓
LoadBalancer Service → Assign a public IP and distribute traffic.
↓
Application Accessible → Users can access the application.
↓
Build New Docker Image → Package the updated application version.
↓
docker push → Push the updated image to Artifact Registry.
↓
kubectl set image → Update the Deployment with the new image.
↓
Rolling Update → Replace old Pods with new Pods gradually.
↓
Zero Downtime Deployment → Deploy the new version without interrupting users.
```