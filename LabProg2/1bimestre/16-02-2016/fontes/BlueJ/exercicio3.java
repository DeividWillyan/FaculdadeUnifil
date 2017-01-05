/**
 *  Exercicio 3 da lista trab00.
 *  
 *  @author Deivid Willyan
 *  @version 25022016
 *  
 */

public class exercicio3 {
        
    /** 
     *  Faça um método static na classe Principal que recebe uma String por parâme-
     *  tro e indique se trata-se de um palíndromo. Por exemplo, o método deve indicar
     *  “OMISSISSIMO” como palíndromo, enquanto “ACUCAR” como não-palíndromo.
     * 
     *  @param verifica o parametro vereifica recebe uma String para verificacao do teste de palindromo.
     *  @return retorna se o parametro inserido é palindromo ou não.
     * 
     */
    
    // exercicio A, recebe como parameto uma String (verifica)
    public static String exercicioA(String verifica) {
        
        // cria uma variavel do tipo inteiro chamada de j, de atribui a ela o tamanho do indice da string verifica.
        int j = verifica.length() - 1;
        // cria uma String recebe em branco, ela ira receber as letras da palavra e reescrever no final de tras para frente.
        String recebe = "";

        // realiza um loop do ultimo indice da string verifica até o primeiro, decrescente.
        for(int i = 0 ; j >= i ; j--) {
            // atribui a varivel recebe o ultimo caracter da palavra e assim por diante, decrementando.
           recebe = recebe + verifica.charAt(j);
        }
        // verifica se a String de entrada é igual a string recebe, caso sejam iguais, é um palindromo.
        if(recebe.equals(verifica))  {
            return "palindromo";
        } else {
            return "nao palindromo";
        }

    }

    public static String exercicioB(String verifica) {
        
        /**  
         *   Faça um método similar ao anterior, porém este deve ignorar espaços em branco,
         *   tal que a String “ROMA ME TEM AMOR’ é considerado um palíndromo. 
         *   
         *   @param verifica o parametro vereifica recebe uma String para verificacao do teste de palindromo.
         *   @return retorna se o parametro inserido é palindromo ou não.
         *  
         */
                
        //  unica diferença deste codigo pelo de cima é que, troca onde tem espaço " " para ficar sem espaço "".
        verifica = verifica.replaceAll(" ",""); 
        
        int j = verifica.length() - 1;
        String recebe = "";

        for(int i = 0 ; j >= i ; j--) {
           recebe = recebe + verifica.charAt(j);
        }
        
        if(recebe.equals(verifica))  {
            return "palindromo";
        } else {
            return "nao palindromo";
        }
    }
}
