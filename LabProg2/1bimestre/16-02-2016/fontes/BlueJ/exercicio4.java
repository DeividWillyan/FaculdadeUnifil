/**
 *  Exercicio 4 da lista trab00.
 *  
 *  @author Deivid Willyan
 *  @version 25022016
 *  
 */

public class exercicio4 {
   
    /**
     *  Faça um método static na classe Principal que receba um conjunto de palavras em
     *  um arranjo (vetor) e escreva na tela apenas as palavras que são palíndromos.
     *  
     *  @param verifica recebe um arranjo de palavras.
     *  @return retorna as palavras palindromes do arranjo.
     *  
     */
    
       // {"omississimo", "dia", "qualquer", "bla", "deivid"}
       
       
    // cria um metodo stitic String chamado exercicio4 que recebe como parametro um arranjo do tipo string armazendo na variavel verifica.   
    public static String exercicio4(String[] verifica) {
        
        // realiza um loop que percorre todas as palavras do arranjo
        for(int i = 0 ; i < verifica.length ; i++) {
                  
            // uma variavel auxiliar do tipo inteiro, iniciada com valor zero.
            int igual = 0;
            // uma variavel tipo inteiro, que recebe o tamanho do indice de cada palavra.
            int x = verifica[i].length() - 1;
        
            // um segundo loop que sera execultado internamente no primeiro, ele percorreca cada letra da palavra
            for(int j = 0 ; j < verifica[i].length() ; j++) {
                
                // verifica se oconteudo do indice 0 da variavel j é igual o ultimo indice da varivel.
                if ( verifica[i].charAt(j) == verifica[i].charAt(x--) ) {
                    // caso seja igual, a variavel auxiliar ira contar +1.
                    igual++;
                 }
            }
            
                // verificamos agora se o tamanho da nossa variavel igual é igual o tamanho da nossa palavra, caso seja retorna que é um palindromo.
            if ( igual == verifica[i].length() ) {
                return "palindromo " + verifica[i];
            } else {
                return "nao palindromo";
            }
        } 
        return "";
    }
}