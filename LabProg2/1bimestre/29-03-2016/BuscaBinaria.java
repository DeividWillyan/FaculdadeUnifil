/**
   -Busca Binaria: Parto do pressuporto que
   o conjunto de elementos já esta ordenado.
*/

public class BuscaBinaria {
    /**
    
       @param arr arranjo de numeros para busca sequencial
       @param elem numero buscado
       @return retorna o valor do elemento buscado ou -1 no caso de não encontrado.       
    
    */
   
    public static int buscaBin(int[] arr, int elem) {

        int esquerda = 0;
        int direita = arr.length;
       
        do {
            int meio = (esquerda + direita) / 2;
            if(arr[meio] == elem) {
                return meio;
            } else if (arr[meio] > elem) {
                direita = meio;
            } else { //if (arr[meio] < elem) {
                esquerda = meio + 1;
            }            
        } while(esquerda < direita);
        
          return -1;   
                   
        }
       
    }