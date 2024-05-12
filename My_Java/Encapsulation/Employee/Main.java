package Encapsulation.Employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setId(15);
        employee.setName("Caelius Dathan");
        employee.setSalary(4900);

        System.out.println("Employee Details:");
        System.out.println("ID: " + employee.getId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.formattedSalary());
    }
}
