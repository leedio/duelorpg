package Outros;

public class Fibonacci {
    
     public static void main(String[] args) {
        int numero = 10;
        for (int i = 0; i < numero; i++) {
            System.out.println(fib(i) + " ");
        }

     }    
    
    public static int fib(int numero){
        if(numero<=1) return numero;
        else{
            return fib(numero-1) + fib(numero-2);
        }

    }
}
