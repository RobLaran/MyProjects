package Inheritance.Shape;


public class Rectangle extends Shape{
    private float length;
    private float width;

    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }

    public float getArea(){
        return length * width;
    }
}
