package Parte2;

public class Ex9_b {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int produto = 1;

        for (int n: arr) {
            System.out.print(n + " ");
        }

        System.out.println();

        for (int n: arr) {
            produto *= n;
        }
        System.out.print("Produto: " + produto);

    }

}
