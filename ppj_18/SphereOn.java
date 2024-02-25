package _2324Z.wis.eng.gr39.ppj_18;

public class SphereOn {

    private double radius;

    public SphereOn(Square square) {
        radius = square.getSide() * Math.sqrt(3) / 2;
    }

    public SphereOn(Cylinder cylinder) {
        radius = Math.sqrt(Math.pow(cylinder.getHeight(), 2) + Math.pow(cylinder.getRadius() * 2, 2));
    }

    public  void show(){
        System.out.println("radius = "+radius);
    }
}
