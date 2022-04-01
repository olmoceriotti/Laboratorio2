package Esercizio4;

public class Main {
    public static void main(String[] args) {
        System.out.println(gcdSlow(12, 4));
        
    }

    public static long gcdSlow(long a, long b) {
        if (b == 0) return a;
        if (b > 0 && a >= b) return gcdSlow(a-b, b);
        else{
            return gcdSlow(b, a);
        }
    }
}

