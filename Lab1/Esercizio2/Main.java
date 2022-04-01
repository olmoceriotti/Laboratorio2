package Esercizio2;

public class Main {
    public static void main(String[] args) {
        System.out.println(fibonacci(6));
    }

    public static int fibonacci(int x){
        if(x==0) return 0;
        if(x==1) return 1;
        else{
            return fibonacci(x-1) + fibonacci(x-2);
        }
    }
}
