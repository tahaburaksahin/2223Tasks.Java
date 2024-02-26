package _2324Z.wis.eng.gr39.ppj_19;

public class Car {

    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void show() {
        System.out.println(this.getName() + " - " + this.getPrice());
    }

    @Override
    public String toString() {
        return "Car{" +name +", " + price +'}';
    }
}
