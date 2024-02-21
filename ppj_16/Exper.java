package _2324Z.wis.eng.gr39.ppj_16;

import java.util.Arrays;

public class Exper {
    public static void main(String[] args) {
        int[] tab1 = {1, 2, 3};
        int[] tab2 = tab1;
        int[] tab3 = new int[tab1.length];

        for (int i = 0; i < tab1.length; i++) {
            tab3[i] = tab1[i];
        }

        for (int i = 0; i < tab1.length; i++) {
            tab1[i]++;
        }

        System.out.println(Arrays.toString(tab1)); // 2 3 4 ,
        System.out.println(Arrays.toString(tab2)); // 2 3 4 ,
        System.out.println(Arrays.toString(tab3)); // 1 2 3 ,

        System.out.println(tab1);
        System.out.println(tab2);
        System.out.println(tab3);

        System.out.println("------------------------------------------");
        int[] tab4 = {1, 2, 3};
        System.out.println(Arrays.toString(tab4));
        System.out.println(tab4);
        addElement(tab4, 4);
        System.out.println(Arrays.toString(tab4));
        System.out.println("------------------------------------------");
        int[] tab5 = {1, 2, 3};
        System.out.println(Arrays.toString(tab5));
        System.out.println(tab5);
        increase(tab5);
        System.out.println(Arrays.toString(tab5));
    }

    private static void addElement(int[] tab1, int ele) {
        System.out.println(tab1);
        int[] tmp = tab1;
        tab1 = new int[tab1.length + 1];
        System.out.println(tab1);

        for (int i = 0; i < tmp.length; i++) {
            tab1[i] = tmp[i];
        }
        tab1[tab1.length - 1] = ele;
        System.out.println(Arrays.toString(tab1));
    }

    private static void increase(int[] tab1) {
        System.out.println(tab1);
        for (int i = 0; i < tab1.length; i++) {
            tab1[i]++;
        }
        System.out.println(Arrays.toString(tab1));
    }
}
