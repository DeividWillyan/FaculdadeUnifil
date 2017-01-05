import greenfoot.*;  

public class CarMove extends Actor {

    public void act() {
        
        movimentacao();
        gameOver();
      
    }      
       
    public void gameOver() {
    
        if (getOneIntersectingObject(carStop2.class) != null) {
           
            //Greenfoot.stop();
        }
        
        if (getOneIntersectingObject(carStop1.class) != null) {
            
            //Greenfoot.stop();
        }
    
    }
    
    
    
    public void movimentacao() {
    
        if (Greenfoot.isKeyDown("left")) {
            move(-1);
        }
        
        if (Greenfoot.isKeyDown("right")) {
            move(1);
        }
           
        if (Greenfoot.isKeyDown("up")) {
            turn(-1);
            //move(1);
        }
        
        if (Greenfoot.isKeyDown("down")) {
            turn(1);
            //move(-1);
        }    
    
    }
}
