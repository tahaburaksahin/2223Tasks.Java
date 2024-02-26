package _2324Z.wis.eng.gr39.ppj_19;

public class Maze {

    public static void main(String[] args) {
        char[][] maze = {
                {' ', '#', ' ', ' ', ' ', ' ', '#', '#', '#', ' '},
                {' ', ' ', ' ', '#', '#', ' ', '#', '#', '#', ' '},
                {' ', '#', '#', '#', '#', ' ', '#', '#', '#', ' '},
                {' ', ' ', ' ', '#', '#', '?', ' ', ' ', ' ', ' '},
                {'#', '#', ' ', ' ', '#', '#', '#', '#', '#', '#'},
                {' ', '#', '#', ' ', '#', '#', '#', '#', '#', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', '#', '#', ' '},
                {' ', '#', '#', ' ', '#', '#', ' ', ' ', ' ', ' '},
                {' ', '#', '#', ' ', '#', '#', '#', '#', '#', ' '},
                {' ', ' ', ' ', ' ', '#', '#', '#', '#', '#', ' '},
        };
        System.out.println("START");
        findExit(maze, 0, 0, 9, 3);
        System.out.println("STOP");
        show(maze, -1 , -1);
    }

    private static boolean findExit(char[][] maze, int indY, int indX, int exitY, int exitX) {
        if (indY == maze[0].length || indY < 0 || indX == maze.length || indX < 0
                || maze[indX][indY] == '#') {
            // wall
            return false;
        }
        if (maze[indX][indY] == '*') {
            // been there
            return false;
        }
        if (indX == exitX && indY == exitY) {
            //exit
            System.out.println("Find exit");
            return true;
        }
        maze[indX][indY] = '*';
//        show(maze, indY, indX);

        boolean exit = false;
        exit = exit || findExit(maze, indY, indX + 1, exitY, exitX); // down
        exit = exit || findExit(maze, indY, indX - 1, exitY, exitX); // up
        exit = exit || findExit(maze, indY + 1, indX, exitY, exitX); // right
        exit = exit || findExit(maze, indY - 1, indX, exitY, exitX); // left

        return exit;
    }

    private static void show(char[][] maze, int indY, int indX) {
        System.out.println("----------------------------------");
        for (int j = 0; j < maze.length; j++) {
            int maxIndex = maze[j].length - 1;
            System.out.print("[");
            for (int i = 0; i < maze[j].length; i++) {
                if (indY == i && j == indX) {
                    System.out.print("\033[1;37m" + maze[j][i] + "\033[0m"); //
                } else {
                    switch (maze[j][i]) {
                        case '*' -> System.out.print("\033[1;34m*\033[0m"); // blue
                        case '#' -> System.out.print("\033[1;31m#\033[0m"); // red
                        default -> System.out.print(" "); // empty text
                    }
                }
                if (i != maxIndex) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        System.out.println("----------------------------------");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
