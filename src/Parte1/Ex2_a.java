package Parte1;

public class Ex2_a {

    public static void main(String[] args) {

        int soma = 0;

        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                soma += i;
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("Soma: " + soma);

    }

}
