# Loan Management System 1 – Milestone: Backend Foundation and Database Setup

**Team Members:**  
- Golagana Vandana  
- Potu Purna Sai  
- Athikamsetti Janaki Ram  
- Aguru Sandeep  

---

# Loan Management System 1 – Milestone: Backend Foundation and Database Setup

**Team Members:**  
- Golagana Vandana  
- Potu Purna Sai  
- Athikamsetti Janaki Ram  
- Aguru Sandeep  

---


############################################################
🚀 LOAN MANAGEMENT SYSTEM – FULL STACK SETUP GUIDE
############################################################

📁 PROJECT STRUCTURE:

LoanManagementSystem/
├── backend/       👉 Spring Boot (Java 21)
└── frontend/      👉 React

------------------------------------------------------------
🔧 PREREQUISITES:
------------------------------------------------------------
✅ Java 21
✅ Maven 3.8+
✅ Node.js 18+
✅ MySQL 8.x

------------------------------------------------------------
🔙 BACKEND SETUP (Spring Boot)
------------------------------------------------------------

# Step 1: Go to backend folder
cd backend

# Step 2: Configure application.properties
# File: src/main/resources/application.properties

# --- Example DB Config (Edit accordingly) ---
# server.port=8081
# spring.datasource.url=jdbc:mysql://localhost:3306/lms_db
# spring.datasource.username=root
# spring.datasource.password=your_password
# spring.jpa.hibernate.ddl-auto=update
# spring.jpa.show-sql=true
# app.admin.secret=supersecretkey

# Step 3: Build and Run Spring Boot
mvn clean install
mvn spring-boot:run

# Access backend on:
http://localhost:8081

------------------------------------------------------------
🌐 FRONTEND SETUP (React + Vite + Tailwind)
------------------------------------------------------------

# Step 1: Go to frontend folder
cd frontend

# Step 2: Install core dependencies
npm install

# Step 3: Install additional packages used
npm install react-toastify react-icons

# Step 4: Start development server
npm run dev

# Access frontend on:
http://localhost:5173

------------------------------------------------------------
🛠️ PROJECT FEATURES SUMMARY
------------------------------------------------------------
✅ User Login & Registration with role selection (Admin/Customer)
✅ JWT-based Authentication
✅ Role-based Dashboards
✅ Protected Routes
✅ Form validation & toast notifications
✅ Admin key verification logic
✅ Modular DTO + Config + Service + Controller structure



------------------------------------------------------------
✅ DONE! You are now ready to use the Loan Management System 🎉
------------------------------------------------------------




