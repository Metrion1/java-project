public class Student {
    private String name;
    private int id;
    private double gpa;

    public Student(String name, int id, double gpa) { //constructor the same name as the class
        this.name = name;
        this.id = id;
        if (gpa >=0.0 && gpa <=4.0) { //gpa check to make sure it is between 0.0 and 4.0
           this.gpa = gpa;     
        }
    }

    @Override
    public String toString() {
        //"Ana (ID: 1, GPA: 3.8)"
        return this.name + " (ID: " + this.id + ", GPA: " + this.gpa + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student student = (Student) obj;
        return this.id == student.id;
    }
}
