package Encapsulation.Employee;

public class Employee {
    private int idNumber;
    private String name;
    private double salary;

    public int getId(){
        return idNumber;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public void setId(int id){
        this.idNumber = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    public String formattedSalary(){
        return String.format("$%.2f", salary);
    }
}
