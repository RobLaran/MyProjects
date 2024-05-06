package OOP.Shape;

public class Triangle extends Shape{

    private double firstSide;
    private double secondSide;
    private double thirdsSide;

    public Triangle(double firstSide, double secondSide, double thirdsSide){
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdsSide = thirdsSide;
    }

    public double getFirstSide(){
        return firstSide;
    }

    public double getSecondSide(){
        return secondSide;
    }

    public double getThirdSide(){
        return thirdsSide;
    }

    public double getArea(){
        double semi = getPerimeter() / 2;

        double area = Math.sqrt(semi * ((semi - firstSide) * (semi - secondSide) * (semi - thirdsSide)));
        return area;
    }

    public double getPerimeter(){
        double perimeter = firstSide + secondSide + thirdsSide;
        return perimeter;
    }


}
