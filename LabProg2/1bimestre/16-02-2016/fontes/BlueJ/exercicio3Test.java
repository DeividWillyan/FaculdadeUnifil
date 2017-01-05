import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * A classe de teste exercicio3Test.
 *
 * @author  (seu nome)
 * @version (um número de versão ou data)
 */
public class exercicio3Test {
   
    @Test
    public void ExercicioA() {
           
        assertEquals("nao palindromo", exercicio3.exercicioA("lua"));
        assertEquals("palindromo", exercicio3.exercicioA("lol"));
        assertEquals("palindromo", exercicio3.exercicioA("omississimo"));
        assertEquals("nao palindromo", exercicio3.exercicioA("acucar"));
        assertEquals("nao palindromo", exercicio3.exercicioA("deivid"));
       
    }    
    
    @Test
    public void ExercicioB() {
           
        assertEquals("palindromo", exercicio3.exercicioB("ROMA ME TEM AMOR"));
        assertEquals("palindromo", exercicio3.exercicioB("lol lol"));
        assertEquals("nao palindromo", exercicio3.exercicioB("omississimo nao"));
        assertEquals("nao palindromo", exercicio3.exercicioB("acucar do mal"));
        assertEquals("nao palindromo", exercicio3.exercicioB("deivid willyan"));
       
    } 
    
}
