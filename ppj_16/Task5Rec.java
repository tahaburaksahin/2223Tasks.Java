package _2324Z.wis.eng.gr39.ppj_16;

public class Task5Rec {

    public static int[][] createArray(int rowSize) {
        int[][] array = new int[rowSize][rowSize];
        for (int i = 0; i <= rowSize/2; i++) {
            for (int j = i; j < rowSize - i; j++) {
                array[i][j] = i + 1;
                array[j][i] = i + 1;
                array[rowSize-1-i][j] = i + 1;
                array[j][rowSize-1-i] = i + 1;
            }
        }
        return array;
    }


    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " \t");
            System.out.println();
        }
        System.out.println();
    }



    public static void main(String[] args) {
        int[][] arr4 = createArray(4);
        printArray(arr4);

        System.out.println("---------------------------------------");

        int[][] arr5 = createArray(5);
        printArray(arr5);

        System.out.println("---------------------------------------");

        int[][] arr8 = createArray(8);
        printArray(arr8);
    }
}
