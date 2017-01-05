/**
   Algoritimos de Busca
      Algoitmos que encontram um determinado elemento em um conjunto.
   
   - Busca Sequencial: dado um arranjo de elementos, 
   busca um porum até encontrar o elemnto ou percorrer todo o conjunto.
   Problema : Desempenho lento, quanto mais elementos na busca,  mais lento ela é.
   
   @author Deivid Willyan Rodrigues Fabiano
   @version 29032016   
*/

public class BuscaSequencial {

    /**
    
       @param arr arranjo de numeros para busca sequencial
       @param elem numero buscado
       @return retorna o valor do elemento buscado ou -1 no caso de não encontrado.
       
    */
    
    public static int buscaSeq(int[] arr, int elem) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elem) {
                return i;
            }
        }                
        return -1;
    }
    
}
