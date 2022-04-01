package Esercizio6;

public class Main {
    public static void main(String[] args) {
        
    }

    public static long powerSlow(long a , long b) {
        if(b == 0) return 1;
        else{
            return a*powerSlow(a, b-1);
        }
    }

    public static long powerFast(long a, long b) {
        if(b== 0) return 1;
        if(b > 0 && b%2==0) return powerFast(a*a, b/2);
        else{
            return a* powerFast(a * a, b/2);
        }
    }
}
