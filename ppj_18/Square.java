package _2324Z.wis.eng.gr39.ppj_18;

public class Square {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public void show() {
        double fieldSize = side * side;
        System.out.println("Square surface area = " + fieldSize);
        System.out.println("Volume of the cube = " + fieldSize * side);
    }

    public double getSide(){
        return side;
    }
}
