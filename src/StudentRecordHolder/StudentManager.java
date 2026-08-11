package StudentRecordHolder;

import java.util.ArrayList;

public class StudentManager {

    private ArrayList<Student> students = new ArrayList<>();

    // Add student (with duplicate ID check)
    public boolean addStudent(Student s) {
        if (findStudentById(s.getId()) != null) {
            return false; // duplicate ID
        }
        students.add(s);
        return true;
    }

    // List all students
    public void listStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
    }

    // Search student by ID
    public Student findStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) return s;
        }
        return null;
    }

    // Update student
    public boolean updateStudent(int id, String newName, double newGpa) {
        Student s = findStudentById(id);
        if (s == null) return false;

        s.setName(newName);
        s.setGpa(newGpa);
        return true;
    }

    // Remove student
    public boolean removeStudent(int id) {
        Student s = findStudentById(id);
        if (s == null) return false;

        students.remove(s);
        return true;
    }

    // Recursive count (example recursion requirement)
    public int countStudentsRecursive(int index) {
        if (index >= students.size()) return 0; // base case
        return 1 + countStudentsRecursive(index + 1); // recursive step
    }

    public Student findStudentByName(String name) {
        for (Student s : students) {
            if (s.getName().equals(name)) {
                return s;
            }
        }
        return null;
    }
}

