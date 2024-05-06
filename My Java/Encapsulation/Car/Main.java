package Encapsulation.Car;

// Write a Java program to create a class called Car with private instance variables company_name, model_name, year, and mileage. Provide public getter and setter methods to access and modify the company_name, model_name, and year variables. However, only provide a getter method for the mileage variable.

// The getMileage() method is a public getter method that allows other classes to access mileage values. However, no setter method is provided for mileage, meaning it cannot be modified outside the Car class.

// Company Name: Chevrolet
// Model Name: Cruze
// Year: 2009
// Mileage: 0.0

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.setCompany("Chevrolet");
        car.setModel("Cruze");
        car.setYear(2009);

        System.out.println("Company Name: " + car.getCompany());
        System.out.println("Model Name: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Mileage: " + car.getMileage());
        
    }
}
