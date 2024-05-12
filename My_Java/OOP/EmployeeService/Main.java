package OOP.EmployeeService;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Roberta Petrus",50000, "2021-04-01");
        Employee employee2 = new Employee("Lloyd Blair",70000, "2015-04-01");
        Employee employee3 = new Employee("Magdalena Artemon",50000, "2011-01-15");
        
        employee1.employeeDetails();
        System.out.println();
        employee2.employeeDetails();
        System.out.println();
        employee3.employeeDetails();

    }

}
