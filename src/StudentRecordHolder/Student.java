package StudentRecordHolder;


public class Student {
    private int id;
    private String name;
    private double Gpa;

    public Student(int id, String name, double Gpa) {
        this.id = id;
        this.name = name;
        this.Gpa = Gpa;
    }

    // Getters
    public int getId() { return id; }
    public String getName() { return name; }
    public double getGpa() { return Gpa; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setGpa(double gpa) { this.Gpa = gpa; }

    @Override
    public String toString() {
        return "Student(ID: " + id + ", Name: " + name + ", Gpa: " + Gpa + ")";
    }
}

