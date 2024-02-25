package _2324Z.wis.eng.gr39.ppj_18;

public class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void show() {
        double fieldSize = Math.PI * Math.pow(radius, 2);
        System.out.println("Square surface area = " + fieldSize);
        System.out.println("Volume of the cube = " + fieldSize * height);
    }

    public double getRadius(){
        return radius;
    }

    public double getHeight(){
        return height;
    }

}
