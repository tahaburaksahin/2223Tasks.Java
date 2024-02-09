package _2324Z.wis.eng.gr39.ppj_07.start;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double random = Math.random();


        System.out.println(random);
        System.out.println((int)random);

//        int min = scanner.nextInt();
//        int max = scanner.nextInt();
        int min = 0;
        int max = 9;

        System.out.println((int)(Math.random()*(max -min) + min));
        System.out.println((int)(Math.random()*(max -min) + min));
        System.out.println((int)(Math.random()*(max -min) + min));
        System.out.println((int)(Math.random()*(max -min) + min));
        System.out.println((int)(Math.random()*(max -min) + min));
        System.out.println((int)(Math.random()*(max -min) + min));
        System.out.println((int)(Math.random()*(max -min) + min));
    }
}
