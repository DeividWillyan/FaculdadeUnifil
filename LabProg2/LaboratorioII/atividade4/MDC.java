import java.util.*;

public class MDC {

    //Numero primo é somente aquele que divide por 1 e por ele mesmo;

    public static boolean isPrimo() {    
        if(CalculaPrimo(3) == true)
            
            int contador = 3;
            while(contador)
            
        }
    }
    
    
        @SuppressWarnings("unchecked")
        public boolean CalculaPrimo(int numero) {

        int elemesmo = 0, resto = 0, contador = 0;  
        int retorno = 0;
        boolean isPrimo = false;

        while ( numero >= elemesmo){  
            ++elemesmo;                    
            resto = numero % elemesmo;                  
            if ( resto == 0){  
                contador++;  
            }                   
        }  

        if ( contador <= 2)  {  
            isPrimo = true;
        }

        return isPrimo;
    }   
}
