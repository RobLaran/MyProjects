package Polymorphism.Shape;

public class Triangle extends Shape{
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double firstSide, double secondSide, double thirdSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public double getArea(){
        double semiPerim = (firstSide + secondSide + thirdSide) / 2;
        return Math.sqrt(semiPerim * ((semiPerim - firstSide) * (semiPerim - secondSide) * (semiPerim - thirdSide)));
    }

}
