package Parte2;

import java.util.ArrayList;

public class Ex4 {

    public static void main(String[] args) {

        ArrayList<Integer> primos = new ArrayList<>();
        ArrayList<Integer> reverter = new ArrayList<>();
        primos.add(2);
        primos.add(3);
        primos.add(5);
        primos.add(7);
        primos.add(11);

        for (int i = primos.size() - 1; i >= 0; i--) {
            reverter.add(primos.get(i));
        }

        System.out.print("Lista: ");
        for (int n : primos) {
            System.out.print(n + " ");
        }

        System.out.println();

        System.out.print("Lista revertida: ");
        for (int n : reverter) {
            System.out.print(n + " ");
        }

    }

}
