package OOP.EmployeeService;

import java.time.LocalDate;
import java.time.Period;

public class Employee {

    private String name;
    private int salary;
    private LocalDate hireDate;

    public Employee(String name, int salary, String date){
        this.name = name;
        this.salary = salary;
        this.hireDate = LocalDate.parse(date);
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

    public LocalDate getDate(){
        return hireDate;
    }

    public int getYearsService(){
        return Period.between(hireDate, LocalDate.now()).getYears();
    } 

    public void setName(String name){
        this.name = name;
    }

    public void setSalary(int amount){
        this.salary = amount;
    }

    public void setDate(String date){
        this.hireDate = LocalDate.parse(date);
    }

    public void employeeDetails(){
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Hire Date: " + hireDate);
        System.out.println("Years of Service: " + getYearsService());
    }
}
