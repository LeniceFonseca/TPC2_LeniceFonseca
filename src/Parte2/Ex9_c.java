package Parte2;

public class Ex9_c {

    public static void main(String[] args) {

        int[] arr = {1, -2, 3, 4, 5, -6, 7, 8, 9};
        int contador = 0;

        for (int n: arr) {
            System.out.print(n + " ");
        }

        System.out.println();

        for (int n: arr) {
            if (n < 0){
                contador++;
            }
        }
        System.out.print("Quantidade de numeros negativos: " + contador);

    }

}
