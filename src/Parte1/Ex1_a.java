package Parte1;

import java.util.Scanner;

public class Ex1_a {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = scanner.nextInt();

        int i = 0;
        while((i*i) < n) {
            System.out.print((i*i)+ " ");
            i += 1;
        }

    }
}