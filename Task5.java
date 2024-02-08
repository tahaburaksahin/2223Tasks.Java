package _2324Z.wis.eng.gr39.ppj_06;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1, a2, b1, b2, x;

        a1 = scanner.nextInt();
        a2 = scanner.nextInt(); // a1 < a2
        b1 = scanner.nextInt();
        b2 = scanner.nextInt(); // b1 < b2

        x = scanner.nextInt();

//• x ∈ A
        System.out.println(x >= a1 && x <= a2);
//• x ∈ B
        System.out.println(x >= b1 && x <= b2);
//• x ∈ A \ B
        System.out.println(x >= a1 && x <= a2 && !(x >= b1 && x <= b2));
//• x ∈ B \ A
        System.out.println(!(x >= a1 && x <= a2) && (x >= b1 && x <= b2));
//• x ∈ A ∩ B
        System.out.println((x >= a1 && x <= a2) && (x >= b1 && x <= b2));
//• x ∈ A ∪ B
        System.out.println((x >= a1 && x <= a2) || (x >= b1 && x <= b2));
//• x ∈ A ⊖ B
        System.out.println(!(x >= a1 && x <= a2) && (x >= b1 && x <= b2) ||
                                x >= a1 && x <= a2 && !(x >= b1 && x <= b2));


    }
}
