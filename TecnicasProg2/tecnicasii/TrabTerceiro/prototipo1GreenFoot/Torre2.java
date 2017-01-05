import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Torre2 extends Actor {

    public void act()     {
       //getWorld().addObject(this,200,200);
       x2();
    }    
    
    public Torre2(){
        GreenfootImage image = new GreenfootImage("Tower.png");
        setImage(image);   
    }
    
    public Integer x2(){
        if(Greenfoot.mouseClicked(this)){
            System.out.println("teste 2");
            return 2;
        }
        return null;
    }
}
