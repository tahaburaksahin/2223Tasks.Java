package _2324Z.wis.eng.gr39.ppj_08.start;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

//        Task 3
//
//Draw an algorithm to raise the value of x to the power of n, where both values are entered from the
//keyboard. X and N are integer, from 0 to inf. You cant use this symbol "^", in JAVA it means "xor".

        Scanner scanner = new Scanner(System.in);

        System.out.print("Set x: ");
        int x = scanner.nextInt();

        System.out.print("Set n: ");
        int n = scanner.nextInt();

        int n1, n2, n3;
        n1 = n2 = n3 = n;

        int result1 = 1, result2 = 1, result3 = 1, result4 = 1;

        // while

        while (!(n1 == 0)) {
            result1 *= x;
            n1--;
        }
        System.out.println(result1);


        // do while

        do {
            result2 *= x;
            n2--;
        } while (!(n2 == 0));
        System.out.println(result2);

        // for


//        for([creating variable];[condition];[last operation])
        for (int i = 0, j = 1; i < 10 && j % 2 != 0; i++, j++) {
            System.out.println(i);
            System.out.println(j);
        }

        for (; n3 != 0; n3--) {
            result3 *= x;
        }
        System.out.println(result3);


        for(int n4 = n;n4!=0;n4--){
            result4 *= x;
        }
        System.out.println(result4);
    }
}
