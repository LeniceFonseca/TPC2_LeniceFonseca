package Parte1;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double x = 0;
        double s = 0;

        while(s < 0.01) {
            s = 1.0 / (1 + n * n);
            n++;
            x = x + s;
        }
    }
}
