package rca.smartmis;

abstract class Course {
    protected String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public abstract void courseInfo();
}
