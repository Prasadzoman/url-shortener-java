# Spring-Shortener 🔗

A high-performance URL shortening service built using Java, Spring Boot, and MySQL.

---

## 📌 Overview

Spring-Shortener is a scalable RESTful URL shortening service that converts long URLs into compact short links using custom Base62 encoding.

The application follows a clean layered architecture and is optimized for fast URL redirection performance.

---

## ✨ Features

- 🔗 URL shortening service
- ⚡ Fast URL redirection
- 🧠 Custom Base62 short-code generation
- 🗂 Indexed database lookups
- 🏗 Layered architecture
- 🌐 RESTful APIs
- 📦 MySQL persistence

---

## 🛠 Tech Stack

### Backend
- Java
- Spring Boot

### Database
- MySQL

### Tools
- Maven
- Postman

---

## 🏗 Architecture

The project follows a clean layered architecture:

```text
Controller → Service → Repository → Database
```

### Layers

#### Controller Layer
- Handles HTTP requests and responses

#### Service Layer
- Contains business logic and URL processing

#### Repository Layer
- Manages database interaction using JPA

#### Database Layer
- Stores URL mappings and metadata

---

## ⚡ Performance Optimizations

- Indexed database lookups for faster URL redirection
- Custom Base62 encoding for compact unique IDs
- Efficient request handling with Spring Boot

---

## 🚀 Getting Started

### 1️⃣ Clone Repository

```bash
git clone https://github.com/Prasadzoman/url-shortener-java.git
cd url-shortener-java
```

---

### 2️⃣ Configure Database

Update `application.properties`

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/url_shortener
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 3️⃣ Install Dependencies

```bash
mvn clean install
```

---

### 4️⃣ Run Application

```bash
mvn spring-boot:run
```

or

```bash
./mvnw spring-boot:run
```

---

## 📡 API Endpoints

### Create Short URL

```http
POST /api/url/shorten
```

### Request Body

```json
{
  "url": "https://example.com"
}
```

### Response

```json
{
  "shortUrl": "http://localhost:8080/abc123"
}
```

---

### Redirect URL

```http
GET /{shortCode}
```

---

## 📂 Project Structure

```text
src
 ┣ 📂 controller
 ┣ 📂 service
 ┣ 📂 repository
 ┣ 📂 model
 ┣ 📂 dto
 ┗ 📂 config
```

---

## 📌 Future Improvements

- 📊 Analytics dashboard
- ⚡ Redis caching
- ⏳ Expiration-based links
- 🔒 Rate limiting
- 📱 QR code generation
- 👤 User authentication

---

## 👨‍💻 Author

### Prasad Zoman

- GitHub: https://github.com/Prasadzoman
- LinkedIn: https://www.linkedin.com/in/prasad-zoman-9854882b7

---

⭐ If you found this project useful, consider giving it a star!
