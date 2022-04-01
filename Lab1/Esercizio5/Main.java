package Esercizio5;

public class Main {
    public static void main(String[] args) {
        
    }

    public static long gcdFast(long a, long b) {
        if(b == 0) return a;
        else{
            return gcdFast(b, a%b);
        }
    }
}
