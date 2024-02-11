package _2324Z.wis.eng.gr39.ppj_09;

public class Task2 {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double d = scanner.nextDouble()*100;
        double p = 1.75;

        //500 50 5 0.5 0.05
        //200 20 2 0.2 0.02
        //100 10 1 0.1 0.01

        // 500zl / 0.05gr = 10_000
        p = p * 100;
        for (int i = 10_000_00; i > 0 || p == 0; i = i / 10) {
            if ((int) (p / (0.05 * i)) >= 1) { // d = 1.75; d -1zl-0.5zl-0.2zl = 0.049999 ~0.5
                System.out.println((int) (p / (0.05 * i)) + " * " + (0.05 * i)/100 + " zl");
            }
            p = (p % (0.05 * i));
            if ((int) (p / (0.02 * i)) >= 1) {
                System.out.println((int) (p / (0.02 * i)) + " * " + (0.02 * i)/100 + " zl");
            }
            p = p % (0.02 * i);
            if ((int) (p / (0.01 * i)) >= 1) {
                System.out.println((int) (p / (0.01 * i)) + " * " + (0.01 * i)/100 + " zl");
            }
            p = p % (0.01 * i);
        }

    }
}
