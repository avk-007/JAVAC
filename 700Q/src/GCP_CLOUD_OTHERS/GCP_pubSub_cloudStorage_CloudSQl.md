# GCP Services for Spring Boot Microservices Interview Cheat Sheet
## Architecture
```text
Client
  |
Spring Boot Order Service
  |
  +--> Cloud SQL (Orders, Users, Products)
  +--> Cloud Storage (Invoices, Images)
  +--> Cloud Pub/Sub (OrderCreated Event)
               |
       +-------+-------+
       |               |
Notification      Inventory
Service           Service
```
## 1. Cloud SQL
### Purpose
Managed MySQL/PostgreSQL for structured business data.
### Spring Boot Flow
```
Controller → Service → Repository (JPA/Hibernate) → Cloud SQL
```
### Use Cases
- Users
- Orders
- Products
- Payments
### Integration
**Dependencies**
- spring-boot-starter-data-jpa
- mysql/postgresql driver
  **application.properties**
```properties
spring.datasource.url=jdbc:mysql://HOST:3306/ecommerce
spring.datasource.username=user
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
```
**Repository**
```java
orderRepository.save(order);
```
### gcloud Commands
```bash
gcloud sql instances create ecommerce-db --database-version=MYSQL_8_0 --region=asia-south1
gcloud sql databases create ecommerce --instance=ecommerce-db
gcloud sql users create springuser --instance=ecommerce-db --password=Password123
gcloud sql databases list --instance=ecommerce-db
```
### Interview Topics
- Cloud SQL vs Self-managed MySQL
- Spring Data JPA
- Hibernate
- Transactions
- HikariCP
- Indexes
- Query Optimization
- Read Replicas
- High Availability
- Backups
- Flyway/Liquibase
---
## 2. Cloud Storage (GCS)
### Purpose
Store files like PDFs, images, videos, invoices, and resumes.
### Spring Boot Flow
```
Client → MultipartFile → StorageService → Bucket → URL → Save URL in Cloud SQL
```
### Use Cases
- Resume Upload
- Invoice PDFs
- Product Images
  **Example**
```
https://storage.googleapis.com/bucket/invoice101.pdf
```
Only the URL is stored in Cloud SQL.
### gcloud Commands
```bash
gcloud storage buckets create gs://ecommerce-files
gcloud storage cp invoice.pdf gs://ecommerce-files/
gcloud storage ls gs://ecommerce-files
gcloud storage rm gs://ecommerce-files/invoice.pdf
```
### Interview Topics
- Bucket
- Object
- Storage Classes
- IAM
- Signed URLs
- Versioning
- Lifecycle Policies
- Large Uploads
- Validation
---
## 3. Cloud Pub/Sub
### Purpose
Asynchronous communication between microservices.
### Spring Boot Flow
```
Order Service → Topic → Subscription → Notification / Inventory / Analytics
```
### Example Event
```json
{
  "orderId": 101,
  "customer": "Abhi",
  "amount": 25000
}
```
**Publisher**
```java
pubSubTemplate.publish("order-topic", message);
```
**Subscriber**
```java
@PubSubListener("order-sub")
public void receive(String message) {
    // Process message
}
```
### gcloud Commands
```bash
gcloud pubsub topics create order-topic
gcloud pubsub subscriptions create order-sub --topic=order-topic
gcloud pubsub topics publish order-topic --message="Order Created"
gcloud pubsub subscriptions pull order-sub --auto-ack
```
### Interview Topics
- Topic
- Subscription
- Publisher
- Subscriber
- Push vs Pull
- ACK/NACK
- Retry
- Dead Letter Queue
- Ordering
- Idempotency
- At-least-once Delivery
---
# End-to-End Interview Story
1. Client calls **POST /orders**
2. Spring Boot validates the request.
3. Save order in Cloud SQL.
4. Upload invoice to Cloud Storage.
5. Save invoice URL in Cloud SQL.
6. Publish **OrderCreated** event to Pub/Sub.
7. Inventory Service reduces stock.
8. Notification Service sends email.
9. Analytics Service updates dashboard.
---
# Frequently Asked Questions
### Why Cloud SQL instead of MySQL on a VM?
- Managed backups
- High Availability
- Automatic maintenance
- Scaling
### Why Cloud Storage instead of Database?
- Databases are not optimized for storing large binary files.
### Why Pub/Sub instead of REST?
- Loose coupling
- Asynchronous processing
- Retry support
- Multiple consumers
---
# 60-Second Interview Answer
> "In our Spring Boot microservices architecture, Cloud SQL stores relational business data using Spring Data JPA.
> Files such as invoices or resumes are uploaded to Cloud Storage, and only their URLs are stored in Cloud SQL. 
> After completing a business transaction, such as creating an order, the service publishes an event to Cloud Pub/Sub. 
> Subscriber services like Notification, Inventory, and Analytics consume the event independently, 
> enabling an event-driven, scalable, and loosely coupled architecture."