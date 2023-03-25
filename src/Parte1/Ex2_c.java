package Parte1;

import java.util.Scanner;

public class Ex2_c {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois numeros: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int soma = 0;

        for (int i = a; i <= b; i++) {
            if (i % 2 != 0){
                soma += i;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("Soma: " + soma);


    }

}
