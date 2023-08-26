package Outros;

public class BubbleSort {
    
public static void main(String[] args) {
    
    int vetor[] = {7,5,2,1,4,9,3,5,8,};
    
    bublesort(vetor);

}

public static void bublesort(int vetor[] ){
    int tamanho =vetor.length;
    boolean continua = true;
    int aux;

    while (continua){
        continua=false;
        for (int i = 0; i < tamanho-1; i++) {
            if (vetor[i] > vetor[i+1]){
                aux=vetor[i];
                vetor[i]= vetor[i+1];
                vetor[i+1]= aux;
                continua=true;
            }
        }
    }

    for (int i : vetor) {
        System.out.print(i +" -> ");
    }
}
}
