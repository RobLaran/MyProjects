package OOP.School;

import java.util.ArrayList;

public class School {

    private ArrayList<Class> classes;
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;

    public School(){
        classes = new ArrayList<Class>();
        teachers = new ArrayList<Teacher>();
        students = new ArrayList<Student>();
    }

    public void addClass(Class className){
        classes.add(className);
    }

    public void removeClass(Class className){
        classes.remove(className);
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher){
        teachers.remove(teacher);
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public ArrayList<Class> allClasses(){
        return classes;
    }

    public ArrayList<Teacher> allTeachers(){
        return teachers;
    }

    public ArrayList<Student> allStudents(){
        return students;
    }
    
}
