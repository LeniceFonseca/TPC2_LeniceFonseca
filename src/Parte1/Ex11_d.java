package Parte1;

import java.util.Scanner;

public class Ex11_d {

    public static void main(String[] args) {

        int[] num = {1, 3, 3, 4, 5, 5, 6, 6, 6, 2};

        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.print(num[i] + " ");
                    break;
                }
            }
        }
    }

}
