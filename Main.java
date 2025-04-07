package rca.smartmis;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create people
        Person s1 = new Student("Mico", 14, 8);
        Person s2 = new Student("Faith", 15, 9);
        Person t1 = new Teacher("John", 35, "Mathematics");
        Person t2 = new Teacher("Sarah", 30, "Science");

        // Store in array
        Person[] people = {s1, s2, t1, t2};

        // Display roles
        System.out.println("Roles:");
        for (Person p : people) {
            p.displayRole();
        }

        // Create courses
        Course math = new MathCourse();
        Course science = new ScienceCourse();

        // Store in array
        Course[] courses = {math, science};

        // Display course info
        System.out.println("\nCourse Details:");
        for (Course c : courses) {
            c.courseInfo();
        }
    }
}
