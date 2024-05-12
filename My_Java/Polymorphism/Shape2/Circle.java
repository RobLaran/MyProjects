package Polymorphism.Shape2;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void draw(){
        System.out.println("Drawing a Circle.");
    }

    public double calculateArea(){
        return Math.PI * Math.pow(radius, 2);
    }

}
