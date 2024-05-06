package Inheritance.Employee2;

public class Employee extends Person{
    private String jobTitle;
    private int id;

    public Employee(String firstName, String lastName, String jobTitle, int id){
        super(firstName, lastName);
        this.jobTitle = jobTitle;
        this.id = id;
    }

    public int getEmployId(){
        return id;
    }

    public String getLastName(){
        return super.getLastName() + ", " + jobTitle;
    }
}
