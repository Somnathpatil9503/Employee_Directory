"# Employee_Directory" 
"# Employee_Directory" 

Employee Directory Project:

Overview:

The Employee Directory is a web application that allows users to manage a list of employees. Built using Java, Spring Boot, Thymeleaf, and MySQL, it provides functionalities to add, update, and delete employee records. The application interacts with a REST API for backend operations and uses Postman for API testing.

Technologies Used:

Java: Programming language for backend development.
Spring Boot: Framework for building the backend REST API and managing application configuration.
Thymeleaf: Server-side Java template engine for rendering HTML views.
MySQL: Relational database management system for storing employee data.
REST APIs: For CRUD operations on employee data.
Postman: Tool for testing the REST APIs.

Functionalities:

1. Adding a New Employee:
   
Feature: Clicking the "Add Employee" button opens a registration form where users can fill in details such as First Name, Last Name, Email, Mobile No, Gender, Aadhar Number, Address, Previous School Name, and Mother Name.

Implementation:

Form: A Thymeleaf template renders the registration form.
Controller: A Spring Boot controller handles the form submission. It receives employee details, saves them to the MySQL database, and then redirects the user back to the employee list.
Database: Employee data is stored in the MySQL database and can be retrieved or updated as needed.

Steps:

User clicks "Add Employee" and is navigated to a form page.
User fills out the form and clicks "Save."
The form data is sent to the backend, which saves it to the database.
The user is redirected to the employee list page, which now includes the newly added employee.


2. Updating an Employee

Feature: The employee list includes "Update" buttons next to each record. Clicking "Update" opens the registration form with pre-filled data for the selected employee.

Implementation:

Form: The same registration form is used, but it is pre-populated with the existing employee details.
Controller: A Spring Boot controller retrieves the employee details, populates the form, and handles form submission to update the employee data in the database.
Database: The existing record in the MySQL database is updated with the new information.

Steps:

User clicks "Update" next to an employee record.
The registration form opens with the employee's existing details.
User makes changes and clicks "Save."
The updated data is sent to the backend, which updates the record in the database.
The employee list is refreshed to show the updated information.

3. Deleting an Employee
   
Feature: Each employee record has a "Delete" button. 
Clicking this button removes the employee from both the UI and the database after confirmation.

Implementation:

Controller: A Spring Boot controller handles the delete request, removing the employee record from the MySQL database.
UI Update: After deletion, the employee list is refreshed to reflect the changes.

Steps:

User clicks "Delete" next to an employee record.
A confirmation prompt appears.
If confirmed, a request is sent to the backend to delete the employee record.
The record is removed from the database.
The employee list is refreshed to no longer show the deleted record.

Code Structure

1. Backend
   
Spring Boot Application: Manages the application lifecycle and configuration.
Controllers: Handle HTTP requests for adding, updating, and deleting employees.
Services: Contains business logic for managing employee data.
Repositories: Interact with the MySQL database for CRUD operations.
Models: Define the employee entity and its properties.

2. Frontend

Thymeleaf Templates: Render the HTML views for the employee list and registration forms.
CSS: Styles the UI elements to enhance the user experience.
JavaScript: Handles form validations and user interactions.

Testing

Postman: Used to test REST APIs for adding, updating, and deleting employees. Ensures that API endpoints are functioning as expected before integrating with the frontend.
Deployment
Local Development: Run the Spring Boot application locally and connect it to a local MySQL instance.
Production: Deploy the application to a server or cloud platform with a MySQL database instance.


How to Run the Project

Clone the Repository: git clone <repository-url>
Navigate to the Project Directory: cd employee-directory
Set Up the Database: Create a MySQL database and configure the connection in application.properties.

Build and Run: Use Maven or Gradle to build and run the Spring Boot application. For Maven: mvn spring-boot:run
Access the Application: Open a web browser and navigate to http://localhost:8080 to use the application.
Contribution
Contributions are welcome! Please fork the repository, make your changes, and submit a pull request.
