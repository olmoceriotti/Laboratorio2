package Esercizio3;

public class Main {
    public static void main(String[] args) {
        System.out.println(ack(4, 4));
        
    }

    public static long ack(long x, long y) {
        if(x == 0) return y +1;
        if(y == 0) return ack(x-1, 1);
        else{
            return ack(x-1, ack(x, y -1));
        }
    }
}
