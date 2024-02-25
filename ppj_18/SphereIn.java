package _2324Z.wis.eng.gr39.ppj_18;

public class SphereIn {

    private double radius;

    public SphereIn(Square square){
        radius = square.getSide()/2;
    }
    public SphereIn(Cylinder cylinder){
        radius = cylinder.getHeight()/2 > cylinder.getRadius() ? cylinder.getRadius() : cylinder.getHeight()/2.;
    }

    public  void show(){
        System.out.println("radius = "+radius);
    }
}
