package Parte1;

import java.util.Scanner;

public class Ex1_c {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = scanner.nextInt();

        int i = 0;
        while(Math.pow(2, i) < n) {
            System.out.print(Math.pow(2, i) + " ");
            i += 1;
        }

    }

}
