package Encapsulation.Car;

public class Car {
    private String company;
    private String model;
    private int year;
    private double mileage = 0;

    public String getCompany(){
        return company;
    }

    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public double getMileage(){
        return mileage;
    }

    public void setCompany(String name){
        this.company = name;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }

    


}
