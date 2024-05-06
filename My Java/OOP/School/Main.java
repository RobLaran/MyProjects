package OOP.School;

public class Main {
    public static void main(String[] args) {
        School SJC = new School();
        Class schoolClass1 = new Class("Mathematics", "Jens Amalia");
        Class schoolClass2 = new Class("English", "Elise Giiwedin");
        Class schoolClass3 = new Class("Science", "Angelika Lotta");
       
        Teacher teacher1 = new Teacher("Jens Amalia", "Mathematics");
        Teacher teacher2 = new Teacher("Elise Giiwedin", "English");
        Teacher teacher3 = new Teacher("Angelika Lotta", "Science");

        Student student1 = new Student("Mats Yatzil", 15);
        Student student2 = new Student("Karolina Ralf", 16);
        Student student3 = new Student("Felicie Anuschka", 16);
        Student student4 = new Student("Norbert Micha", 15);

        // Add Classes in School
        SJC.addClass(schoolClass1);
        SJC.addClass(schoolClass2);
        SJC.addClass(schoolClass3);


        // Add Teachers in School
        SJC.addTeacher(teacher1);
        SJC.addTeacher(teacher2);
        SJC.addTeacher(teacher3);

        // Add Students in School
        SJC.addStudent(student1);
        SJC.addStudent(student2);
        SJC.addStudent(student3);
        SJC.addStudent(student4);

        // Class 1 Students
        schoolClass1.addStudent(student1);
        schoolClass1.addStudent(student2);
        schoolClass1.addStudent(student3);
        schoolClass1.addStudent(student4);

        // Class 2 Students
        schoolClass2.addStudent(student1);
        schoolClass2.addStudent(student4);
        schoolClass2.addStudent(student3);

        // Class 3 Students
        schoolClass3.addStudent(student1);
        schoolClass3.addStudent(student2);
        schoolClass3.addStudent(student3);
        schoolClass3.addStudent(student4);

        System.out.println("School Information:");
        System.out.println("Number of students: " + SJC.allStudents().size());
        System.out.println("Number of teachers: " + SJC.allTeachers().size());
        System.out.println("Number of classes: " + SJC.allClasses().size() + "\n");
        

        // Class 1
        System.out.println(schoolClass1.getClassName() + " class information:");
        System.out.println("Class name: " + schoolClass1.getClassName());
        System.out.println("Teacher: " + schoolClass1.getTeacherName());
        System.out.println("Number of students: " + schoolClass1.getStudents().size() + "\n");

        // Class 2
        System.out.println(schoolClass2.getClassName() + " class information:");
        System.out.println("Class name: " + schoolClass2.getClassName());
        System.out.println("Teacher: " + schoolClass2.getTeacherName());
        System.out.println("Number of students: " + schoolClass2.getStudents().size() + "\n");

        // Class 3
        System.out.println(schoolClass3.getClassName() + " class information:");
        System.out.println("Class name: " + schoolClass3.getClassName());
        System.out.println("Teacher: " + schoolClass3.getTeacherName());
        System.out.println("Number of students: " + schoolClass3.getStudents().size() + "\n");

        // Removing one student, teacher and class
        SJC.removeClass(schoolClass2);
        SJC.removeStudent(student4);
        SJC.removeTeacher(teacher1);

        System.out.println("School information after removing one student, teacher and Class:");
        System.out.println("Number of students: " + SJC.allStudents().size());
        System.out.println("Number of teachers: " + SJC.allTeachers().size());
        System.out.println("Number of classes: " + SJC.allClasses().size());

    }
}
