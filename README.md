# 🚀 Product Service API

A robust **Spring Boot REST API** for managing products using clean architecture, JPA persistence, and multi-database support.

---

## ✨ Features

* ✅ Full **CRUD** operations for products
* 🌐 RESTful API built with Spring Boot
* 🗄️ JPA + Hibernate persistence layer
* 🧪 **H2** database support for development
* 🏢 **Microsoft SQL Server** support for production
* 🔐 Spring Security ready
* 🧼 Clean layered architecture (`Controller → Service → Repository`)
* 📦 Maven build system with Lombok support

---

## 🛠️ Tech Stack

* **Java** 21 / 25
* **Spring Boot** 3.4+
* Spring Web
* Spring Data JPA
* Spring Security
* H2 Database
* Microsoft SQL Server
* Lombok
* Maven

---

## 📁 Project Structure

```bash
src/main/java/com/telusko/simpleWebApp/
├── config/           # Security & application configuration
├── controller/       # REST controllers
├── model/            # JPA entities
├── repository/       # JPA repositories
├── service/          # Business logic layer
└── SimpleWebAppApplication.java

src/main/resources/
├── application.properties
└── data.sql          # Optional sample data
```

---

## ⚙️ Getting Started

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/lensen-degife/product-service-api.git
cd product-service-api
```

---

### 2️⃣ Configure the Database

## Development (H2 - Default)

No additional setup is required.
The application uses an in-memory H2 database by default.

---

## Production (Microsoft SQL Server)

Update `src/main/resources/application.properties`
or create a dedicated `application-prod.properties` file.

```properties
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=product_db;encrypt=true;trustServerCertificate=true
spring.datasource.username=your_username
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.SQLServerDialect
```

---

## ▶️ Running the Application

### Build the Project

```bash
./mvnw clean install
```

### Run the Application

```bash
./mvnw spring-boot:run
```

The application will start at:

```text
http://localhost:8090
```

---

## 📡 API Endpoints

| Method | Endpoint             | Description                |
| ------ | -------------------- | -------------------------- |
| GET    | `/api/products`      | Get all products           |
| GET    | `/api/products/{id}` | Get a product by ID        |
| POST   | `/api/products`      | Create a new product       |
| PUT    | `/api/products/{id}` | Update an existing product |
| DELETE | `/api/products/{id}` | Delete a product           |

---

## 📥 Sample Request — Create Product

```json
{
  "name": "Laptop",
  "description": "High-performance gaming laptop",
  "price": 1299.99
}
```

---

## 🧪 Running Tests

```bash
./mvnw test
```

---

## 🔐 Security

Spring Security is already configured and can be extended with:

* JWT Authentication
* OAuth2
* Role-based Authorization
* API Key Authentication

---

## 📈 Future Enhancements

* ✅ JWT Authentication
* ✅ Swagger / OpenAPI Documentation
* ✅ Pagination & Filtering
* ✅ Docker Support
* ✅ Testcontainers Integration Testing
* ✅ CI/CD Pipeline

---

## 🤝 Contributing

1. Fork the repository
2. Create a new feature branch

```bash
git checkout -b feature/amazing-feature
```

3. Commit your changes

```bash
git commit -m "Add amazing feature"
```

4. Push to the branch

```bash
git push origin feature/amazing-feature
```

5. Open a Pull Request

---

## 📄 License

This project is licensed under the **MIT License**.

---

## ❤️ Author

Made with ❤️ by **lensen-degife**
