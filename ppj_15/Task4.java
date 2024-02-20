package _2324Z.wis.eng.gr39.ppj_15;

public class Task4 {
    public static void main(String[] args) {
        final int N = 90;
        final int NUM_OF_SIMULATIONS = 100000;
        int totalBoxes = 0;
        for (int i = 0; i < NUM_OF_SIMULATIONS; ++i) {
            totalBoxes += boxesBought(N);
        }
        double aver = totalBoxes / (double) NUM_OF_SIMULATIONS;
        System.out.println("***** N = " + N);

        System.out.println("Average : " + aver);
        System.out.println("Expected: " + N * harmo(N));
    }

    static int boxesBought(int coupons) {
        int count = 0;
        int[] arr = new int[coupons];
        boolean b = true;
        while (b) {
            int r = (int) (Math.random() * 90);
            arr[r]++;
            count++;

            b = false;
            for (int i : arr) {
                if (i == 0) {
                    b = true;
                }
            }
        }
        return count;
    }

    static double harmo(int n) {
        double res = 0;

        for (int i = 1; i < n; i++) {
            res += 1. / i;
        }
        return res;
    }
}
