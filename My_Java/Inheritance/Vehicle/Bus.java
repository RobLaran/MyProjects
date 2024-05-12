package Inheritance.Vehicle;

public class Bus extends Vehicle{
    private int numSeats;

    public Bus(String make, String model, int year, String fuelType, double fuelEfficiency, int numSeats){
        super(make,model,year,fuelType,fuelEfficiency);
        this.numSeats = numSeats;
    }

    public int getNumSeats(){
        return numSeats;
    }

    @Override
    public double calcFuelEfficiency() {
        return getFuelEfficiency()*(1.0 / (1.0 + (getNumSeats() / 5.0)));
    }

    @Override
    public double calcDistanceTravel() {
        return getFuelEfficiency() * calcFuelEfficiency();
    }

    @Override
    public double getMaxSpeed() {
        return 120;
    }

}
