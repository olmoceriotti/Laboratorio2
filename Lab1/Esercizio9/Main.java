package Esercizio9;

public class Main {
    public static void main(String[] args) {
        String s = convertDecimalS(255, 16);
        System.out.println(s);
        
    }

    public static void convertDecimal(int n, int b) {
        if(n != 0){
            convertDecimal(n/b, b);
            System.out.print(n % b);
        }
    }

    public static String convertDecimalS(int n, int b) {
        if (n != 0) {
            convertDecimal(n / b, b);
            return "" + n % b;
        }else{
            return "";
        }
    }
}
