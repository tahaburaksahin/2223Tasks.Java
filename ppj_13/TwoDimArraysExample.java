package _2324Z.wis.eng.gr39.ppj_13;

public class TwoDimArraysExample {
    public static void main(String[] args) {


        int[][] arr1 = new int[10][10];
//        {
//            {1,2,3},
//            {4,5,6},
//        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = (int) (Math.random() * (10));
            }
            System.out.println();
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("{");
            for (int j = 0; j < arr1.length; j++) {
                System.out.print(arr1[i][j] + ",");
            }
            System.out.println("}");
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (i == j || (i + j) == arr1.length - 1){
                    System.out.print(arr1[i][j]);
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
