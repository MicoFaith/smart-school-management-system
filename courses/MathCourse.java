package rca.smartmis;

public class MathCourse extends Course {
    public MathCourse() {
        super("Mathematics");
    }

    @Override
    public void courseInfo() {
        System.out.println("Course: " + courseName + " - Algebra, Geometry, and Calculus.");
    }
}

