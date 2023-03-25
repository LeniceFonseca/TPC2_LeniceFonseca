package Parte1;

import java.util.Scanner;

public class Ex14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = 0;

        int sumo = 0, bolo = 0, chocolate = 0, batatas = 0;

        do {

            System.out.println("""
                    [1] - Sumo
                    [2] - Bolo
                    [3] - Chocolate 
                    [4] - Batatas fritas
                    [5] - Total a pagar
                    [6] - Sair
                    """);

            System.out.print("Opcao: ");
            n = scanner.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Aqui esta o seu Sumo!");
                    System.out.println();
                    sumo++;
                    break;
                case 2:
                    System.out.println("Aqui esta o seu Bolo!");
                    System.out.println();
                    bolo++;
                    break;
                case 3:
                    System.out.println("Aqui esta o seu Chocolate!");
                    System.out.println();
                    chocolate++;
                    break;
                case 4:
                    System.out.println("Aqui estaa suas Batatas Fritas!");
                    System.out.println();
                    batatas++;
                    break;
                case 5:
                    System.out.println(sumo + " itens Sumo vendido!");
                    System.out.println(bolo + " itens Bolo vendido!");
                    System.out.println(chocolate + " itens Chocolate vendido!");
                    System.out.println(batatas + " itens Batatas Fritas vendido!");
                case 6:
                    break;
                default:
                    System.out.println("Opcao Invalida!");
            }

        }while(n > 0 && n < 6);

    }

}
