# Student Record Holder #
## StudentsRecordHolder
 ├── Student.java          # Student data model
 ├── StudentManager.java   # Handles storage and operations
 └── Main.java             # Menu, input handling, and program entry point

 ###  Add Student
Prompts for ID, name, and score

Prevents duplicate IDs

Validates numeric input

List Students
Displays all stored students

Shows a message if the list is empty

Search Student
Search by ID

Prints the student or “not found”

Update Student
Change names and score for an existing student

Remove Student
Deletes a student by ID

Recursive Count
Counts all students using a recursive method:

#### How to run the Program.
Open File in VSCode
-Compile the program-
javac StudentsRecordHolder/*.java
-Run the Program-
java StudentsRecordHolder.Main
-Use the Menu-
=== Student Record Menu ===
1. Add Student
2. List Students
3. Search Student
4. Update Student
5. Remove Student
6. Count Students (Recursive)
7. Quit

-Test cases-
The program includes automated test cases that run when the program starts.
These tests:

Adding multiple students

Attempting to add a duplicate ID

Listing students

Searching existing and non-existing IDs

Updating a student

Removing a student

Recursive counting

Input validation

You can also test manually using the menu.

