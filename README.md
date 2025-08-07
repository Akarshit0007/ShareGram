# 📷 SHAREGRAM — Instagram Basic Clone App

## 🛡️ Spring Boot User Authentication & Profile Management API

This project is a secure REST API built using **Java Spring Boot** that allows users to:

- ✅ Sign up and log in  
- ✅ View their profile  
- ✅ Update their name or bio  
- ✅ Uses Basic Authentication

---
## 📌 API Endpoints

> All routes are protected (except signup/login) using Basic Auth

| Method | Endpoint                 | Description                          | Auth Required |
|--------|--------------------------|--------------------------------------|---------------|
| `POST` | `/signup`       | Register a new user                  | ❌ No         |
| `POST` | `/login`        | Login with Basic Auth (handled by Spring Security) | ✅ Yes (Basic Auth) |
| `GET`  | `/profile`      | Get the logged-in user profile       | ✅ Yes        |
| `PUT`  | `/profile`      | Update user's name and/or bio and username       | ✅ Yes        |

✅ **Partial updates supported** – you can send just `name`, `bio`,`username` or all together in the PUT request JSON.

## 🔥 Features

- ✅ User Registration  
- ✅ User Login  
- ✅ Secure Authentication  
- ✅ Get Logged-In User Profile  
- ✅ Update Profile (Name or Bio or Username)  
- ✅ PostgreSQL Database Integration  
- ✅ Follows Clean Architecture (DTOs, Services, Controllers)  
- 🔜 More features coming soon...

---




Feel free to contribute and give a ⭐ if you like the project!

