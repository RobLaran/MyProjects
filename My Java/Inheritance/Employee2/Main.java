package Inheritance.Employee2;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Kortney", "Rosalee", "HR Manager", 4451);
        Employee emp2 = new Employee("Junior", "Philip", "Software Manager", 4452);

        System.out.println(emp1.getFirstName() + " " + emp1.getLastName() + " " + emp1.getEmployId());
        System.out.println(emp2.getFirstName() + " " + emp2.getLastName() + " " + emp2.getEmployId());
    }
}
