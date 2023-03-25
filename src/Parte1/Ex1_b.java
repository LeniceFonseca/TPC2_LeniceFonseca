package Parte1;

import java.util.Scanner;

public class Ex1_b {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n = scanner.nextInt();

        int i = 10;
        while((i % 10 == 0) && (i < n)) {
            System.out.print(i + " ");
            i += 10;
        }

    }

}
