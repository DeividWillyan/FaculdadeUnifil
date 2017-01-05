import greenfoot.*; 

public class MyWorld extends World {

    int timer = 3600;
    Tempo timerText = new Tempo();
        
    public MyWorld() {
        
        super(600, 400, 1); 
        
        carStop1 c1 = new carStop1();
        addObject(c1, 360, 76);
        
        carStop2 c2 = new carStop2();
        addObject(c2, 185, 76);
        
        CarMove cm = new CarMove();
        addObject(cm, 185, 120);
              
        addObject(timerText,480, 28);
        timerText.setText("" + (timer/60));
        
        if( timer % 60 == 0 ) {
            timerText.setText("" + (timer/60));
        }        
    }
  
    public void act() {        
        
        if (timer != 0) {
            timer--; 
            updateTimer();            
        } else {
            timerText.setText("GameOver");
            Greenfoot.stop();
        }            
    }
       
    public void updateTimer() {    
        if( timer % 60 == 0 ) {
            timerText.setText("" + (timer/60));
        }               
    }    

   
}

