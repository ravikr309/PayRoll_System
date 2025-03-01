**Payroll System Project**

This project implements a simple payroll system in Java to manage full-time and part-time employees, calculate their salaries, and manage employee data. It demonstrates the use of object-oriented principles such as inheritance, abstraction, and polymorphism.

Features
Employee Management: The system manages full-time and part-time employees.
Salary Calculation: It calculates the salary based on the type of employee:
Full-time employees have a fixed monthly salary.
Part-time employees' salaries are calculated based on the number of hours worked and hourly rate.
Add/Remove Employees: You can add new employees and remove existing ones from the payroll system.
Display Employees: The payroll system displays details of all employees including their name, ID, and calculated salary.
Project Structure
Abstract Class - Employee:

Contains common attributes (name and id) and an abstract method claculateSalary() for salary calculation.
FulltimeEmployee Class:

Inherits from Employee and implements the claculateSalary() method, returning the fixed monthly salary.
PartTimeEmployee Class:

Inherits from Employee and implements the claculateSalary() method, returning the calculated salary based on hours worked and hourly rate.
PayRollSystem Class:

Manages a list of employees and provides functionality to add, remove, and display employees.
App Class:

Contains the main() method to run the application, demonstrate adding/removing employees, and display employee details.
