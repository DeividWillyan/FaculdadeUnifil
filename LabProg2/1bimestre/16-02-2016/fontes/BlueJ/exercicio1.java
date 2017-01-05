/**
 * Exercicio 1 da lista trab00.
 *  
 *  @author Deivid Willyan
 *  @version 25022016
 *  
 */

public class exercicio1 {
    
        /**
         *  Faça um método static na classe Principal que calcule o número de fibonacci, dado
         *  um valor recebido por parâmetro. Lembre-se que fib(0) = 0, fib(1) = 1 e todo outro
         *  fib(x) = fib(x − 1) + fib(x − 2). 
         *  
         *  @param x recebe um numero inteiro para fazer o calculo fibonacci.
         *  @return retorna o resultado do calculo fibonacci
         */
    // Metodo inteiro, que recebe um parametro inteiro.         
    public static int metFibonacci(int x) {       
       // verifica se o paramento x é menor que 2, caso seja, retorne o valor de x.
        if(x < 2) {
           return x;
       // caso contrario, efetua o calculo matematico de fobonacci e retorna seu resultado.    
       } else {
           int fibonacci = metFibonacci(x - 1) + metFibonacci(x - 2);
           return fibonacci;
       }  
    }
}