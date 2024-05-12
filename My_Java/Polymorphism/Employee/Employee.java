package Polymorphism.Employee;

public abstract class Employee {
    private String name;
    private String jobTitle;
    private double baseSalary;
    private double overtimePay;

    public Employee(String name, String jobString, double baseSalary, double overtimePay){
        this.name = name;
        this.jobTitle = jobString;
        this.baseSalary = baseSalary;
        this.overtimePay = overtimePay;
    }

    public String getName(){
        return name;
    }

    public String getRole(){
        return jobTitle;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    public double getOvetimePay(){
        return overtimePay;
    }

    public abstract double calcNewSalary();

}
