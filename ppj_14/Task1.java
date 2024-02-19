package _2324Z.wis.eng.gr39.ppj_14;

public class Task1 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {1, 9}, {3, 1, 8}};
        int[] ints = countOfEvenAndOddNumbers(arr);
        System.out.println("Even: " + ints[0] + "; odd: " + ints[1]);
    }

    public static int[] countOfEvenAndOddNumbers(int[][] arr){
        int[]  result = new int[2];

        for(int[] wewTablica: arr){
            for(int ele: wewTablica){
//                if(ele%2==0){
//                   result[0]++;
//                }
//                if(ele%2==1){
//                   result[1]++;
//                }
                result[ele%2]++;
            }
        }
        return result;
    }


}
