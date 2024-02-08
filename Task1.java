package _2324Z.wis.eng.gr39.ppj_06;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.print("Enter three boolean values (true or false) ");
        boolean a = sca.nextBoolean();
        boolean b = sca.nextBoolean();
        boolean c = sca.nextBoolean();
        sca.close();

        boolean allThree = (a && b && c);
        boolean exactlyOne = (a && !b && !c) || (!a && b && !c) || (!a && !b && c);
        boolean exactlyTwo = (a && b && !c) || (a && c && !b) || (b && c && !a);
        boolean atLeastOne = !(!a && !b && !c);
        boolean atLeastTwo = (a && b) || (a && c) || (b && c);
        System.out.println("a, b, c = " + a + ", " + b +
                ", " + c + "\nallThree: " + allThree +
                "\nexactlyOne: " + exactlyOne +
                "\nexactlyTwo: " + exactlyTwo +
                "\natLeastOne: " + atLeastOne +
                "\natLeastTwo: " + atLeastTwo);
    }
}
