/**
 * Aula de Recursividade.
 * 
 * A Estrutura do código se dá sempre
 * nesta ordem.
 * 
 * 1º Casos base (em if-else ou switch)
 * 2º Definição de sub-divisão
 * 
 * @author Deivid Willyan 
 * @version 08032016
 */

public class Fibonacci {
      
    public static int fib(int g) {
    
        int anterior = 0;
        int atual = 1;
        
        g--;
        while( g >= 0 ) {
        
            int prox = anterior + atual;
            anterior  = atual;
            atual = prox;
            g--;
            
        }       
        return anterior; 
    }    
    
    // recursividade em ação =D
    public static int rec_fib(int g) {
    
        // casos base
        if (g < 2) {
            return g;
        }
        
        // definição recursiva
        return rec_fib(g - 1) + rec_fib(g - 2);
        
 
    }    
//-----------------------------------------------------------------------------------//    
    
    /**
     * 
     * buscar um elemento em um arranjo
     * @param arr Arranjo a ser buscado.
     * @param val valor buscado no arranjo.
     * @return Indice de val em arr, ou -1 caso não encontre
     * 
     */
    
     public static int buscaPos(int[] arr, int val) {
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }
     
    // recursividade!!
    public static int buscaPos_rec(int[] arr, int val) {
        return buscaPos_recHelper(arr, val, 0);
    }
    
    private static int buscaPos_recHelper(int[] arr, int val, int i) {
    // Casos base
    // 1º caso: ja procurei o arranjo inteiro e não achei
    if (i == arr.length) {
        return -1;
    }
    // 2º caso: encontrei val no indice "x"
    if (arr[i] == val) {
        return i;
    } 
    
    // Definição subdivisão (recursividade) 
    return buscaPos_recHelper(arr, val, i+1);     
    
    }    
//------------------------------------------------------------------------------------//

    public static int buscaMax_rec(int[] arr) {
        return buscaMax_recHelper(arr, 1);
    } 
    private static int buscaMax_recHelper(int [] arr, int i)  {
    
        if (i < arr[i]) {
            return buscaMax_recHelper(arr, i + 1);
    }
    return i;
    
}
    
    
    
//------------------------------------------------------------------------------------//    
    public static int biscaMin_rec(int[] arr) {
        return 0;
    } 
    
    
}    
    