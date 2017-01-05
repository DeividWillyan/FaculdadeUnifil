import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World {

    SinalDeMais smais = new SinalDeMais();
    SinalDeMenos smenos = new SinalDeMenos();
       
    public MyWorld()  {    
         super(600, 400, 1);         
         addObject(smais, 520, 320);
         addObject(smenos, 520, 370);
         addObject(new Capiroto(), 150, 100);
        
         act();
       
    }
    
    int i = 0;
    int move = 150;
    public void act() {
       
        Capiroto cpta = new Capiroto();
        
        if (Greenfoot.mouseClicked(smais)) {
            move = move + 90;                        
            addObject(cpta, move, 100);
        }  
        
        if (Greenfoot.mouseClicked(smenos)) {
           removeObject(cpta);
        }
        

    }
     
    
    
}