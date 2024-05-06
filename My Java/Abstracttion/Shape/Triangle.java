package Abstracttion.Shape;

public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
    
    @Override
    public double calculateArea() {
        double semiPeri = calculatePerimeter() / 2;

        return Math.sqrt(semiPeri * ((semiPeri - side1) * (semiPeri - side2) * (semiPeri - side3)));
    }

}
