package bublesort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    
    
    public static void main(String[] args) {
    
        try {

        final int MIN_VALOR_LISTA= 1;
        final int MAX_VALOR_LISTA= 60;
        int qtdDeElementos=6;
        int[] lista = new int [qtdDeElementos];
        Random rd = new Random();
        for (int i = 0; i < qtdDeElementos; i++) {
            lista[i]  = rd.nextInt(MIN_VALOR_LISTA,MAX_VALOR_LISTA);
        }
        System.out.println("Array Desordenado: " + Arrays.toString(lista));
        //ORDENAÇÂO

        for (int i = 0; i < qtdDeElementos-1; i++) {
            for (int j = 0; j < qtdDeElementos-1; j++) {
                if (lista[j] > lista[j+1]){
                    int aux = lista[j];
                    lista[j]= lista[j+1];
                    lista[j+1]= aux;
                }
            }
        }
        System.out.println("Array Bublesorteado: "+ Arrays.toString(lista));


            
        } catch (Exception e) {

        }
    }
}
