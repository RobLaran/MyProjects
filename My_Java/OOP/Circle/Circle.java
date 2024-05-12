package OOP.Circle;

public class Circle {
    private double radius;
    private final double pi = Math.PI;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        double area = pi * Math.pow(radius, 2);

        return area;
    }

    public double getCircumference(){
        double circumference = 2  * pi * radius;

        return circumference;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
}
