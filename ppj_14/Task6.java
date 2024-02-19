package _2324Z.wis.eng.gr39.ppj_14;

public class Task6 {
    //    Problem 6
//Create and test functions taking a two-dimensional array of doubles and returning
//a boolean1
//• isRectangular — checking if the given array is rectangular;
//• isSquare — checking if the given array is square;
//• isSymmetric — checking if the given array is symmetric (i.e., is square and
//aij = aji).
//Create also predicates taking two two-dimensional arrays
//• isSameShape — checking if given arrays are of the same shape, i.e., all dimensions are equal;
//• isSame — checking if given arrays are identical.
    public static void main(String[] args) {
        double[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };

        System.out.println(isRectangular(arr1));
        System.out.println(isSquare(arr1));
        System.out.println(isSymmetric(arr1));

        double[][] arr2 = {
                {0, 1, 2},
                {1, 0, 1},
                {2, 1, 0},
        };

        System.out.println(isRectangular(arr2));
        System.out.println(isSquare(arr2));
        System.out.println(isSymmetric(arr2));

        System.out.println("isSameShape");
        System.out.println(isSameShape(arr2, arr1));
        System.out.println("isSame");
        System.out.println(isSame(arr2, arr1));

    }

    public static boolean isRectangular(double[][] arr) {
        if (arr.length > 0) {
            int inArrSize = arr[0].length;
            for (double[] inArr : arr) {
                if (inArr.length != inArrSize) {
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }

    }

    public static boolean isSquare(double[][] arr) {
        if (arr.length > 0) {
            int inArrSize = arr.length;
            for (double[] inArr : arr) {
                if (inArr.length != inArrSize) {
                    return false;
                }
            }
            return true;
        } else {
            return true;
        }
    }

    public static boolean isSymmetric(double[][] arr) {
        if (isSquare(arr)) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if (arr[i][j] != arr[j][i]) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public static boolean isSameShape(double[][] arr1, double[][] arr2) {
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i].length != arr2[i].length) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean isSame(double[][] arr1, double[][] arr2) {
        if (isSameShape(arr1, arr2)) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1.length; j++) {
                    if (arr1[i][j] != arr2[i][j]) {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;

    }

}
