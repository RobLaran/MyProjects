package OOP.Rectangle;

public class Rectangle {

    public double width;
    private double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        double area = width * height;

        return area;
    }

    public double getPerimeter(){
        double perimeter = (2 * width) + (2 * height);

        return perimeter;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

}
