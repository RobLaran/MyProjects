package Inheritance.Vehicle;

public class Motorcycle extends Vehicle{
    private double engineDisplace;

    public Motorcycle(String make, String model, int year, String fuelType, double fuelEfficiency){
        super(make,model,year,fuelType,fuelEfficiency);
    }

    public double getEngine(){
        return engineDisplace;
    }

    @Override
    public double calcFuelEfficiency() {
        return getFuelEfficiency()*(1.0 / (1.0 + (getEngine() / 1000.0)));
    }

    @Override
    public double calcDistanceTravel() {
        return getFuelEfficiency() * calcFuelEfficiency();
    }

    @Override
    public double getMaxSpeed() {
        return 80;
    }
}
