import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste exercicio4Test.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class exercicio4Test {
  
    //{"omississimo", "dia", "qualquer", "bla", "deivid"}
    
    @Test
    public void exercicio4() {
        
        String[] t1 = {"omississimo", "dia", "qualquer", "bla", "deivid"};
        String[] t2 = {"aula", "moto"};
        String[] t3 = {"carro", "vara"};
        String[] t4 = {"bla", "dia", "rua", "lua"};
        String[] t5 = {"carro", "oluo"};
    
        assertEquals("palindromo omississimo", exercicio4.exercicio4(t1));
        assertEquals("nao palindromo", exercicio4.exercicio4(t2));
        assertEquals("nao palindromo", exercicio4.exercicio4(t3));
        assertEquals("nao palindromo", exercicio4.exercicio4(t4));
        assertEquals("nao palindromo", exercicio4.exercicio4(t5));
    
    }
    
}
