package _2324Z.wis.eng.gr39.ppj_16;

import java.util.Arrays;

public class Task2 {

    public static int fiboR(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        return fiboR(n - 1) + fiboR(n - 2);
    }

    public static long fiboI(int n) {
        int secondLast = 1;
        int firstLast = 0;

        for (int i = 0; i < n; i++) {
            int tmp = firstLast;
            firstLast = secondLast;
            secondLast = secondLast + tmp;
        }
        return firstLast;

    }

    // 5! = 1*2*3*4*5
    public static int factR(int n) {
        if (n == 1) {
            return 1;
        }
        return factR(n - 1) * n;
    }

    public static int factI(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public static int gcdR(int a, int b) {
        if (a == b) {
            return a;
        }
        return (a > b) ? gcdR(a - b, b) : gcdR(a, b - a);
    }

    public static int gcdI(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    public static int maxElem(int[] arr, int from) {
        if (from == arr.length - 1) {
            return arr[from];
        }
        return Math.max(arr[from], maxElem(arr, from + 1));
    }

    public static int numEven(int[] arr, int from) {
        if (from == arr.length - 1) {
            return arr[from] % 2 == 0 ? 1 : 0;
        }
        return (arr[from] % 2 == 0 ? 1 : 0) + numEven(arr, from + 1);
    }

    public static void reverse(int[] arr, int from) {
        if (arr.length / 2 <= from) {
            return;
        }
        //swap
        int tmp = arr[from];
        arr[from] = arr[arr.length - 1 - from];
        arr[arr.length - 1 - from] = tmp;

        reverse(arr, from + 1);
    }

    public static boolean isPalindrom(String s) {
        System.out.println(s);
        if (s.length() == 1 || s.length() == 0) {
            return true;
        }
        return (s.charAt(0) == s.charAt(s.length() - 1)) && isPalindrom(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println("Wait...");
        System.out.println(fiboR(45));
        System.out.println(fiboI(45));
        System.out.println(factR(12));
        System.out.println(factI(12));
        System.out.println(gcdR(12125, 40643));
        System.out.println(gcdI(12125, 40643));
        int[] a = {3, 8, 2, 9, 7, 4};
        System.out.println("Max : " + maxElem(a, 0));
        System.out.println("Num even: " + numEven(a, 0));
        System.out.println("Before: " + Arrays.toString(a));
        reverse(a, 0);
        System.out.println("After : " + Arrays.toString(a));
        System.out.println("Is 'radar' a palindrom? " + isPalindrom("radar"));
        System.out.println("Is 'abba' a palindrom? " + isPalindrom("abba"));
        System.out.println("Is 'rover' a palindrom? " + isPalindrom("rover"));
    }
}
