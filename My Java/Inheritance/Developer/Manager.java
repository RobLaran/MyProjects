package Inheritance.Developer;

// Bonus 15$
// Performance Excellent
// Work Manage Projects

public class Manager extends Employee{
    public Manager(String name, String address, double salary, String jobTitle){
        super(name, address, salary, jobTitle);
    }

    @Override
    public double calcBonus() {
        return getSalary() * 0.15;
    }

    @Override
    public String reportPerform() {
        return "Performance Report for " + super.getJobTitle() + " " + super.getName() + ": " + "Excellent";
    }

    @Override
    public String workStatus() {
        return super.getJobTitle() + " " + super.getName() + " is managing a project"; 
    }
}
