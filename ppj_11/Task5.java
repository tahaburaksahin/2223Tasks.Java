package _2324Z.wis.eng.gr39.ppj_11;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 2, 1, 3, 6, 5, 3};

        for (int i = 0; i < arr.length; i++) {
            boolean b = true;
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i] && i != j){
                    b = false;
                }
            }
            if (b) {
                System.out.println(arr[i]);
            }
        }
    }
}
