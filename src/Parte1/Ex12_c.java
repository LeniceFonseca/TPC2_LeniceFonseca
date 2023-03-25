package Parte1;

import java.util.Scanner;

public class Ex12_c {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String s = scanner.nextLine();

        s = s.toLowerCase();

        System.out.println(s.replaceAll("[aeiou]", "_"));

    }

}
