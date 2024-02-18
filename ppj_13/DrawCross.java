package _2324Z.wis.eng.gr39.ppj_13;

import java.util.Scanner;

public class DrawCross {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || (i + j) == (n - 1) ||
                        i == 0 || j == 0 ||
                        i == (n - 1) || j == (n - 1)) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }

//        for (double i = -n; i <= n; i += 0.5) {
//            for (double j = -n; j <= n; j += 0.5) {
//                if ((Math.pow(i, 2) + Math.pow(j, 2)) <= Math.pow(n / 2, 2)) {
//                    System.out.print("*\t");
//                } else {
//                    System.out.print(" \t");
//                }
//            }
//            System.out.println();
//        }
        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println();

        for (double i = 0; i < n; i ++) {
            for (double j = 0; j < n; j ++) {
                if (i% 2 == 0 || j% 2 == 0) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }

    }
}
