University Management System 
Project Description
This project is a Java-based University Management System designed to demonstrate Object-Oriented Programming (OOP) concepts.

The system models a simple university environment with different types of people such as students, lecturers, and administrators.

The project demonstrates the following OOP concepts:
- Encapsulation
- Inheritance
- Abstraction
- Interfaces
- Method overriding
- Constructors
- Use of `this` and `super`

Classes Implemented

Abstract Classes:
- Person
- Staff

Interfaces:
- Payable
- Registrable

Concrete Classes:
- Student
- Lecturer
- Administrator

Main Class:
- UniversityMain

Activity 3 Improvements

This version improves the previous project by adding:

 1. Dynamic User Input
The program now allows users to enter student information at runtime using the `Scanner` class.

Example inputs include:
- Student name
- Student ID
- Course
- Fee amount

 2. Exception Handling
Exception handling was implemented to prevent the program from crashing when incorrect input is entered.

The following blocks were used:

`try`
Used to run code that may cause an error during user input.

`catch`
Handles errors such as entering text where a number is expected.

`finally`
Ensures the program finishes safely and closes resources like the Scanner object.

Example Exception

If a user enters text instead of a number for the student ID or fee, the program catches the error and displays a message instead of crashing.

Conclusion

This project demonstrates how Java OOP concepts can be combined with user input and exception handling to build a more robust and interactive application.
