====================================================================================
💰 Loan Management System 1 – Milestone: Backend Foundation and Database Setup
====================================================================================

👨‍💻 Team Members:
-------------------
- Golagana Vandana
- Potu Purna Sai
- Athikamsetti Janaki Ram
- Aguru Sandeep

====================================================================================
🚀 Full Stack Setup Guide
====================================================================================

📁 Project Structure:
---------------------
LoanManagementSystem/
├── backend/       👉 Spring Boot (Java 21)
└── frontend/      👉 React (Vite + Tailwind)

====================================================================================
🔧 Prerequisites
----------------
Ensure the following versions are installed:

✅ Java 21  
✅ Maven 3.8+  
✅ Node.js 18+  
✅ MySQL 8.x  

====================================================================================
🔙 Backend Setup – Spring Boot
====================================================================================

📌 Step 1: Navigate to backend folder
$ cd backend

📌 Step 2: Configure the database
> Edit the file: src/main/resources/application.properties

Contents:
----------------------------------------------------------
server.port=8081
spring.datasource.url=jdbc:mysql://localhost:3306/lms_db
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
app.admin.secret=supersecretkey
----------------------------------------------------------

📌 Step 3: Build and run the backend
$ mvn clean install
$ mvn spring-boot:run

✅ Backend running at: http://localhost:8081

====================================================================================
🌐 Frontend Setup – React + Vite + Tailwind
====================================================================================

📌 Step 1: Navigate to frontend folder
$ cd ../frontend

📌 Step 2: Install dependencies
$ npm install

📌 Step 3: Install additional packages
$ npm install react-toastify react-icons

📌 Step 4: Start development server
$ npm run dev

✅ Frontend running at: http://localhost:5173

====================================================================================
🛠️ Project Features Summary
====================================================================================

✅ User Login & Registration (Admin / Customer)  
✅ JWT Authentication  
✅ Role-based Dashboards  
✅ Protected Routes  
✅ Form Validations & Toast Alerts  
✅ Admin Key Verification  
✅ Clean Code Structure:
   ├── DTO
   ├── Config
   ├── Service
   └── Controller

====================================================================================
✅ DONE! You're now ready to use the Loan Management System 🎉
====================================================================================
