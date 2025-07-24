# Loan Management System 1 – Milestone: Backend Foundation and Database Setup

**Team Members:**  
- Golagana Vandana  
- Potu Purna Sai  
- Athikamsetti Janaki Ram  
- Aguru Sandeep  

---

## ✅ Objective

Establish the backend foundation for the Loan Management System using Spring Boot, implement the initial normalized database schema, and initialize a structured React frontend for future UI development.

---

## 🚀 Deliverables Completed

### 🔧 Backend – Spring Boot Setup
- Spring Boot project initialized via [Spring Initializr](https://start.spring.io)
- Dependencies added:
  - Spring Web
  - Spring Data JPA
  - MySQL Driver
  - Lombok
  - Spring Boot DevTools
- Application configured with Java 21 and Maven

<img width="1712" height="760" src="https://github.com/user-attachments/assets/9f58d32f-1259-4735-afaa-e46e4d20b842" alt="springInitializer" />

### 🗂️ Backend Folder Structure

<table>
  <tr>
    <td><img width="400" height="731" src="https://github.com/user-attachments/assets/4b58b363-bc66-48e4-9ebf-08f0718f89d9" alt="Frontend base folder" /></td>
    <td><img width="400" height="716" src="https://github.com/user-attachments/assets/a2047d4b-936c-42b0-9fa3-3e9bf53d2e96" alt="ui components folders" /></td>
  </tr>
</table>

- `config/`: Configuration beans  
- `controller/`: REST endpoints (to be developed)  
- `model/`: JPA entity classes  
- `repository/`: Spring Data JPA interfaces  
- `scheduler/`: EMI reminder logic (future)  
- `service/`: Business logic (next milestone)  
- `utils/`: Helper classes  
- `resources/`: Contains application.properties  
- `BackendApplication.java`: Entry point

---

### 🛢️ Database Setup (MySQL)
- Database: `lms_db`
- Connection verified via `application.properties`
- JPA auto-generated tables on run
- Entities: `User`, `Loan`, `LoanType`, `EMIPayment`, `Penalty`, `OTPLog`, `ApplicationStatusHistory`
- 
<table>
  <tr>
    <td><img width="400" height="192" src="https://github.com/user-attachments/assets/18a85a9e-8206-4ca7-9810-1b19df677101" alt="Backend Image 1" /></td>
    <td><img width="800" height="930" src="https://github.com/user-attachments/assets/f4e509a4-c7aa-458b-81eb-23557993114d" alt="Backend Image 2" /></td>
  </tr>
</table>

---

### ⚛️ Frontend – React App Initialization

React app scaffolded using `npx create-react-app frontend`. Folder structure refined for modularity and scalability.

### 🗂️ Frontend Folder Structure



<table>
  <tr>
    <td><img width="400" height="731" src="https://github.com/user-attachments/assets/4b58b363-bc66-48e4-9ebf-08f0718f89d9" alt="Frontend base folder" /></td>
    <td><img width="400" height="716" src="https://github.com/user-attachments/assets/a2047d4b-936c-42b0-9fa3-3e9bf53d2e96" alt="ui components folders" /></td>
  </tr>
</table>

#### Key Directories:
- `components/`:  
  - `global/`: Reusable UI (Header, Sidebar)  
  - `auth/`, `loan/`: Feature-specific components  
- `pages/`: Screen-level containers  
- `routes/`: Routing setup via React Router  
- `services/`: Axios-based API services  
- `styles/`:  
  - `global.css`: Shared styles  
  - `modules/`: Scoped module CSS  
- `utils/`: Frontend helper functions  

---

## 📌 Milestone Summary

| Task | Status |
|------|--------|
| Spring Boot project setup | ✅ Completed |
| Backend folder structure | ✅ Completed |
| MySQL DB setup and integration | ✅ Verified |
| JPA entities & repositories | ✅ Implemented |
| React app setup & structure | ✅ Completed |

---

## 📁 Branch Note

This `dev` branch includes merged work from all individual frontend and backend branches contributed by all four developers.


