package _2324Z.wis.eng.gr39.ppj_14;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[][][] operacje = {
                {{100, -50, 25}, {150, -300}, {300, -90, 100}},
                {{90, -60, 250}, {300, 20, -100}},
                {{20, 50}, {300}, {20, -20, 40}, {100, -200}}
        };

        System.out.println(Arrays.toString(
                        sumMoneyForClients(operacje)
                )
        );
    }

    private static int[] sumMoneyForClients(int[][][] operacje) {
        int[] result = new int[operacje.length];
        for (int klient = 0; klient < operacje.length; klient++) {
            int suma = 0;
            for (int[] konto : operacje[klient]) {
                for (int tr : konto) {
                    suma += tr;
                }
            }
            result[klient] = suma;
        }
        return result;
    }

}
