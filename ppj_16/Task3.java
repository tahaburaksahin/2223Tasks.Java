package _2324Z.wis.eng.gr39.ppj_16;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        int[] a = {};
        info(a); // line 1
        a = add(a, 4);
        a = add(a, 1);
        a = add(a, 3);
        a = add(a, 7);
        a = add(a, 4);
        a = add(a, 2);
        a = add(a, 7);
        a = add(a, 4);
        a = add(a, 8);
        a = add(a, 7);
        a = add(a, 4);
        a = add(a, 5);
        info(a); // line 2
        a = delIndex(a, 2);
        info(a); // line 3
        a = delFirst(a, 7);
        info(a); // line 3
        a = delLast(a, 7);
        info(a); // line 3
        a = delAll(a, 4);
        info(a); // line 4

    }

    static int[] add(int[] a, int newEle) {
        int[] newArr = new int[a.length + 1];
        boolean inserted = false;
        int j = 0;
        for (int ele : a) {
            if (newEle < ele && !inserted) {
                newArr[j++] = newEle;
                inserted = true;
            }
            newArr[j++] = ele;
        }
        if (!inserted) {
            newArr[j] = newEle;
        }

        return newArr;
    }

    static int[] delIndex(int[] a, int ind) {
        if (ind >= a.length) { // example delIndex({1,2,3}, 4) or delIndex({1,2,3}, 3)
            return a;
        }

        int[] newArr = new int[a.length - 1];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (i == ind) {
                continue;
            }
            newArr[j++] = a[i];
        }

        return newArr;
    }

    static int[] delFirst(int[] arr, int delEle) {
        if (!ifExists(arr, delEle)) {
            return arr;
        }
        int[] newArr = new int[arr.length - 1];
        int j = 0;
        boolean deleted = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == delEle && !deleted) {
                deleted = true;
                continue;
            }
            newArr[j++] = arr[i];
        }
        return newArr;

    }

    static int[] delLast(int[] arr, int delEle) {
        if (!ifExists(arr, delEle)) {
            return arr;
        }
        int[] newArr = new int[arr.length - 1];
        int j = newArr.length - 1;
        boolean deleted = false;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == delEle && !deleted) {
                deleted = true;
                continue;
            }
            newArr[j--] = arr[i];
        }
        return newArr;

    }

    static int[] delAll(int[] arr, int delEle) {
        int count = count(arr, delEle);
        if (count == 0) {
            return arr;
        }
        int[] newArr = new int[arr.length - count];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == delEle) {
                continue;
            }
            newArr[j++] = arr[i];
        }
        return newArr;
    }


    static boolean ifExists(int[] arr, int ele) {
        for (int val : arr) {
            if (val == ele) return true;
        }
        return false;
    }

    static int count(int[] arr, int ele) {
        int count = 0;
        for (int val : arr) {
            if (val == ele) count++;
        }
        return count;
    }

    static void info(int[] a) {
        System.out.println(Arrays.toString(a));
    }
}
