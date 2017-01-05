import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Torre1 extends Actor {

    public void act()     {
       //getWorld().addObject(this,200,200);
       x1();
    }    
    
    public Torre1(){
        GreenfootImage image = new GreenfootImage("Tower.png");
        setImage(image);   
    }
    
    public Integer x1(){
        if(Greenfoot.mouseClicked(this)){
            System.out.println("teste 1");
            return 1;
        }
        return null;
    }
    
}
