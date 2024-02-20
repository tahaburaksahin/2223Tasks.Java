package _2324Z.wis.eng.gr39.ppj_15;

import java.util.Arrays;

public class Task1 {
    public static void buubleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    public static void selSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minId = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[minId]) {
                    minId = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minId];
            arr[minId] = tmp;
        }
    }

    public static void sortRows(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            selSort(arr[i]);
        }
    }

    public static void sortCols(int[][] arr) {
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (arr[j][i] < arr[k][i]) {
                        int tmp = arr[j][i];
                        arr[j][i] = arr[k][i];
                        arr[k][i] = tmp;
                    }
                }
            }
        }
    }

    public static void printArr2D(int[][] arr) {
        for (int[] inArr : arr) {
            System.out.println(Arrays.toString(inArr));
        }
    }

    public static void main(String[] args) {

        int[][] a = {{3, 2, 6, 1, 3, 5, 6, 1, 3},
                {3, 1, 2, 1, 5, 7, 2},
                {8, 9, 2, 1}};
        System.out.println("Before:");
        printArr2D(a);
        sortRows(a);
        System.out.println("After:");
        printArr2D(a);
        int[][] b = {{3, 2, 6, 1, 6},
                {7, 1, 2, 1, 5},
                {5, 3, 1, 8, 7},
                {8, 9, 2, 7, 1}};
        System.out.println("Now columns\nBefore:");

        printArr2D(b);
        sortCols(b);
        System.out.println("After:");
        printArr2D(b);
    }
}
