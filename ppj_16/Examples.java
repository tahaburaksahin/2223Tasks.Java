package _2324Z.wis.eng.gr39.ppj_16;

public class Examples {

    public static int fibRec(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return fibRec(n - 1) + fibRec(n - 2);
    }


    public static long fibNormal(int n) {
        if (n < 0) {
            return 0;
        }
        long preEle = 1; // 1
        long prevprevEle = 1; // 0
        for (int i = 0; i < n; i++) {
            long tmp = prevprevEle;
            prevprevEle = preEle;
            preEle = preEle + tmp;
        }
        return prevprevEle;
    }


    public static void main(String[] args) {
        System.out.println(fibRec(5));
        System.out.println(fibNormal(5));
        System.out.println(fibRec(25));
        System.out.println(fibNormal(25));

        long start1 = System.currentTimeMillis();
        System.out.println(fibNormal(42));
        long stop1 = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        System.out.println(fibRec(42));
        long stop2 = System.currentTimeMillis();

        System.out.println("Normal " + (stop1 - start1));
        System.out.println("Rec " + (stop2 - start2));
        /*






         * */
    }
}
