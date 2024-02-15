package _2324Z.wis.eng.gr39.ppj_10;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double result1 = 0, result2 = 0;

        for (int i = 1; i <= n; i++) {
            result1 += i * (i + 1);
        }
        System.out.println(result1);
        System.out.println((n * (n + 1) * (n + 2)) / 3);

        System.out.println("-------------------------");

        for (int i = 1; i <= n; i++) {
            result2 += Math.pow(-1, i - 1) * Math.pow(i, 2);
        }

        System.out.println(result2);
        System.out.println((Math.pow(-1, n - 1) * n * (n + 1)) / 2);


    }
}
