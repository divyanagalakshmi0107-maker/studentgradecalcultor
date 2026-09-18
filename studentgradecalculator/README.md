# Student Grade Calculator in Java

## Project Title

**Student Grade Calculator Using Java**

## Description

The Student Grade Calculator is a simple Java console application that calculates a student's total marks, average marks, percentage, and grade.

The program accepts the student's name, roll number, and marks in five subjects. It then calculates the result and displays the student's grade.

## Features

* Accepts student details
* Accepts marks for five subjects
* Calculates total marks
* Calculates average marks
* Calculates percentage
* Determines the grade automatically
* Displays a formatted student result
* Uses Java `Scanner` for user input

## Project Structure

```text
Student-Grade-Calculator/
│
├── StudentGradeCalculator.java
├── .gitignore
└── README.md
```

## Grading System

| Percentage | Grade |
| ---------: | :---: |
|     90–100 |   A   |
|      80–89 |   B   |
|      70–79 |   C   |
|      60–69 |   D   |
|      50–59 |   E   |
|   Below 50 |   F   |

## Example

### Input

```text
Enter student name: Rahul
Enter roll number: 101
Enter marks in Subject 1: 85
Enter marks in Subject 2: 90
Enter marks in Subject 3: 78
Enter marks in Subject 4: 88
Enter marks in Subject 5: 92
```

### Output

```text
====================================
           STUDENT RESULT
====================================
Student Name : Rahul
Roll Number  : 101
------------------------------------
Subject 1    : 85.0
Subject 2    : 90.0
Subject 3    : 78.0
Subject 4    : 88.0
Subject 5    : 92.0
------------------------------------
Total Marks  : 433.00 / 500
Average      : 86.60
Percentage   : 86.60%
Grade        : B
====================================
```

## How to Run

### Step 1: Check Java Installation

Open the terminal and run:

```bash
java --version
```

### Step 2: Compile the Program

```bash
javac StudentGradeCalculator.java
```

### Step 3: Run the Program

```bash
java StudentGradeCalculator
```

## Technologies Used

* Java
* Java Scanner
* Conditional statements
* Arithmetic operations

## Concepts Demonstrated

This project demonstrates:

* Variables
* Data types
* User input
* Arithmetic calculations
* `if-else` statements
* `printf()`
* Console output

## Future Improvements

The project can be extended to include:

* More subjects
* Multiple students
* Subject-wise grades
* Pass/fail status
* GUI interface
* File-based result storage

## Conclusion

The Student Grade Calculator successfully calculates and displays a student's total marks, average, percentage, and grade based on the marks entered by the user.

This project is suitable for beginners learning Java programming and can be used as a simple GitHub portfolio project.