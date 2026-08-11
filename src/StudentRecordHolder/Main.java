package StudentRecordHolder;

import java.util.Scanner;

public class Main {

    private static void runTestCases(StudentManager manager) {
    System.out.println("\n=== Running Automated Test Cases ===");

    // 1. Add students
    manager.addStudent(new Student(1, "Mario Mario", 2.4));
    manager.addStudent(new Student(2, "Bob Builder", 3.0));
    manager.addStudent(new Student(3, "Dora Explorer", 2.8));

    // 2. List students
    System.out.println("\nList Students:");
    manager.listStudents();

    // 3. Search existing
    System.out.println("\nSearch ID 2:");
    System.out.println(manager.findStudentById(2));

    // 4. Search non-existing
    System.out.println("\nSearch ID 99:");
    System.out.println(manager.findStudentById(99));

    // 5. Update student
    System.out.println("\nUpdate ID 3:");
    manager.updateStudent(3, "Carlito Domingo", 3.1);
    System.out.println(manager.findStudentById(3));

    // 6. Remove student
    System.out.println("\nRemove ID 1:");
    manager.removeStudent(1);
    manager.listStudents();

    // 7. Recursive count
    System.out.println("\nRecursive Count:");
    System.out.println(manager.countStudentsRecursive(0));

    // 8. Duplicate ID test
    System.out.println("\nAdd duplicate ID 2:");
    boolean added = manager.addStudent(new Student(2, "Duplicate", 50));
    System.out.println("Added? " + added);
}



    public static void main(String[] args) { // main method to run the program
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        runTestCases(manager);

        while (true) { // infinite loop for menu with options to choose from
            System.out.println("\n=== Student Record Menu ===");
            System.out.println("1. Add Student");
            System.out.println("2. List Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Remove Student");
            System.out.println("6. Count Students (Recursive)");
            System.out.println("7. Quit");
            System.out.print("Choose an option: ");

            int choice = readInt(scanner);

            switch (choice) { // switch statement to handle user choices
                case 1 -> addStudent(scanner, manager); 
                case 2 -> manager.listStudents(); // list all students
                case 3 -> searchStudent(scanner, manager); // search for a student by ID
                case 4 -> updateStudent(scanner, manager); // update student information
                case 5 -> removeStudent(scanner, manager); // remove a student by ID
                case 6 -> { 
                    int count = manager.countStudentsRecursive(0); // count students recursively
                    System.out.println("Total students (recursive): " + count);
                }
                case 7 -> {
                    System.out.println("Goodbye!"); // exit the program
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice."); // handle invalid menu choices
            }
        }
    }

    // Input validation for integers
    private static int readInt(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine()); // parse input as integer (google gave me the parseInt method)
            } catch (Exception e) {
                System.out.print("Invalid number. Try again: ");
            }
        }
    }

    // Input validation for doubles
    private static double readDouble(Scanner scanner) {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine()); // parse input as double (google gave me the parseDouble method)
            } catch (Exception e) {
                System.out.print("Invalid number. Try again: ");
            }
        }
    }

    private static void addStudent(Scanner scanner, StudentManager manager) { // method to add a new student
        System.out.print("Enter ID: ");
        int id = readInt(scanner);

        if (manager.findStudentById(id) != null) { // check for duplicate ID
            System.out.println("Error: ID already exists.");
            return;
        }

        System.out.print("Enter name: "); // read the student's name from user input
        String name = scanner.nextLine();

        System.out.print("Enter Gpa: "); // read the student's Gpa from user input
        double gpa = readDouble(scanner);

        manager.addStudent(new Student(id, name, gpa)); // create a new Student object and add it to the manager
        System.out.println("Student added.");
    }

    private static void searchStudent(Scanner scanner, StudentManager manager) { // method to search for a student by name
        System.out.print("Enter ID to search: ");
        int id = readInt(scanner);

        Student s = manager.findStudentById(id); // find the student by ID using the manager
        if (s == null) System.out.println("Student not found.");
        else System.out.println(s);
    }

    private static void updateStudent(Scanner scanner, StudentManager manager) { // method to update a student's information
        System.out.print("Enter ID to update: ");
        int id = readInt(scanner);

        Student s = manager.findStudentById(id); // find the student by ID using the manager
        if (s == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter new name: "); // read the new name for the student from user input
        String name = scanner.nextLine();

        System.out.print("Enter new Gpa: "); // read the new Gpa for the student from user input
        double gpa = readDouble(scanner);

        manager.updateStudent(id, name, gpa);// update the student's information using the manager
        System.out.println("Student updated.");
    }

    private static void removeStudent(Scanner scanner, StudentManager manager) {// method to remove a student by ID
        System.out.print("Enter ID to remove: ");
        int id = readInt(scanner);

        if (manager.removeStudent(id)) { // remove the student using the manager
            System.out.println("Student removed.");
        } else {
            System.out.println("Student not found.");
        }
    }

}
