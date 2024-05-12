package OOP.Employee;

public class Employee {

    private String name;
    private String title;
    private double salary;
    private double raise;

    public Employee(String name, String title,double salary){
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public String getTitle(){
        return title;
    }

    public double getSalary(){
        return salary;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public double getRaise(){
        return raise;
    }

    public void raiseSalary(double percent){
        raise = percent;
        salary = salary + salary * percent / 100;
    }

    public void employeeDetails(){
        System.out.println("Name: " + this.name);
        System.out.println("Job Title: " + this.title);
        System.out.println("Salary: " + this.salary);
    }

}
