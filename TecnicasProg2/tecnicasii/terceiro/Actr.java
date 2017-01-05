import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Actr extends Actor
{
    MyWorld myworld;
  
    public void act()  {
      
        if(Greenfoot.mouseClicked(this)){
            if(myworld == null) {
                myworld = (MyWorld)getWorld();
                myworld.actors(this);
            }
        }
           
    }  
  
   public Actr(int personagens){
      
       switch (personagens){        
          case  1:
                setImage(new GreenfootImage("elephant.png"));
                break;
          case  2:      
                setImage(new GreenfootImage("lemur.png"));
                break;
                        
        }
        
    }       
}