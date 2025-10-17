# Stage 0 Task 🚀

A simple REST API built in **Java/Spring Boot** that returns profile information and a random cat fact.

## 🔗 Endpoint
**GET** `/me`

### Example Response
```json
{
  "status": "success",
  "user": {
    "email": "nyagakavera@gmail.com",
    "name": "Vera Nyagaka",
    "stack": "Java/Spring Boot"
  },
  "timestamp": "2025-10-16T12:00:00.000Z",
  "fact": "Cats have five toes on their front paws."
}
```

## Steps

1. Install Java (OpenJDK) and set JAVA_HOME


2. Initialize Project

Use Spring Initializer: https://start.spring.io


3. Code, Run and Test
``` bash
./mvnw spring-boot:run

http://localhost:8080/me
```

4. Live Deployment

https://hng-stage-zero-75013322243.us-central1.run.app/me

---