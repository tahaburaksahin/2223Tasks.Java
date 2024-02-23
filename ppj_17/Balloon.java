package _2324Z.wis.eng.gr39.ppj_17;

public class Balloon {
    double heliumAmount;

    public Balloon() {
        this.heliumAmount = Math.random() * (0.004) + 0.005;
    }

    // 0,007 -> 6gr
    // hel -> x
    public double getLoad() {
        return (6 * heliumAmount) / 0.007;
    }
    //
}
