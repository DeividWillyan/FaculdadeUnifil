import java.util.List;

/**
 * Write a description of class GDC here.
 * 
 * @author Deivid Willyan
 * @version 30082016
 */

public class MDC {

    public static Integer primoProximo(Integer n) {

        n+=1
        int primo = 0;
        int count=0;
        
          if (n <= 1) {
            return 2;
            }
        
        for(int i = 2; i < n;i++){         
            
            if(n % i == 0){
                primo = 1;
                n++;
            } else if(primo == 0){
                count++;
                if(count == 2) {
                    break;
                }
            }            
        }

        return n;

    }

    
    public static List<Integer> decomporPrimos(Integer n) {

        throw new UnsupportedOperationException("O aluno ainda não implementou este método.");

    }

    public static Integer calcularMDC(Integer a, Integer b) {
        throw new UnsupportedOperationException("O aluno ainda não implementou este método.");
    }

}
