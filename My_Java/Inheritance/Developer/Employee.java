package Inheritance.Developer;

public abstract class Employee {
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle){
        this.name  = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }

    public double getSalary(){
        return salary;
    }

    public String getJobTitle(){
        return jobTitle;
    }

    public abstract double calcBonus();
    public abstract String reportPerform();
    public abstract String workStatus();


}
