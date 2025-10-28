# Employee Manager (React + Spring Boot)

This is a Full Stack Employee Management System built using:
- Frontend: React.js  
- Backend: Spring Boot (REST API)  
- Database: MySQL  

It allows you to Add, Edit, View, and Delete employees.

---

## Features

- Add new employees  
- Edit existing employee details  
- Delete employees  
- Fetch employee list from the backend  
- Connect React frontend with Spring Boot REST API  
- Responsive and user-friendly interface  


---

## Backend Setup (Spring Boot)

1. Open the `backend` folder in your IDE (IntelliJ / Eclipse / VS Code).
2. Configure your MySQL database in  
   `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update




