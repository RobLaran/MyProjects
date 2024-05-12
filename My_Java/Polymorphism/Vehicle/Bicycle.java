package Polymorphism.Vehicle;

public class Bicycle extends Vehicle{
    public void speedUp(){
        super.speedUp();
        System.out.println("Bicycle speeding up by 10 units.");
    }
}
