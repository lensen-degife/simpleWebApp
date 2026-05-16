**Here's a clean, professional README.md** for your project:

---

```markdown
# Simple Web App

A simple **Spring Boot REST API** for managing products with database integration.

## Features

- ✅ **CRUD Operations** for Products (Create, Read, Update, Delete)
- ✅ RESTful API using Spring Boot
- ✅ JPA + Hibernate for database operations
- ✅ Support for **Microsoft SQL Server** (with H2 for development)
- ✅ Spring Security included
- ✅ Lombok for clean code
- ✅ Maven-based project

## Technologies Used

- **Java 25**
- **Spring Boot 3.4+** (Spring Boot Starter Parent 4.0.6)
- **Spring Data JPA**
- **Spring Web MVC**
- **Spring Security**
- **Microsoft SQL Server**
- **H2 Database** (for testing)
- **Lombok**
- **Maven**

## Project Structure

```
src/main/java/com/telusko/simpleWebApp/
├── SimpleWebAppApplication.java
├── config/
├── controller/
│   ├── ProductController.java
│   ├── HomeController.java
│   └── LoginController.java
├── model/
│   └── Product.java
├── repository/
├── service/
└── ...
```

## API Endpoints

| Method | Endpoint                | Description                  |
|--------|-------------------------|------------------------------|
| GET    | `/products`             | Get all products             |
| GET    | `/products/{prodId}`    | Get product by ID            |
| POST   | `/products`             | Add new product              |
| PUT    | `/products`             | Update existing product      |
| DELETE | `/products/{prodId}`    | Delete product by ID         |

## How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/lensen-degife/simpleWebApp.git
   cd simpleWebApp
   ```

2. **Configure Database** (in `src/main/resources/application.properties`)
   - Update your SQL Server connection details

3. **Run the application**
   ```bash
   ./mvnw spring-boot:run
   ```

   Or using Maven:
   ```bash
   mvn spring-boot:run
   ```

4. The app will start at `http://localhost:8080`

## Default Endpoints

- Products API → `http://localhost:8080/products`
- H2 Console (if enabled) → `http://localhost:8080/h2-console`

---
