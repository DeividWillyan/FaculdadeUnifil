public class exercicio2 {

    /* Faça um método static na classe Principal que receba, como parâmetro, um arranjo
       de números inteiros e retorne o somatório de seus valores. */
    
    public static void main(String[] args) {
        
        int[] ArrayTesteAlimentacao = new int[]{1,2,3,4};
        System.out.println(ArrayInt(ArrayTesteAlimentacao));
    }
       
       
    public static int ArrayInt(int[] num) {
        
        int soma = 0;
        
        for(int i = 0 ; i < num.length ; i++) {
       
            soma = soma + num[i];
            
        }   return soma;
    }
}
