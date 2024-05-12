package OOP.Shape;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
    
    public double getArea(){
        double area = Math.pow(radius, 2) * Math.PI;
        return area;
    }

    public double getPerimeter(){
        double perimeter = radius * (2 * Math.PI);
        return perimeter;
    }

}
