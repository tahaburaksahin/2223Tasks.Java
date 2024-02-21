package _2324Z.wis.eng.gr39.ppj_16;

public class Task1 {
    static int countEven(int[] arr, int from) {
        if(from == arr.length-1){
            return arr[from] % 2 == 0 ? 1 : 0;
        }
        return (arr[from] % 2 == 0 ? 1 : 0) + countEven(arr, from + 1);
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 2, 4, 3, 1, 6, 3, 2, 3, 6};
        System.out.println("# of even: " + countEven(a, 0));
    }
}
