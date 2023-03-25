package Parte1;

public class Ex10_c {

    public static void main(String[] args) {

        int soma = 0;

        for (int i = 0; i <= 20; i++) {
            System.out.print(Math.pow(2, i) + " ");
            soma += Math.pow(2, i);
        }

        System.out.println();
        System.out.println("Soma: " + soma);

    }

}
