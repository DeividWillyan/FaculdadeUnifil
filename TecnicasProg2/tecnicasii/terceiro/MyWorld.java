import greenfoot.*;
import javax.swing.JOptionPane;
import java.util.Random;

public class MyWorld extends World { 
    
    public boolean primeiroclick = true;   
    int input = 0;   
    Actor aUm, aDois;
   
    public MyWorld()    {  
        super(700, 400, 1);
       
    }

    public void act()    {
           tela();
    }
   
     public void prepararAtores(int input)  {
       for ( int i=0 ;i< input ; i++ ) {
           addObject(new Actr(personagensAleatorios(1,2)),personagensAleatorios(15,685),personagensAleatorios(15,385));
        }   
        
    }
    
    public int personagensAleatorios(int min,int max) {
        return min + (int)(Math.random() * max);
    }
    
    public void tela() {
      if(input == 0){
           
           input = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de atores: "));
          
          if(input > 1){
             prepararAtores(input);
            } 
        }
    }
    
    public void trocar() {
       int xUm = aUm.getX();
       int yUm = aUm.getY();
       aUm.setLocation(aDois.getX(),aDois.getY());
       aDois.setLocation(xUm,yUm);
    }
    
    public void actors(Actor a){
    
        if(primeiroclick){
    
            aUm = a;
            primeiroclick = false;
        
        }else{
            primeiroclick = true;
            aDois = a;
            trocar();
        }
    }
    
    
}