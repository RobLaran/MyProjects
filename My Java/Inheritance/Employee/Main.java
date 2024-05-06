package Inheritance.Employee;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(4300);
        Manager man = new Manager(6000);

        emp.work();
        System.out.println("Employee salary: " + emp.getSalary());

        man.work();
        System.out.println("Manager salary: " + man.getSalary());

        man.addEmploy();
    }
}
