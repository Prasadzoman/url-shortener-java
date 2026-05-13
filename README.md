
---

# README.md — Spring-Shortener (High-Performance URL Service)

```md
# Spring-Shortener 🔗
A high-performance URL shortening service built using Java, Spring Boot, and MySQL.

## 📌 Overview
Spring-Shortener is a scalable RESTful URL shortening service that converts long URLs into compact short links using custom Base62 encoding.  
The application follows a clean layered architecture and is optimized for fast redirection performance.

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
