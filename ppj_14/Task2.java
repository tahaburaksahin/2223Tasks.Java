package _2324Z.wis.eng.gr39.ppj_14;

import java.util.Arrays;

public class Task2 {

    public static void main(String[] args) {
        String[][] arr =
                {{"Germany", "2", "Scotland", "1"},
                        {"Poland", "2", "Germany", "0"},
                        {"Germany", "1", "Ireland", "1"},
                        {"Poland", "2", "Scotland", "2"},
                        {"Scotland", "1", "Ireland", "0"},
                        {"Ireland", "1", "Poland", "1"},
                        {"Ireland", "1", "Scotland", "1"},
                        {"Germany", "3", "Poland", "1"},
                        {"Scotland", "2", "Germany", "3"},
                        {"Ireland", "1", "Germany", "0"},
                        {"Scotland", "2", "Poland", "2"},
                        {"Poland", "2", "Ireland", "1"}};

        System.out.println(Arrays.toString(task2(arr)));
    }

    public static int[] task2(String[][] arr) {
        int[] result = new int[4];
        // Germany, Ireland, Poland and Scotland
        for (String[] inArr : arr) {
            String player1 = inArr[0];
            int player1Points = Integer.parseInt(inArr[1]);
            String player2 = inArr[2];
            int player2point = Integer.parseInt(inArr[3]);

            if (player1Points == player2point) {
                int pl1Id = getPlayerIndex(player1);
                int pl2Id = getPlayerIndex(player2);
                result[pl1Id] += 1;
                result[pl2Id] += 1;
            } else if (player1Points > player2point) {
                int pl1Id = getPlayerIndex(player1);
                result[pl1Id] += 3;
            } else {
                int pl2Id = getPlayerIndex(player2);
                result[pl2Id] += 3;
            }
        }
        return result;
    }

    public static int getPlayerIndex(String name) {
        return switch (name) { // Germany, Ireland, Poland and Scotland
            case "Germany" -> 0;
            case "Ireland" -> 1;
            case "Poland" -> 2;
            case "Scotland" -> 3;
            default -> -1;
        };
    }
}
