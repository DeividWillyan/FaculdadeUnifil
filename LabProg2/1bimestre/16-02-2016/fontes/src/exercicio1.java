public class exercicio1 {
	
		/* Faça um método static na classe Principal que calcule o número de fibonacci, dado
		   um valor recebido por parâmetro. Lembre-se que fib(0) = 0, fib(1) = 1 e todo outro
		   fib(x) = fib(x − 1) + fib(x − 2). */
				
	public static int metFibonacci(int x) {       
       if(x < 2) {
           //System.out.print(x);
           return x;
       } else {
           //System.out.print(metFibonacci(x - 1) + metFibonacci(x - 2));
           int fibonacci = metFibonacci(x - 1) + metFibonacci(x - 2);
           return fibonacci;
       }  
    }
}