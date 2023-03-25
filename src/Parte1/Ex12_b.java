package Parte1;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12_b {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String s = scanner.next();

        for (int i = 0; i < s.length(); i+=2) {
            System.out.print(s.charAt(i));
        }

    }

}
