package _2324Z.wis.eng.gr39.ppj_17;

public class Donkey {
    private double mass;
    private Balloon[] balloons;

    Donkey(double mass) {
        this.mass = mass;
        balloons = new Balloon[0];
    }

    public void addBalloon(Balloon balloon) {
        Balloon[] tmpBalloons = this.balloons;
        this.balloons = new Balloon[tmpBalloons.length + 1];
        System.arraycopy(tmpBalloons, 0, this.balloons, 0, tmpBalloons.length);
        this.balloons[balloons.length - 1] = balloon;
    }

    public boolean isFlying() {
        double massLifted = 0;
        for (Balloon b : balloons) {
            massLifted += b.getLoad();
        }
        return massLifted > mass*1000;
    }

    public void iAmFlying(){
        System.out.println("I’m flying!!!");
    }

    public void getBalloonCount(){
        System.out.println(this.balloons.length);
    }
}
