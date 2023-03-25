package Parte2;

import java.util.Arrays;

public class Ex2 {

    public static void main(String[] args) {

        String[][] tabuleiro = new String[3][3];

        tabuleiro[0][0] = "x";
        tabuleiro[0][1] = " ";
        tabuleiro[0][2] = "o";
        tabuleiro[1][0] = " ";
        tabuleiro[1][1] = "x";
        tabuleiro[1][2] = "o";
        tabuleiro[2][0] = "o";
        tabuleiro[2][1] = " ";
        tabuleiro[2][2] = "x";

        for (String[] num : tabuleiro) {
            System.out.println(Arrays.toString(num));
        }

    }

}
