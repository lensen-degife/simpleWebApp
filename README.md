---

# 🚀 Product Service API

A production-style **Spring Boot REST API** for managing products with database integration, layered architecture, and optional Spring Security support.

---

## ✨ Features

* 🧩 Full **CRUD operations** for Products (Create, Read, Update, Delete)
* 🌐 RESTful API built with Spring Boot
* 🗄️ JPA + Hibernate for database persistence
* 🧪 **H2 Database** for development & testing
* 🏢 **Microsoft SQL Server** support for production
* 🔐 Spring Security integration
* 🧼 Clean layered architecture (Controller → Service → Repository)
* 📦 Maven-based build system
* ✨ Lombok for cleaner, boilerplate-free code

---

## 🛠️ Tech Stack

* Java **25**
* Spring Boot **3.4+**
* Spring Web (Spring MVC)
* Spring Data JPA
* Spring Security
* Microsoft SQL Server
* H2 Database
* Lombok
* Maven

---

## 📁 Project Structure

```
product-service-api/
├── src/
│   ├── main/
│   │   ├── java/com/example/productservice/
│   │   │   ├── controller/     # REST controllers
│   │   │   ├── service/        # Business logic layer
│   │   │   ├── repository/     # Data access layer (JPA)
│   │   │   ├── model/          # Entity classes
│   │   │   ├── dto/            # Data Transfer Objects (optional)
│   │   │   ├── config/         # Security & configuration
│   │   │   └── ProductServiceApiApplication.java
│   │   │
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── application-dev.properties
│   │       ├── application-prod.properties
│   │       └── data.sql
│   │
│   └── test/
│       └── java/com/example/productservice/
│           └── ProductServiceApiApplicationTests.java
│
├── pom.xml
├── README.md
└── mvnw / mvnw.cmd
```

---

## ⚙️ Getting Started

### 1️⃣ Clone the repository

```bash
git clone https://github.com/your-username/product-service-api.git
cd product-service-api
```

---

### 2️⃣ Configure Database

#### 🧪 H2 Database (Default – Development)

No configuration required. Runs in-memory automatically.

---

#### 🏢 Microsoft SQL Server (Production)

Update `application-prod.properties`:

```properties
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=your_db
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.SQLServerDialect
```

---

## ▶️ Run the Application

### Build project

```bash
mvn clean install
```

### Start server

```bash
mvn spring-boot:run
```

Application runs at:

```
http://localhost:8080
```

---

## 📡 API Endpoints

### Product APIs

| Method | Endpoint             | Description        |
| ------ | -------------------- | ------------------ |
| GET    | `/api/products`      | Get all products   |
| GET    | `/api/products/{id}` | Get product by ID  |
| POST   | `/api/products`      | Create new product |
| PUT    | `/api/products/{id}` | Update product     |
| DELETE | `/api/products/{id}` | Delete product     |

---

## 📦 Sample Request

### Create Product

```json
{
  "name": "Laptop",
  "description": "High-performance gaming laptop",
  "price": 1200.00
}
```

---

## 🔐 Security

Spring Security is enabled (if configured).

You can extend it with:

* Basic Authentication
* JWT Authentication
* Role-based authorization

---

## 🧪 Running Tests

```bash
mvn test
```

---

## 📈 Future Improvements

* 🔐 JWT Authentication
* 📄 Swagger / OpenAPI documentation
* 🔎 Pagination & filtering
* 🐳 Docker support
* ☁️ Cloud deployment (AWS / Azure)
* 🧪 Integration tests (Testcontainers)

---

## 🤝 Contributing

1. Fork the repository
2. Create feature branch

   ```bash
   git checkout -b feature/new-feature
   ```
3. Commit changes

   ```bash
   git commit -m "Add new feature"
   ```
4. Push branch

   ```bash
   git push origin feature/new-feature
   ```
5. Open Pull Request

---

## 📄 License

This project is licensed under the MIT License.

---

## ⭐ Support

If you like this project, consider giving it a ⭐ on GitHub.

---
