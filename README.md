
# 🚀 Simple Web App – Spring Boot REST API

A production-style **Spring Boot REST API** for managing products with database integration, security support, and clean layered architecture.

---

## ✨ Features

* 🧩 Full **CRUD operations** for Products (Create, Read, Update, Delete)
* 🌐 RESTful API built with Spring Boot
* 🗄️ JPA + Hibernate for database persistence
* 🧪 **H2 Database** for development & testing
* 🏢 **Microsoft SQL Server** support for production
* 🔐 Spring Security integration
* 🧼 Clean architecture (Controller → Service → Repository)
* 📦 Maven-based build system
* ✨ Lombok for reducing boilerplate code

---

## 🛠️ Technologies Used

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
simple-web-app/
├── src/
│   ├── main/
│   │   ├── java/com/example/simplewebapp/
│   │   │   ├── controller/     # REST API controllers
│   │   │   ├── service/        # Business logic layer
│   │   │   ├── repository/     # Data access layer (JPA)
│   │   │   ├── model/          # Entity classes
│   │   │   ├── dto/            # Data Transfer Objects (optional)
│   │   │   ├── config/         # Security & configuration
│   │   │   └── SimpleWebAppApplication.java
│   │   │
│   │   └── resources/
│   │       ├── application.properties
│   │       ├── application-dev.properties
│   │       ├── application-prod.properties
│   │       └── data.sql
│   │
│   └── test/
│       └── java/com/example/simplewebapp/
│           └── SimpleWebAppApplicationTests.java
│
├── pom.xml
├── README.md
└── mvnw / mvnw.cmd
```

---

## ⚙️ Getting Started

### 1️⃣ Clone the repository

```bash
git clone https://github.com/your-username/simple-web-app.git
cd simple-web-app
```

---

### 2️⃣ Configure Database

#### ▶️ H2 (Default – Development)

No configuration needed. H2 runs in-memory automatically.

#### ▶️ Microsoft SQL Server (Production)

Update `application-prod.properties`:

```properties
spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=your_db
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.SQLServerDialect
```

---

### 3️⃣ Build the project

```bash
mvn clean install
```

---

### 4️⃣ Run the application

```bash
mvn spring-boot:run
```

The server will start at:

```
http://localhost:8080
```

---

## 📡 API Endpoints

### Product API

| Method | Endpoint             | Description             |
| ------ | -------------------- | ----------------------- |
| GET    | `/api/products`      | Get all products        |
| GET    | `/api/products/{id}` | Get product by ID       |
| POST   | `/api/products`      | Create new product      |
| PUT    | `/api/products/{id}` | Update existing product |
| DELETE | `/api/products/{id}` | Delete product          |

---

## 📦 Sample JSON Request

### Create Product

```json
{
  "name": "Laptop",
  "description": "High-performance laptop",
  "price": 1200.00
}
```

---

## 🔐 Security

Spring Security is enabled by default.

You can configure:

* Basic Authentication
* JWT (if extended)
* Role-based access control

---

## 🧪 Running Tests

```bash
mvn test
```

---

## 📌 Future Improvements

* 🔑 JWT Authentication
* 📊 Swagger/OpenAPI documentation
* 🧾 Pagination & filtering
* 🐳 Docker support
* ☁️ Cloud deployment (Azure/AWS)
* 🧪 Integration testing with Testcontainers

---

## 🤝 Contributing

Contributions are welcome!

1. Fork the project
2. Create your feature branch

   ```bash
   git checkout -b feature/new-feature
   ```
3. Commit changes

   ```bash
   git commit -m "Add new feature"
   ```
4. Push to branch

   ```bash
   git push origin feature/new-feature
   ```
5. Open a Pull Request

---

## 📄 License

This project is licensed under the MIT License.

---

## ⭐ Support

If you like this project, consider giving it a ⭐ on GitHub!

---

