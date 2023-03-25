package Parte1;

public class teste {
    public static void main(String[] args) {
        double x = 1;
        double y = 1;
        int i = 0;
        while (x >= 1.5) {
            x = x / 2;
            y = x + y;
            i++;
        }
        System.out.print(i);
    }
}
