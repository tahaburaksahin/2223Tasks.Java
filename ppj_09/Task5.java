package _2324Z.wis.eng.gr39.ppj_09;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int l = 2 * size + 1;

        for (int i = 0; i < l / 2 + 1; i++) {
            for (int k = 0; k < (l / 2) - i; k++) {
                System.out.print(".\t");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*\t");
            }
            for (int k = 0; k < (l / 2) - i; k++) {
                System.out.print(".\t");
            }
            System.out.println();
        }
        for (int i = l / 2 - 1; i >= 0; i--) {
            for (int k = 0; k < (l / 2) - i; k++) {
                System.out.print(".\t");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*\t");
            }
            for (int k = 0; k < (l / 2) - i; k++) {
                System.out.print(".\t");
            }
            System.out.println();
        }


        // lub


        int amount = 1;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(
                        j > (l - amount) / 2 && j < l - (l - amount) / 2 - 1 ? "*\t" : ".\t"
                );
            }

            amount += i > (l / 2 - 1) ? -2 : 2;

            System.out.println();
        }

        // lub

        for (int i = -size; i <= size; i++) {
            for (int j = -size; j <= size; j++) {
                if (Math.abs(i) + Math.abs(j) <= size) {
                    System.out.print("*\t");
                } else {
                    System.out.print(".\t");
                }
            }
            System.out.println();
        }

        for (int i = -size; i <= size; i++) {
            for (int j = -size; j <= size; j++) {
                    System.out.print(Math.abs(i) + Math.abs(j)+"\t");
            }
            System.out.println();
        }

    }
}
