package Abstracttion.Shape3D;

public class Cube extends Shape3D{
    private double sidelength;

    public Cube(double sidelength){
        this.sidelength = sidelength;
    }

    @Override
    public double calculateVolume(){
        return Math.pow(sidelength, 3);
    }

    @Override
    public double calculateSurfaceArea(){
        return 6 * Math.pow(sidelength, 2);
    }
}
