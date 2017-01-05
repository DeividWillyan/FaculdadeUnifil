/**
 *  Exercicio 5 da lista trab00.
 *  
 *  @author Deivid Willyan
 *  @version 25022016
 *  
 */

public class exercicio5 {
   
    /**
     *   Faça um método static na classe Principal que escreva na tela todos os números pares
     *   de 1 a 10000 que são palíndromos.
     * 
     *   @return retorna o valor final do numero par que é palindromo. 
     */
       
       // metodo static do tipo inteiro que se chama pares.
       public static int pares() {                    
                     
           // variavel auxiliar tipo inteiro, iniciada com zero.
           int returnn = 0;
           
           //  um loop de 1 a 10000
           for (int i = 1 ; i <= 10000 ; i++) {
               
               // se o resto da varivel 2 for igual a zero, significa que é um numero par
               if ((i % 2 ) == 0) {                     // % = resto ( 0 par, 1 impar)
                   
                   // cria uma nova variavel do tipo String chamada num, e ela recebe a variavel i convertendo de inteiro pra String.
                   String num = Integer.toString(i);
                   
                   // pega o tamanho do indice da varivel num.
                   int j = num.length() - 1;
                   // variavel auxiliar do tipo String, em branco, ela ira receber as letras.
                   String recebe = "";

                   // um outro loop inteiro que ira percorrer os indices da palavra num, de forma decrescente
                   for(int x = 0 ; j >= x ; j--) {
                       // recebe ira receber a ultima letra da palavra e assim sucetivamente.
                       recebe = recebe + num.charAt(j);
                    }
                    
                    // caso a variavel auxiliar seja igual a variavel num, significa que é um palindromo e imprime na tela.
                   if(recebe.equals(num))  {
                       System.out.println(i);
                       returnn = i;
                   }                                      
               }                                      
                     
       }
       return returnn;
    }              
}  
