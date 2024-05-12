package OOP.Employee;

public class Main {
    public static void main(String[] args) {
        
        Employee employ1 = new Employee("Franziska Waltraud", "HR Manager", 40000);
        Employee employ2 = new Employee("Hubertus Andrea", "Software Engineer", 60000);

        System.out.println("Employee Details:");
        employ1.employeeDetails();
        employ2.employeeDetails();

        employ1.raiseSalary(8);
        employ2.raiseSalary(12);

        System.out.println("\n"  + "After raising salary:");
        System.out.println(employ1.getRaise() + "% for '" + employ1.getName() + "' :");
        employ1.employeeDetails();
        System.out.println();

        System.out.println(employ2.getRaise() + "% for '" + employ2.getName() + "' :");
        employ2.employeeDetails();

    }
    
}   
