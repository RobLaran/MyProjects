package Encapsulation.Circle;

public class Circle {
    private double radius;

    public double getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = (double)radius;
    }

    public double calculateArea(){
        double area = Math.PI * (Math.pow(radius, 2));

        return area;
    }

    public double calculatePerimeter(){
        double perimeter = 2 * Math.PI * radius;

        return perimeter;   
    }

}
