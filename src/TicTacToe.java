import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    /*/    Крестики-нолики
     Разработать консольную игру крестики-нолики. В игре участвуют 2 игрока. Они
      по очереди вводят координаты клетки в которую хотят сделать ход. После
      каждого хода, в консоли выводится игровое поле с текущим состоянием.
      Игра продолжается до победы одного из игроков или ничьи.*/
    public static void main(String[] args) {
        int[][] a = {
                {8, 8, 8},
                {8, 8, 8},
                {8, 8, 8}

        };
        showTable(a);
        onePlacement(a);// first turn 1
        showTable(a);
        zeroPlacement(a);// first turn 0
        showTable(a);
        onePlacement(a);//second turn 1
        showTable(a);
        zeroPlacement(a);//second turn 0
        showTable(a);
        onePlacement(a);//third turn 1
        //first check
        showTable(a);
        victoryCheck(a);
        zeroPlacement(a);//third turn 0
        showTable(a);
        victoryCheck(a);
        onePlacement(a);//4th turn 1
        showTable(a);
        victoryCheck(a);
        zeroPlacement(a);//4th turn 0 - probable draw
        showTable(a);
        victoryCheck(a);

        System.out.println("Its draw");
    }

    private static void victoryCheck(int[][] a) {
        mainDiagonalCheck(a);
        secondDiagonalCheck(a);
        firstHorizontalCheck(a);
        secondHorizontalCheck(a);
        thirdHorizontalCheck(a);
        firstVerticalCheck(a);
        secondVerticalCheck(a);
        thirdVerticalCheck(a);
    }

    private static void firstVerticalCheck(int[][] a) {
        int g = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < 1; j++) {
                {
                    g += a[i][j];
                }
            }
        }
        if (g == 3) {
            System.out.println("1 won, end of game");

        }
        if (g == 0) {
            System.out.println(("0 won, end of game"));
        }
    }

    private static void secondVerticalCheck(int[][] a) {
        int h = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < 2; j++) {
                {
                    h += a[i][j];
                }
            }
        }
        if (h == 3) {
            System.out.println("1 won, end of game");

        }
        if (h == 0) {
            System.out.println(("0 won, end of game"));
        }
    }

    private static void thirdVerticalCheck(int[][] a) {
        int e = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 2; j < 3; j++) {
                {
                    e += a[i][j];
                }
            }
        }
        if (e == 3) {
            System.out.println("1 won, end of game");

        }
        if (e == 0) {
            System.out.println(("0 won, end of game"));
        }
    }

    private static void firstHorizontalCheck(int[][] a) {
        int f = 0;
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < a.length; j++) {
                {
                    f += a[i][j];
                }
            }
        }
        if (f == 3) {
            System.out.println("1 won, end of game");

        }
        if (f == 0) {
            System.out.println(("0 won, end of game"));
        }
    }

    private static void secondHorizontalCheck(int[][] a) {
        int k = 0;
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < a.length; j++) {
                {
                    k += a[i][j];
                }
            }
        }
        if (k == 3) {
            System.out.println("1 won, end of game");

        }
        if (k == 0) {
            System.out.println(("0 won, end of game"));
        }
    }

    private static void thirdHorizontalCheck(int[][] a) {
        int g = 0;
        for (int i = 2; i < 3; i++) {
            for (int j = 0; j < a.length; j++) {
                {
                    g += a[i][j];
                }
            }
        }
        if (g == 3) {
            System.out.println("1 won, end of game");

        }
        if (g == 0) {
            System.out.println(("0 won, end of game"));
        }
    }


    private static void mainDiagonalCheck(int[][] a) {
        int l = 0;
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                if (i == j) {
                    l += a[i][j];
                }
            }
        }
        if (l == 3) {
            System.out.println("1 won, end of game");

        }
        if (l == 0) {
            System.out.println(("0 won, end of game"));
        }

    }

    private static void secondDiagonalCheck(int[][] a) {
        int z = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i + j == a.length - 1) {
                    z += a[i][j];
                }
            }
        }
        if (z == 3) {
            System.out.println("1 won, end of game");

        }
        if (z == 0) {
            System.out.println(("0 won"));
        }
    }

    private static void onePlacement(int[][] a) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter vertical position for 1 (between 1-3)");
        int c = scan.nextInt();
        System.out.println("Enter horizontal position for 1 (between 1-3)");
        int d = scan.nextInt();
        a[c - 1][d - 1] = 1;
    }

    private static void zeroPlacement(int[][] a) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter vertical position for 0 (between 1-3)");
        int x = scan.nextInt();
        System.out.println("Enter horizontal position for 0 (between 1-3)");
        int y = scan.nextInt();
        a[x - 1][y - 1] = 0;
    }


    private static void showTable(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));

        }
        System.out.println();
    }
}


