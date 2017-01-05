import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Torre3 extends Actor {

    public void act()     {
       //getWorld().addObject(this,200,200);
       x3();
    }    
    
    public Torre3(){
        GreenfootImage image = new GreenfootImage("Tower.png");
        setImage(image);   
    }
    
    public Integer x3(){
        if(Greenfoot.mouseClicked(this)){
            System.out.println("teste 3");
            return 3;
        }
        return null;
    }
}
