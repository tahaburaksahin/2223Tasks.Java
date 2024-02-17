package _2324Z.wis.eng.gr39.ppj_12;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 2, 6};

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
        for (int i = max; i >= 1; i--) {
            System.out.print(i + "\t");
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= i) {
                    System.out.print("*\t");
                } else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
