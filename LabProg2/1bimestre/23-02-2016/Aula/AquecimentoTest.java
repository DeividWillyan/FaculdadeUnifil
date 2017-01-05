import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class AquecimentoTest {
    
    @Test
    public void somatorioZeroTest() {
        
        int[] umZero = { 0 };
        int[] doisZeros = { 0, 0 };
        int[] variosZeros = { 0, 0, 0, 0 };
        int[] teste1 = { 0, 1000 };
        int[] teste2 = { 1 ,2  ,3 };
        int[] teste3 = { 0, -1, 2, -3, 4, -5 };
        
        assertEquals(0, Aquecimento.somatorio(umZero));
        assertEquals(0, Aquecimento.somatorio(doisZeros));
        assertEquals(0, Aquecimento.somatorio(variosZeros));
        assertEquals(1000, Aquecimento.somatorio(teste1));
        assertEquals(6, Aquecimento.somatorio(teste2));
        assertEquals(-3, Aquecimento.somatorio(teste3));
        
    }
    
    @Test
    public void fibonacciTest() {
        
        assertEquals(0, Aquecimento.fibonacci(0));
        assertEquals(1, Aquecimento.fibonacci(1));
        assertEquals(1, Aquecimento.fibonacci(2));
        assertEquals(5, Aquecimento.fibonacci(5));
        assertEquals(34, Aquecimento.fibonacci(9));
  
    }
    

}
