import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Ok extends Actor {

    TorresDeHanoi honoi = new TorresDeHanoi();

    public void act()     {
        //getWorld().addObject(this,200,200);
        teste();
    }    

    public Ok(){
        GreenfootImage image = new GreenfootImage("ok.png");
        setImage(image);   
    }

    public void teste(){
        if(Greenfoot.mouseClicked(this)){

        }
    }

    
}
