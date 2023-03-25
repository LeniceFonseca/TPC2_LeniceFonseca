package Parte1;

public class Ex2_b {

    public static void main(String[] args) {

        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            if (Math.pow(i, 2) >= 1 && Math.pow(i, 2) <= 100){
                soma += Math.pow(i, 2);
                System.out.print(Math.pow(i, 2) + " ");
            }
        }
        System.out.println();
        System.out.println("Soma: " + soma);

    }

}
