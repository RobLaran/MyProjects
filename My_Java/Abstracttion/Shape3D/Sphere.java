package Abstracttion.Shape3D;

public class Sphere extends Shape3D{
    private double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateVolume(){
        return (4 / 3) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double calculateSurfaceArea(){
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
