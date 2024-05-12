package OOP.School;

import java.util.ArrayList;

public class Class {

    private String schoolClass;
    private String teacher;
    private ArrayList<Student> students;

    public Class(String sub, String teacher){
        this.schoolClass = sub;
        this.teacher = teacher;
        students = new ArrayList<Student>();
    }

    public String getTeacherName(){
        return teacher;
    }

    public String getClassName(){
        return schoolClass;
    }

    public void setTeacherName(String name){
        this.teacher = name;
    }

    public void setClassName(String name){
        this.schoolClass = name;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(Student student){
        students.remove(student);
    }

    public ArrayList<Student> getStudents(){
        return students;
    }
}
