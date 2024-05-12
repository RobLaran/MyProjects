package Polymorphism.Vehicle;

public class Car extends Vehicle{
    public void speedUp(){
        super.speedUp();
        System.out.println("Car is speeding up by 12 units.");
    }
}
