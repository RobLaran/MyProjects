package OOP.Shape;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    public double getArea(){
        double area = length * width;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2 * (length + width);
        return perimeter;
    }

}
