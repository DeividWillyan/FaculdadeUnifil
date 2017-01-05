import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;


public class MyWorld extends World
{


    
        Cartas cardMove = null;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 

        P1 p1 = new P1();
        P2 p2 = new P2();
        Cartas cartas = new Cartas();

        addObject(p1, 200, 100);
        addObject(p2, 600, 100);
        addObject(cartas, 600, 450);
        
        ArrayList ar = new ArrayList();

        if(Greenfoot.mouseDragged(null)){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if(cardMove == null){
                Actor actor = mouse.getActor();
                Cartas cardTest = (Cartas)actor;
                if(actor != null){

                    if(cardMove == null){
                        for(int i=0; i< ar.size(); i++){
                            onMove(cartas);
                        }
                    }
                }
            }else{
                cardMove.setLocation(mouse.getX(), mouse.getY());
            }
        }else if(Greenfoot.mouseDragEnded(null) && cardMove != null){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            boolean moved=false;

            moved = false;
            cardMove = null;
           
        }

    }
    
      private void onMove(Cartas card){
        cardMove = card;
     
        this.removeObject(cardMove);
        this.addObject(cardMove, cardMove.getX(), cardMove.getY());
    }
    
}
