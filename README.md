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

### 🗂️ Backend Folder Structure
- `config/`: (Optional) Configuration beans
- `controller/`: REST controllers (to be developed)
- `model/`: JPA entity classes
- `repository/`: Spring Data JPA repositories
- `scheduler/`: Placeholder for EMI reminders
- `service/`: Business logic (upcoming)
- `utils/`: Helper classes
- `resources/`: Includes `application.properties`
- `BackendApplication.java`: Main entry point

### 🛢️ Database Setup (MySQL)
- Database: `lms_db`
- Connection verified via `application.properties`
- JPA auto-generated tables upon running application
- Entities implemented:
  - `User`, `LoanType`, `Loan`, `EMIPayment`, `Penalty`, `OTPLog`, `ApplicationStatusHistory`

### ⚛️ Frontend – React App Initialization
- React app created using `npx create-react-app frontend`
- Modular folder structure applied for scalability

#### Frontend Folder Structure:
- `assets/`: Static files (images, icons)
- `components/`
  - `global/`: Shared UI elements (e.g., Header, Sidebar)
  - `auth/`, `loan/`: Feature-specific components
- `routes/`: Centralized React Router setup
- `services/`: Axios-based API services
- `styles/`: 
  - `global.css`: Common styles
  - `modules/`: Scoped CSS
- `utils/`: Helper functions

---

## 📌 Summary

| Task | Status |
|------|--------|
| Spring Boot project setup | ✅ Completed |
| Backend folder structure | ✅ Completed |
| MySQL DB setup and integration | ✅ Verified |
| JPA entities & repositories | ✅ Implemented |
| React app setup & structure | ✅ Completed |

---

## 📁 Branch Note

This `dev` branch includes integrated contributions from all four developers, merged from their respective frontend and backend branches.

