package rca.smartmis;

public class ScienceCourse extends Course {
    public ScienceCourse() {
        super("Science");
    }

    @Override
    public void courseInfo() {
        System.out.println("Course: " + courseName + " - Physics, Chemistry, Biology.");
    }
}
