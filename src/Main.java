import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        tripleArray();
        //chessBoard();
    }

    public static void tripleArray() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Please enter your the number: ");
        int a = enter.nextInt();

        int[][][] three = new int[][][]{
                {
                        {1, 2, 3},
                        {2, 3, 4},
                        {3, 5, 7}

                }
        };

        for (int i = 0; i < three.length; i++) {
            for (int t = 0; t < three[i].length; t++) {
                for (int d = 0; d < three[i][t].length; d++) {
                    System.out.print(three[i][t][d] + a + " ");
                }
                System.out.println();
            }

        }

    }

    public static void chessBoard() {
        String[][] board = new String[8][8];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++)
                if ((i + j) % 2 == 0)
                    System.out.print("W ");
                else
                    System.out.print("B ");
                System.out.println();
            }
        }
    }
