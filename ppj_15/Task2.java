package _2324Z.wis.eng.gr39.ppj_15;

public class Task2 {
    public static void main(String[] args) {
        int[][] arr =
                {{1, 3}, {3, 4, 5, 8}, {6, 8}, {9}};
        double[] res = getAverages(arr);
        for (double e : res) System.out.print(e + " ");
    }

    private static double[] getAverages(int[][] arr) {
        double[] result = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            double sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            result[i] = (sum / arr[i].length);
        }

        return result;
    }

}
