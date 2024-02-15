package _2324Z.wis.eng.gr39.ppj_11;

public class Task3 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 9, 3, 2, 7, 5};

        // 1
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1]);
        //op2
        String s = "";
        for (int i = 0; i < arr.length; i++) {
            s += arr[i] + ", ";
        }
        System.out.println(s.substring(0,s.length()-2));

        int maxId = 0, minId = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[minId] >= arr[i]) {
                minId = i;
            }
            if (arr[maxId] <= arr[i]) {
                maxId = i;
            }
        }
        System.out.println(arr[minId] + " id:" + minId);
        System.out.println(arr[maxId] + " id:" + maxId);

        //swap
        int tmp = arr[minId];
        arr[minId] = arr[maxId];
        arr[maxId] = tmp;


        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1]);


        for (int i = arr.length - 1; i > 0; i--) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[0]);
    }
}
