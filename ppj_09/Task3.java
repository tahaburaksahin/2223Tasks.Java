package _2324Z.wis.eng.gr39.ppj_09;

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        char c;
        if (val < 10) {
            c = (char) ('0' + val);
        } else {
            c = (char) ('A' - 10 + val);
        }

        System.out.println(c);
    }
}
