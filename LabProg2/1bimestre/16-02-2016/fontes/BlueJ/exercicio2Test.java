import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste exercicio2Test.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class exercicio2Test {
  
    @Test
    public void ArrayInt() {
           
        int[] t1 = {1,2,3,4};           //10
        int[] t2 = {1,-2,3,-4};         //-2
        int[] t3 = {0,1,0,1};           //2
        int[] t4 = {1,1,1,1};           //4
        int[] t5 = {90,56,233,9999};    //10378
        
        assertEquals(10, exercicio2.ArrayInt(t1));
        assertEquals(-2, exercicio2.ArrayInt(t2));
        assertEquals(2, exercicio2.ArrayInt(t3));
        assertEquals(4, exercicio2.ArrayInt(t4));
        assertEquals(10378, exercicio2.ArrayInt(t5));
       
    }    
}
