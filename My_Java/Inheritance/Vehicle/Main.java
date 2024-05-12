package Inheritance.Vehicle;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("Tatra", "Tatra 810 4x4", 2020, "GASOLINE", 8.112, 4.5);
        Motorcycle motorcycle = new Motorcycle("Massimo Motor", "Warrior 200", 2018, "GASOLINE", 2.1);
        Bus bus = new Bus("Volkswagen", "Virtus", 2019, "HYBRID", 6.123, 8);


        System.out.println("Truck Model: " + truck.getModel());
        System.out.println("Fuel Efficiency: " + truck.calcFuelEfficiency() + "mpg");
        System.out.println("Distance Travelled: " + truck.calcDistanceTravel() + "miles");
        System.out.println("Max Speed: " + truck.getMaxSpeed() + "mph" + "\n");

        System.out.println("MOtorcycle Model: " + motorcycle.getModel());
        System.out.println("Fuel Efficiency: " + motorcycle.calcFuelEfficiency() + "mpg");
        System.out.println("Distance Travelled: " + motorcycle.calcDistanceTravel() + "miles");
        System.out.println("Max Speed: " + motorcycle.getMaxSpeed() + "mph" + "\n");

        System.out.println("Bus Model: " + bus.getModel());
        System.out.println("Fuel Efficiency: " + bus.calcFuelEfficiency() + "mpg");
        System.out.println("Distance Travelled: " + bus.calcDistanceTravel() + "miles");
        System.out.println("Max Speed: " + bus.getMaxSpeed() + "mph");
    }
}
