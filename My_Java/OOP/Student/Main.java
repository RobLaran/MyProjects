package OOP.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Carolus Vitali", 11);
        Student student2 = new Student("Nakeisha Uhuru", 10);
        Student student3 = new Student("Gabriella Cherice", 10);

        System.out.println("Student Details:");
        student1.getStudentDetail();
        student2.getStudentDetail();
        student3.getStudentDetail();

        System.out.println("Adding courses for " + student1.getName());
        student1.addCourse("Math");
        student1.addCourse("Science");
        student1.addCourse("English");
        student1.getStudentSubs();

        System.out.println("Adding courses for " + student2.getName());
        student2.addCourse("History");
        student2.addCourse("Geography");
        student2.addCourse("English");
        student2.getStudentSubs();

        // Removing subjects
        student1.removeCourse("Science");
        System.out.println("Removed courses " + student1.getRemovedSub() + " for "  + student1.getName());
        student1.getStudentSubs();

    }
}
