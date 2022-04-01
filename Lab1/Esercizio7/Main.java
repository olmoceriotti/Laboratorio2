package Esercizio7;

public class Main {
    public static void main(String[] args) {
        System.out.println(count(1111110));
        
    }

    public static int count(int value) {
        if(value == 0) return 0;
        else{
            return 1 + count(value/10);
        }
    }
}
