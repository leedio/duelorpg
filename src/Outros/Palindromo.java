package Outros;

public class Palindromo {
    
    public static void main(String[] args) {
        
        String palavra1 ="radar";
        String palavra2 ="java";
        String palavra3 ="A man, a plan, a canal, Panama!";

        System.out.println(""+ palavra1 + " é um palíndromo ? " + ehPalindromo(palavra1));
        System.out.println(""+ palavra2 + " é um palíndromo ? " + ehPalindromo(palavra2));
        System.out.println(""+ palavra3 + " é um palíndromo ? " + ehPalindromo(palavra3));

    }

    public static boolean ehPalindromo(String palavra){
        palavra=palavra.toLowerCase();
        palavra=palavra.replaceAll("[^-zA-Z0-9]", "");

        int aux = 0;
        int prox= palavra.length() -1;

        while ( aux < prox){
            if ( palavra.charAt(aux) != palavra.charAt(prox)){
                return false;
            }
            aux++;
            prox--;
        }
        return true;
    }
}
