package _2324Z.wis.eng.gr39.ppj_06;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tmp;
        int max1 = scanner.nextInt(); // the greatest
        int max2 = scanner.nextInt(); // second-greatest number, max2 > max1
        if (max1 < max2) {
            tmp = max1;
            max1 = max2;
            max2 = tmp;
        }
        tmp = scanner.nextInt();
        if (tmp > max2) {
            if (tmp > max1) {
                max2 = max1;
                max1 = tmp;
            } else {
                max2 = tmp;
            }
        }
        tmp = scanner.nextInt();
        if (tmp > max2) {
            if (tmp > max1) {
                max2 = max1;
                max1 = tmp;
            } else {
                max2 = tmp;
            }
        }
        tmp = scanner.nextInt();
        if (tmp > max2) {
            if (tmp > max1) {
                max2 = max1;
                max1 = tmp;
            } else {
                max2 = tmp;
            }
        }
        System.out.println("THe first-greatest number is: " + max1);
        System.out.println("THe second-greatest number is: " + max2);


    }
}
