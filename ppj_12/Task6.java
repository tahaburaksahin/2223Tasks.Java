package _2324Z.wis.eng.gr39.ppj_12;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
//        int[] arr = {2, 3, 4, 3, 6, 7, 6, 8, 2, 9};
        int[] arr = {0, 3, 4, 3, 6, 7, 6, 8, 2, 9, 5, 2};
        int indexOdd = arr.length - 1;

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length - 1 && indexOdd != i; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i] + " swap " + arr[indexOdd]);
                int swap = arr[i];
                arr[i] = arr[indexOdd];
                arr[indexOdd] = swap;
                indexOdd--;
                i--;
            }
        }

        System.out.println(indexOdd + 1);
        System.out.println(Arrays.toString(arr));
    }
}
