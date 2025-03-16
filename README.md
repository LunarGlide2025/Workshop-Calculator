# Calculator Application
Your task is to create a console-based calculator application that allows users to perform basic mathematical operations such as addition, subtraction, multiplication, and division. The application should fulfill the following requirements:

# Objectives:
#### • Implement the calculator application as a Maven project.
#### • The calculator should support addition, subtraction, multiplication, and division operations. Users should be able to enter the numbers and the operator to perform the desired operation.
#### • The program should continue running until the user chooses to end it. After each operation, the user should have the option to perform another calculation or exit the program.

# Optional:
#### • The addition and subtraction operations should be able to handle any number of operands.
#### • Implement proper exception handling to handle any errors or invalid inputs entered.
#### • Write JUnit tests to verify the correctness of each mathematical operation.

# Submission:
#### Upload on GitHub then send the repository link to your teacher.

----------------------------------------------------------------------

# What I Have Done / My Solution:

## Project Structure & Classes:

### The program runs in a loop so users can perform new calculations or exit anytime!

### Arithmetics: 
#### Contains methods for addition, subtraction, multiplication, division, and modulus.

### Calculator: 
#### Handles user input and calls the correct method from Arithmetics.

### Main: 
#### Starts the program by creating a Calculator and running it in a loop.

## Methods for Operations:
#### Every math operation is written as a separate method in the Arithmetics class.
#### I added modulus as bonus.

## Support for Multiple Numbers:
#### The addition and subtraction methods can handle several numbers at once.

## Error Handling:
#### I have implemented exception handling. 
#### The program checks for mistakes like dividing by zero or wrong inputs and shows error messages instead of crashing.

## JUnit tests:
#### I have added unit tests.