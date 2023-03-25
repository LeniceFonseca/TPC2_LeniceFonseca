package Parte1;

import java.util.Scanner;

public class Ex12_a {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String s = scanner.nextLine();

        int contador = 0;

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                contador++;
            }
        }

        System.out.println("A string contem " + contador + " letras maiusculas");

    }

}
