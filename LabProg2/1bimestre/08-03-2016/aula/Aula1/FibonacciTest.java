import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste FibonacciTest.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class FibonacciTest {
    
    @Test
    public void fibTest() {
    
        assertEquals(0, Fibonacci.fib(0));
        assertEquals(1, Fibonacci.fib(1));
        assertEquals(1, Fibonacci.fib(2));
        assertEquals(2, Fibonacci.fib(3));
        assertEquals(3, Fibonacci.fib(4));
        assertEquals(5, Fibonacci.fib(5));
        assertEquals(8, Fibonacci.fib(6));
    
    }
    
    @Test
    public void fibTestRecursivo() {
    
        assertEquals(0, Fibonacci.rec_fib(0));
        assertEquals(1, Fibonacci.rec_fib(1));
        assertEquals(1, Fibonacci.rec_fib(2));
        assertEquals(2, Fibonacci.rec_fib(3));
        assertEquals(3, Fibonacci.rec_fib(4));
        assertEquals(5, Fibonacci.rec_fib(5));
        assertEquals(8, Fibonacci.rec_fib(6));
    
    }

    @Test
    public void maxRec() {

        int[] x = {1,2,3};
        
        assertEquals(3, Fibonacci.buscaMax_rec(x));
        
    
    
    }
    
    
}
