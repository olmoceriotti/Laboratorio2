package Esercizio8;

public class Main {
    public static void main(String[] args) {
        int x = 12345;
        printDecimal(x);
        System.out.println();
        System.out.println(printDigit(x, 2));
        
    }

    public static void printDecimal(int n) {
        if(n!= 0){
            printDecimal(n/10);
            System.out.print(n%10);
        }
    }

    public static int printDigit(int n, int k) {
        if(k == 0){
            return n%10;
        }else{
            return printDigit(n/10, k-1);
        }
    }
}
