package Polymorphism.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bicycle();

        System.out.println("Car initial speed: " + car.getSpeed());
        System.out.println("Bike initial speed: " + bike.getSpeed());
        car.speedUp();
        bike.speedUp();
        System.out.println("Car speed after speeding up: " + bike.getSpeed());
        System.out.println("Bike speed after speeding up: " + bike.getSpeed());

    }
}
