# 🚀 User Management System API

A production-ready **Java Backend REST API** built using Spring Boot that provides complete user management functionality with clean architecture and best practices.

This project demonstrates real-world backend development including layered architecture, validation, exception handling, and database interaction.

---

## 📌 Features

* ➕ Create User
* 📥 Get All Users
* 🔍 Get User by ID
* ✏️ Update User
* ❌ Delete User
* ✅ Input Validation (Email, Required Fields)
* ⚠️ Global Exception Handling
* 🧾 Clean API Response Structure

---

## 🛠️ Tech Stack

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate ORM
* H2 Database (Development)
* MySQL (Production-ready support)
* Maven

---

## 🧱 Architecture

```
Controller → Service → Repository → Database
```

### 🔹 Layers Explained

* **Controller** → Handles HTTP requests
* **Service** → Business logic
* **Repository** → Database operations
* **Entity** → Database mapping

---

## 📂 Project Structure

```
User-Management-API
│
├── controller
│     └── UserController.java
│
├── service
│     ├── UserService.java
│     └── UserServiceImpl.java
│
├── repository
│     └── UserRepository.java
│
├── model
│     └── User.java
│
├── exception
│     ├── GlobalExceptionHandler.java
│     └── ResourceNotFoundException.java
│
└── UserManagementApiApplication.java
```

---

## ⚙️ Setup & Run

### 1️⃣ Clone Repository

```
git clone repo url
cd User-Management-API
```

### 2️⃣ Run Application

```
mvn spring-boot:run
```

## 🌐 API Endpoints

### ➕ Create User

```
POST /users
```

### 📥 Get All Users

```
GET /users
```

### 🔍 Get User by ID

```
GET /users/{id}
```

### ✏️ Update User

```
PUT /users/{id}
```

### ❌ Delete User

```
DELETE /users/{id}
```

## ⚠️ Exception Handling

* User not found → `404 NOT FOUND`
* Invalid input → `400 BAD REQUEST`

---

## 🗄️ Database Configuration

### H2 (Default)

Access console:

```
http://localhost:8080/h2-console
```

### MySQL (Optional)

Update `application.properties`:

```properties 
spring.datasource.url=jdbc:mysql://localhost:3306/user_db
spring.datasource.username=root
spring.datasource.password=your_password
```

## 🚀 Future Enhancements

* 🔐 Authentication & Authorization (JWT)
* 📄 Pagination & Sorting
* 🔍 Search API
* 📊 Logging & Monitoring
* 🐳 Docker Support
* ☁️ Cloud Deployment (AWS / Render)

## 🧠 Key Learnings

* REST API Design
* Spring Boot Architecture
* Dependency Injection
* ORM with Hibernate
* Exception Handling
* Clean Code Practices

