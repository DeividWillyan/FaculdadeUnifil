/**
 * Exercicio 2 da lista trab00.
 *  
 *  @author Deivid Willyan
 *  @version 25022016
 *  
 */

public class exercicio2 {

    /** 
     *   Faça um método static na classe Principal que receba, como parâmetro, um arranjo
     *   de números inteiros e retorne o somatório de seus valores. 
     *   
     *   @param num recebe um arranjo de numeros do tipo inteiro para a somatoria.
     *   @return retorna a somatoria do arranjo do parametro num.
     *   
     */
   
    
    // metodo inteiro chamado ArrayInt recebe um arranjo no paramento num.   
    public static int ArrayInt(int[] num) {
        
        // nossa variavel de soma, iniciada com o valor de zero.
        int soma = 0;
        
        // um loop de repetição que ira percorrer todo os numeros que estão dentro do arranjo num.
        for(int i = 0 ; i < num.length ; i++) {
            
            // ira fazer a soma do arranjo, pegando da posisao 0 até a ultima do num.
            soma = soma + num[i];
        
        }   
        // retorna o resultado final da soma.
        return soma;
    }
}
