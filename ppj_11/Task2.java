package _2324Z.wis.eng.gr39.ppj_11;

public class Task2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8}; // 2 id = 3
        int[] arr2 = {1, 2, 3, 4, 5, 6}; // 1 id =2
        int[] arr3 = {1, 2, 3, 4}; // 1  id = 1
        int[] arr = arr1;

        int operationSwapCount = arr.length / 4;
        int IndexOfTheLastElementInTheFirstHalf = arr.length / 2 - 1;

        for (int i = 0; i < operationSwapCount; i++) {
            System.out.print(arr[i] + " ");
            System.out.print(arr[IndexOfTheLastElementInTheFirstHalf - i] + " ");
            System.out.println();
            //swap
            int tmp = arr[i];
            arr[i] = arr[IndexOfTheLastElementInTheFirstHalf - i];
            arr[IndexOfTheLastElementInTheFirstHalf - i] = tmp;
        }

        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }
}
