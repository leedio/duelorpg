package Outros;

import java.util.Scanner;

public class Fibonnaci {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor do Numero:");
        int numero = scan.nextInt();

        System.out.println("Sequencia Fibonacci com " + numero + " termos:");
        for (int i = 0; i < numero; i++) {
            System.out.println(fibonacci(i)+ " ");
        }
    }


    public static int fibonacci(int numero){
        if ( numero <= 1) return numero;
        else {
            return fibonacci(numero - 1 ) + fibonacci(numero - 2);
        }
    }
}
