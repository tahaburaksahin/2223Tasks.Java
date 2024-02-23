package _2324Z.wis.eng.gr39.ppj_17;

public class Task1 {

    public static void main(String[] args) {
        // static method
        showStatic();
        // non-static method
        Task1 t = new Task1();
        t.show();
    }

    public static void showStatic(){
        System.out.println("hello");
    }

    public void show(){
        System.out.println("hello");
    }
}
