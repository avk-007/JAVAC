# Cloud Run vs GKE (Google Kubernetes Engine)
# Cloud Run vs GKE (Google Kubernetes Engine)

```text
+---------------------------+-------------------------------------------+------------------------------------------------+
| Feature                   | Cloud Run                                 | GKE (Google Kubernetes Engine)                 |
+---------------------------+-------------------------------------------+------------------------------------------------+
| Platform                  | Serverless containers                     | Managed Kubernetes platform                    |
| Infrastructure Management | Google manages everything                 | You manage Kubernetes workloads                |
| Kubernetes Knowledge      | Not required                              | Required                                       |
| Container Orchestration   | Automatic                                 | Kubernetes                                     |
| Scaling                   | Auto scaling + Scale to Zero              | HPA + Cluster Autoscaler                       |
| Startup Time              | Starts on demand                          | Pods are usually already running               |
| Pricing                   | Pay per request                           | Pay for cluster resources                      |
| Best For                  | APIs, Jobs, Small Microservices           | Enterprise Microservices                       |
| Deployment                | gcloud run deploy                         | kubectl apply -f deployment.yaml               |
| Networking                | Built-in HTTPS Endpoint                   | Service + Ingress + Load Balancer              |
| Load Balancer             | Managed automatically                     | Kubernetes Ingress                             |
| Configuration             | Environment Variables                     | ConfigMaps + Secrets                           |
| Persistent Storage        | External Services                         | Persistent Volumes (PV/PVC)                    |
| Logging                   | Cloud Logging                             | Cloud Logging + kubectl logs                   |
| Monitoring                | Cloud Monitoring                          | Cloud Monitoring + Prometheus + Grafana        |
| Rollback                  | Previous Revision                         | kubectl rollout undo                           |
| Traffic Splitting         | Built-in                                  | Istio / Ingress                                |
| Scale to Zero             | Yes                                       | No                                             |
| Complexity                | Low                                       | Medium to High                                 |                        |
+---------------------------+-------------------------------------------+------------------------------------------------+
## Deployment Flow

### Cloud Run
```text
Spring Boot App
↓
Docker Build
↓
Artifact Registry
↓
Cloud Run
↓
HTTPS Endpoint
```

### GKE
```text
Spring Boot Application → Develop the application.
↓
Docker Build → Create a Docker image.
↓
Artifact Registry → Store the Docker image.
↓
GKE Cluster → Run Kubernetes workloads.
↓
Deployment → Create and manage Pods.
↓
Pods → Execute the Spring Boot application.
↓
Service → Expose Pods internally and load balance traffic.
↓
Ingress → Route external HTTP/HTTPS requests.
↓
Google Cloud Load Balancer → Expose the application publicly and distribute traffic across healthy Pods.
↓
Users → Consume the application.
```
# Cloud Run Deployment

```text
┌─────────────────────────────────────────────────────────────────────────────┐
│ 1. Authenticate                                                             │
│    gcloud auth login                                                        │
│    gcloud config set project PROJECT_ID                                     │
├─────────────────────────────────────────────────────────────────────────────┤
│ 2. Enable APIs                                                              │
│    gcloud services enable run.googleapis.com artifactregistry.googleapis.com│
├─────────────────────────────────────────────────────────────────────────────┤
│ 3. Build Docker Image                                                       │
│    docker build -t asia-south1-docker.pkg.dev/PROJECT_ID/backend/user-      │
│    service:v1 .                                                             │
├─────────────────────────────────────────────────────────────────────────────┤
│ 4. Push Image                                                               │
│    docker push asia-south1-docker.pkg.dev/PROJECT_ID/backend/user-service:v1│
├─────────────────────────────────────────────────────────────────────────────┤
│ 5. Deploy                                                                   │
│    gcloud run deploy user-service                                           │
│    --image asia-south1-docker.pkg.dev/PROJECT_ID/backend/user-service:v1    │
│    --region asia-south1 --platform managed --allow-unauthenticated          │
├─────────────────────────────────────────────────────────────────────────────┤
│ 6. Logs                                                                     │
│    gcloud run services logs read user-service --region asia-south1          │
├─────────────────────────────────────────────────────────────────────────────┤
│ 7. Update                                                                   │
│    gcloud run deploy user-service --image ...:v2                            │
├─────────────────────────────────────────────────────────────────────────────┤
│ 8. Delete                                                                   │
│    gcloud run services delete user-service --region asia-south1             │
└─────────────────────────────────────────────────────────────────────────────┘
```

# GKE Deployment

```text
┌─────────────────────────────────────────────────────────────────────────────┐
│ 1. Authenticate                                                             │
│    gcloud auth login                                                        │
│    gcloud config set project PROJECT_ID                                     │
├─────────────────────────────────────────────────────────────────────────────┤
│ 2. Enable APIs                                                              │
│    gcloud services enable container.googleapis.com artifactregistry.googleapis.com │
├─────────────────────────────────────────────────────────────────────────────┤
│ 3. Create Cluster                                                           │
│    gcloud container clusters create my-cluster --zone asia-south1-a         │
├─────────────────────────────────────────────────────────────────────────────┤
│ 4. Connect Cluster                                                          │
│    gcloud container clusters get-credentials my-cluster --zone asia-south1-a│
├─────────────────────────────────────────────────────────────────────────────┤
│ 5. Build Docker Image                                                       │
│    docker build -t asia-south1-docker.pkg.dev/PROJECT_ID/backend/user-      │
│    service:v1 .                                                             │
├─────────────────────────────────────────────────────────────────────────────┤
│ 6. Push Image                                                               │
│    docker push asia-south1-docker.pkg.dev/PROJECT_ID/backend/user-service:v1│
├─────────────────────────────────────────────────────────────────────────────┤
│ 7. Deploy Application                                                       │
│    kubectl apply -f deployment.yaml                                         │
├─────────────────────────────────────────────────────────────────────────────┤
│ 8. Expose Service                                                           │
│    kubectl apply -f service.yaml                                            │
├─────────────────────────────────────────────────────────────────────────────┤
│ 9. Create Ingress                                                           │
│    kubectl apply -f ingress.yaml                                            │
├─────────────────────────────────────────────────────────────────────────────┤
│10. Verify                                                                   │
│    kubectl get pods                                                         │
│    kubectl get svc                                                          │
│    kubectl get ingress                                                      │
├─────────────────────────────────────────────────────────────────────────────┤
│11. View Logs                                                                │
│    kubectl logs POD_NAME                                                    │
├─────────────────────────────────────────────────────────────────────────────┤
│12. Describe Pod                                                             │
│    kubectl describe pod POD_NAME                                            │
├─────────────────────────────────────────────────────────────────────────────┤
│13. Scale                                                                    │
│    kubectl scale deployment user-service --replicas=5                       │
├─────────────────────────────────────────────────────────────────────────────┤
│14. Rolling Restart                                                          │
│    kubectl rollout restart deployment user-service                          │
├─────────────────────────────────────────────────────────────────────────────┤
│15. Rollback                                                                 │
│    kubectl rollout undo deployment user-service                             │
├─────────────────────────────────────────────────────────────────────────────┤
│16. Delete Resources                                                         │
│    kubectl delete -f deployment.yaml                                        │
│    kubectl delete -f service.yaml                                           │
│    kubectl delete -f ingress.yaml                                           │
└─────────────────────────────────────────────────────────────────────────────┘
```
# Interview Summary
- **Cloud Run:** Serverless container platform. Google manages infrastructure,
- scaling, HTTPS, and load balancing. Best for APIs, jobs, and small to medium microservices.
- **GKE:** Managed Kubernetes service. You manage Kubernetes resources 
- such as Deployments, Pods, Services, and Ingress. Best for enterprise-scale microservices requiring advanced networking, scaling, storage, and operational control.

## GCP Deployment Architecture

```text
                         GCP
                  | Artifact Registry|
               +-----------+-----------+
      +----------------+      +----------------+
      |      GKE       |      |   Cloud Run    |
      +----------------+      +----------------+
      | User Service   |      | Email Service  |
      | Order Service  |      | Notification   |
      | Payment Service|      | PDF Generator  |
      | Main APIs      |      | Scheduled Jobs |
      +----------------+      +----------------+
```
```text
My primary experience has been developing and containerizing Spring Boot applications using Docker.
I understand the deployment workflows for both GKE and Cloud Run.
• Build the Spring Boot application.
• Create a Docker image.
• Push the image to Google Artifact Registry.
• Deploy to GKE using Kubernetes manifests (Deployment, Service, Ingress).
• Deploy to Cloud Run using the `gcloud run deploy` command.

I understand when each service should be used:
• GKE → Enterprise microservices, Kubernetes orchestration, advanced networking, and long-running workloads.
• Cloud Run → Serverless APIs, event-driven services, background jobs, and applications requiring automatic scaling with minimal operational overhead.
```