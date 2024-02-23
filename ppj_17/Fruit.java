package _2324Z.wis.eng.gr39.ppj_17;

public class Fruit {

    public String name;
    public double weight;

    Fruit(String name) {
        this.name = name;
        this.weight = Math.random() * (0.3) + 0.5;
    }

    public void show(){
        System.out.println("Name:" + name);
        System.out.println("Weight:" + weight);
    }
}
