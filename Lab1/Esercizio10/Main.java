package Esercizio10;

public class Main {
    public static void main(String[] args) {
        System.out.println(reversDigits(102));
        
    }

    public static int reversDigits(int num) {
        if (num == 0) return 0;
        else{
            return (num%10)*(int)Math.pow(10, count(num)-1)+reversDigits(num/10);
        }
    }

    public static int count(int value) {
        if (value == 0)
            return 0;
        else {
            return 1 + count(value / 10);
        }
    }
}
