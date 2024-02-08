package _2324Z.wis.eng.gr39.ppj_06;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        boolean d = (a % 2 == 0 && b % 2 == 0) ||
                (a % 3 == 0 && b % 3 == 0) ||
                (a % 5 == 0 && b % 5 == 0);

        if (d) {
            System.out.println("OK");
        } else {
            System.out.println("NOT OK");
        }

    }
}
