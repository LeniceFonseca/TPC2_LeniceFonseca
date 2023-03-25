package Parte2;

import java.util.ArrayList;

public class Ex3 {

    public static void main(String[] args) {

        ArrayList<Integer> primos = new ArrayList<>();
        primos.add(2);
        primos.add(3);
        primos.add(5);
        primos.add(7);
        primos.add(11);

        for (int n : primos) {
            System.out.print(n);
        }

    }

}
