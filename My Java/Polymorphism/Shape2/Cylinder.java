package Polymorphism.Shape2;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    public void draw(){
        System.out.println("Drawing a Cylinder.");
    }

    public double calculateArea(){
        double circleArea = super.calculateArea();
        double sideArea = 2 * Math.PI * getRadius() * height;
        return 2 * circleArea + sideArea;
    }

}
