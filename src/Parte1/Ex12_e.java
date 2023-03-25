package Parte1;

import java.util.Scanner;

public class Ex12_e {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String s = scanner.next();

        s = s.toLowerCase();
        int contador = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.print(s.indexOf(c) + " ");
            }
        }

    }

}
