package Esercizio1;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(funzione(4));
    }   

    public static int funzione(int x) {
        if (x < 0)
            return -1;
        if (x == 0) {
            return 5;
        } else {
            return funzione(x - 1) + 3;
        }
    }
}