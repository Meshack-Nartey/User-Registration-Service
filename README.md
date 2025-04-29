# User Registration Service 🚀

This is a backend project built with **Spring Boot**, designed as part of my learning journey through the **CodeWithMosh** course. It demonstrates core Spring Boot concepts such as dependency injection, bean creation, and annotation-based configuration.

## 🔧 Features

- Register a new user
- In-memory data storage using `HashMap`
- Validation to prevent duplicate user registration
- Custom error handling using `IllegalArgumentException`

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring Core Annotations (`@Component`, `@Service`, `@Primary`, `@Value`)
- In-memory data structure (`HashMap`)

## 📦 How It Works

1. The user sends a registration request.
2. The service checks if the user already exists in the repository.
3. If the user exists, an `IllegalArgumentException` is thrown with a relevant error message.
4. If not, the user is successfully saved.
