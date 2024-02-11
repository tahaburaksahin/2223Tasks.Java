package _2324Z.wis.eng.gr39.ppj_09;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("n\t2^n\t3^n\t4^n");
        for (int i = 1; i <= n; i++) {
            int val = 1;
//            System.out.print(val + "\t"+(val = val * i) + "\t"+(val = val * i) + "\t"+(val = val * i) + "\t");
            for (int j = 1; j <= 4; j++) {
                val = val * i;
                System.out.print(val + "\t");
            }
            System.out.println();
        }

        // or

        System.out.println();
        System.out.println("n\t2^n\t3^n\t4^n");
        for (int i = 1; i <= n; i++) {
            int val = 1;
            System.out.println((val = val * i) + "\t"+(val = val * i) + "\t"+(val = val * i) + "\t"+(val = val * i) + "\t");
        }
    }
}
