package Parte2;

import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {

        int[][] board = new int[8][8];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if ((i + j) % 2 == 0) {
                    board[i][j] = 0;
                }
                else {
                    board[i][j] = 1;
                }
            }
        }

        for (int[] num : board) {
            System.out.println(Arrays.toString(num));
        }

    }

}
