package _2324Z.wis.eng.gr39.ppj_08;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0, suma = 0, i;

        while ((i = scanner.nextInt()) != 0) {
            count++;
            suma += i;
        }
        System.out.println("Ilosc: "+count);
        System.out.println("Suma: "+suma);
    }
}
