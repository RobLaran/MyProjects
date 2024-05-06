package Inheritance.Vehicle;

public class Truck extends Vehicle{
    private double cargoCap;

    public Truck(String make, String model, int year, String fuelType, double fuelEfficiency, double cargoCap){
        super(make,model,year,fuelType,fuelEfficiency);
        this.cargoCap = cargoCap;
    }

    public double getCargoCap(){
        return cargoCap;
    }

    public double calcFuelEfficiency(){
        return getFuelEfficiency()*(1.0 / (1.0 + (getCargoCap() / 1000.0)));
    }

    public double calcDistanceTravel(){
        return getFuelEfficiency() * calcFuelEfficiency();
    }

    public double getMaxSpeed(){
        return 80;
    }
    

}
