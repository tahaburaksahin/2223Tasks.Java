package _2324Z.wis.eng.gr39.ppj_14;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4, 5, 6},
                {2, 3, 4, 5, 6, 7},
                {3, 4, 5, 6, 7, 8},
                {4, 5, 6, 7, 8, 9}};
        for (int[] r : a)
            System.out.println(Arrays.toString(r));
        System.out.println();
        for (int[] r : inner(a))
            System.out.println(Arrays.toString(r));

    }

    private static int[][] inner(int[][] arr) {
        int[][] ints = new int[arr.length - 2][arr[0].length - 2];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                ints[i][j] = arr[i + 1][j + 1];
            }
        }
        return ints;
    }
}
