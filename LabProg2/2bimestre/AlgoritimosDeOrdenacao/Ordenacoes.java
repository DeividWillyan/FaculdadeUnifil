import java.util.Arrays;
/**
 * Escreva a descrição da classe Ordenacoes aqui.
 * 
 * @author Deivid Willyan e Pitty Bixa
 * @version 28/04/2016
 */
public class Ordenacoes {
       
     // TESTE {9,1,8,2,7,3}
    public static void orderPorSelecao(int[] vetor) {          
        System.out.println("-> "+Arrays.toString(vetor));        
        for (int i = 0; i < vetor.length - 1; i++)  {
            int index = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[index]) {
                    index = j;
                }
            }      
            int menor = vetor[index]; 
            vetor[index] = vetor[i];
            vetor[i] = menor;
            
             System.out.println(Arrays.toString(vetor));            
        }       
        System.out.println("-> "+Arrays.toString(vetor));   
    }    
    
    
    /*-----------------------------------------------Deivid-----------------------------------*/
     
    public static void ordenarPorBolha(int[] vetor) {
        System.out.println("-> "+Arrays.toString(vetor));    
        boolean trocou;
        do {
            trocou = false;
            for(int i = 1; i < vetor.length; i++) {
                if(vetor[i-1] > vetor[i]) {
                    int temp = vetor[i-1];
                    vetor[i-1] = vetor[i];
                    vetor[i] = temp;
                    trocou = true;
                }
            }
            System.out.println("-> "+Arrays.toString(vetor));  
        }   while(trocou);
    }
  
     /*------------------------------------------------------------Deivid-----------------------------------*/
    
    public static void ordenarPorInsercao(int[] monteComprado) {
        for (int i = 1; i < monteComprado.length; i++) {
            int anterior = i - 1;
            int atual = i;
            while (anterior >= 0 && monteComprado[anterior] > monteComprado[atual]) {
                trocar(monteComprado, anterior, atual);
                anterior--;
                atual--;
            }
            System.out.println("-> "+Arrays.toString(monteComprado));  
        }
    }
    
    private static void trocar(int[] ordenado, int i, int j) {
        int seguro = ordenado[i];
        ordenado[i] = ordenado[j];
        ordenado[j] = seguro;
    }

      /*------------------------------------------------------------Deivid-----------------------------------*/
      
      
      

    }


