package _2324Z.wis.eng.gr39.ppj_11;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        final int SIZE = 10;
        final int NUMS = 13;
        int[] arr = new int[SIZE];
        int counter = 0;

        loop1:
        while (arr[arr.length - 1] == 0) {
            for (int i = 0; i < arr.length; i++) {
                int val = (int) (Math.random() * NUMS + 1);
                for (int j = 0; j < i; j++) {
                    if (arr[j] == val) {
                        arr = new int[SIZE];
                        counter++;
                        continue loop1;
                    }
                }
                arr[i] = val;
            }
        }

        System.out.println("With SIZE=" + SIZE + " and " +
                "NUMS=" + NUMS + " the array\nhas been " +
                "filled after " + counter + " trials");
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
