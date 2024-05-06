package Polymorphism.Employee;

public class Main {
    public static void main(String[] args) {
        Employee man = new Manager("Lilo Heidi", "Manager", 7500.0, 1500.0);
        Employee dev = new Developer("Margrit Cathrin", "Programmer", 5000.0, 600.0);

        System.out.println("Head Manager: " + man.getName());
        System.out.println("Role: " + man.getRole());
        System.out.println("Salary: $" + man.calcNewSalary() + "\n");

        System.out.println("Devekoper/Programmer: " + dev.getName());
        System.out.println("Role: " + dev.getRole());
        System.out.println("Salary: $" + dev.calcNewSalary());
    }
}
