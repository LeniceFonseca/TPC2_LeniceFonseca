package Parte2;

import java.util.Random;

public class Ex8 {

    public static void main(String[] args) {

        Random random = new Random();

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1, 100);
        }

        for (int n: arr) {
            System.out.print(n + " ");
        }

    }

}
