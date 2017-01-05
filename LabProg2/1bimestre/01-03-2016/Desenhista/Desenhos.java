import java.awt.Dimension;
import java.awt.Graphics2D;


/**
 * Write a description of class Desenhos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Desenhos {
    
    //Definindo Constantes 
    final static double LARGURA_PADRAO = 800.0;
    final static double ALTURA_PADRAO = 600.0;
    
    public static void desenhoLivre(Graphics2D pincel, Dimension dim) {      
       
        
    }
    
    public static void desenharAsterisco(Graphics2D pincel) {
      
         // a,b,c usado nas cordenadas (x,y)
        int a = 50, b = 100, c = 75;        
      
        pincel.drawLine(a,b, b,a);
        pincel.drawLine(a,a, b,b);
        pincel.drawLine(c,a, c,b);
            
    }    
    
    public static void desenharComputador(Graphics2D pincel) {
        int a = 200, b = 300, c = 75;        
      
        pincel.drawRect(a,a, b,b);
 

    }
}
