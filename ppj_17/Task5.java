package _2324Z.wis.eng.gr39.ppj_17;

public class Task5 {
    public static void main(String[] args) {
        Donkey donkey = new Donkey(10);

        while(!donkey.isFlying()){
            donkey.addBalloon(new Balloon());
        }
        donkey.iAmFlying();
        donkey.getBalloonCount();
    }
}
