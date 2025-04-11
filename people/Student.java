package rca.smartmis;

public class Student extends Person{
private int gradeLevel;
public Student(String name, int age, int gradeLevel) {
    super(name, age);
    this.gradeLevel = gradeLevel;
}

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    @Override
    public void displayRole() {
        System.out.println("Student " + getName() + " is a student in " + getGradeLevel());
    }
}
