package Parte1;

import java.util.Scanner;

public class Ex13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("A: ");
        Double a = scanner.nextDouble();

        System.out.print("B: ");
        Double b = scanner.nextDouble();

        System.out.print("C: ");
        Double c = scanner.nextDouble();

        System.out.print("D: ");
        Double d = scanner.nextDouble();

        double preyI = 1000;
        double predI = 20;

        double prey = preyI * (1 + a - b * predI);
        double pred = predI * (1 - c + d * preyI);

        System.out.println("Predadores: " + pred);
        System.out.println("Presas: " + prey);

    }

}
