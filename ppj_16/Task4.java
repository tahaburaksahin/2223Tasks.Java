package _2324Z.wis.eng.gr39.ppj_16;

public class Task4 {

    public static int[][] createArray(int rowSize) {
        int[][] array = new int[rowSize][rowSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < rowSize; j++) {
                array[i][j] = j + (i * rowSize) + 1;
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
        int[][] arr4x4 = createArray(4);
        printArray(arr4x4);
        System.out.println(spiral(arr4x4));

        System.out.println("---------------------------------------");

        int[][] arr5x5 = createArray(5);
        printArray(arr5x5);
        System.out.println(spiral(arr5x5));
    }


    public static String spiral(int[][] arr) {
        String s = "";
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr.length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                s += arr[top][i] + " ";
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                s += arr[i][right] + " ";
            }
            right--;
            for (int i = right; i >= left; i--) {
                s += arr[bottom][i] + " ";
            }
            bottom--;
            for (int i = bottom; i >= top; i--) {
                s += arr[i][left] + " ";
            }
            left++;
        }

        return s;
    }
}
