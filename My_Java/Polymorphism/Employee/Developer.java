package Polymorphism.Employee;

public class Developer extends Employee{
    public Developer(String name, String jobTitle, double baseSalary, double overtimePay){
        super(name, jobTitle, baseSalary, overtimePay);
    }

    @Override
    public double calcNewSalary() {
        return super.getBaseSalary() + super.getOvetimePay();
    }
}
