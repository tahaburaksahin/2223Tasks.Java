package _2324Z.wis.eng.gr39.ppj_12;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] tab = new int[10];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = (int) (Math.random() * 20 - 10);
        }

        int countPos = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] >= 0) {
                countPos++;
            }
        }

        int[] tabPos = new int[countPos];
        int[] tabNeg = new int[tab.length - countPos];

        int indexPos = 0;
        int indexNeg = 0;

        // {-2,2,-3, 7}
        for (int j : tab) {
            if (j >= 0) {
                tabPos[indexPos++] = j;
            } else {
                tabNeg[indexNeg++] = j;
            }
        }
        System.out.println(Arrays.toString(tab));// {-2,2,-3, 7}
        System.out.println(Arrays.toString(tabPos));// {2, 7}
        System.out.println(Arrays.toString(tabNeg));// {-2,-3}

    }
}
