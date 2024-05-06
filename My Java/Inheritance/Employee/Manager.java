package Inheritance.Employee;

public class Manager extends Employee{

    public Manager(float salary){
        super(salary);
    }

    public void work(){
        System.out.println("Manager working!");
    }

    public void addEmploy(){
        System.out.println("Adding Employee.");
    }
}
