package Inheritance.Employee;

public class Employee {
    private float salary;

    public Employee(float salary){
        this.salary = salary;
    }

    public void work(){
        System.out.println("Employee working.");
    }

    public float getSalary(){
        return salary;
    }

}
