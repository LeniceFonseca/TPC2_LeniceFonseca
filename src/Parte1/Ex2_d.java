package Parte1;

import java.util.Scanner;

public class Ex2_d {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = scanner.nextInt();

        int soma = 0;
        String digit = Integer.toString(n);
        int qtdDigit = digit.length();
        int aux = n;
        int nImpar = 0;

        for (int i = 0; i < qtdDigit; i++) {
            nImpar = aux % 10;
            if (nImpar % 2 != 0) {
                soma += nImpar;
            }
            aux /= 10;
        }

        System.out.println();
        System.out.println("Soma: " + soma);



    }

}
