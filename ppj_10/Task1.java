package _2324Z.wis.eng.gr39.ppj_10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index = 0; // 0 - N, 1 - E, 2 - S, 3 - W
        String letter;

        // op 1
        while (!(letter = scanner.nextLine().toUpperCase().substring(0, 1)).equals("Q")) {
            switch (letter) {
                case "A" -> index--;
                case "D" -> index++;
            }
            if (index == -1) {
                index = 3;
            }
            if (index == 4) {
                index = 0;
            }
            switch (index) {
                case 0 -> System.out.println("North");
                case 1 -> System.out.println("East");
                case 2 -> System.out.println("South");
                case 3 -> System.out.println("West");
            }
        }

        //op 2
        String[] strings = {"North", "East", "South", "West"};
        char[] unicode = {'\u1403', '\u1405', '\u1401', '\u140A'};
        while (!(letter = scanner.nextLine().toUpperCase().substring(0, 1)).equals("Q")) {
            switch (letter) {
                case "A" -> index--;
                case "D" -> index++;
            }
            if (index == -1) {
                index = 3;
            }
            if (index == 4) {
                index = 0;
            }
            System.out.println(strings[index] + " " + unicode[index]);
        }

    }
}
