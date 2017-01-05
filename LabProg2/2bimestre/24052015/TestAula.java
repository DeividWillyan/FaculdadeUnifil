import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste TestAula.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */


public class TestAula {
    
    @Test
    public void margeOrdenacaoTeste() {
        int[] a = {1,3,5,7,9};
        int[] b = {2,4,6,8,10};
        int[] r = {12,23,45,56,67};

        assertArrayEquals(r, Aula.mergeOrdenado(a, b));

    }

}