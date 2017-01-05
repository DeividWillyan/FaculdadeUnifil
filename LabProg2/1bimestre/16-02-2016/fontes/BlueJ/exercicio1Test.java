import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste exercicio1Test.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class exercicio1Test {
    
    @Test
    public void fibonacciTest() {
        
        assertEquals(0, exercicio1.metFibonacci(0));
        assertEquals(1, exercicio1.metFibonacci(1));
        assertEquals(1, exercicio1.metFibonacci(2));
        assertEquals(5, exercicio1.metFibonacci(5));
        assertEquals(34, exercicio1.metFibonacci(9));
  
    }  
    
}
