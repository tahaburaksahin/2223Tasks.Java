package _2324Z.wis.eng.gr39.ppj_11.start;

import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
        int tab2[] = new int[5];
        int[] tab1 = new int[5]; // {0,0,0,0,0}
        int[] tab3 = {1, 2, 3, 4, 5};
        int[] tab4 = new int[]{1, 2, 3, 4, 5};
        String[] arr = "qwe rty".split("");

        String[] arr2 = arr;
        String[] arr3 = arr.clone();
        String[] arr4 = Arrays.copyOf(arr, arr.length);

        System.out.println(arr); //
        System.out.println(arr2); //
        System.out.println(args); //

        for (String str : args) {
            System.out.println(str);
        }

        String[] arr5 = new String[2]; // {null, null}

        boolean[] tab6 = new boolean[1]; // {false}
        for (boolean b : tab6) {
            System.out.println(b);
        }

        String tmp = args[0];
        args[0] = args[args.length-1];
        args[args.length-1] = tmp;

    }
}
