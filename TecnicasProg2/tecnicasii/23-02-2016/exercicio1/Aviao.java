import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Aviao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aviao extends Actor
{
    public void act()  {
        
        if (Greenfoot.isKeyDown("left")) {
            move(-2);
        }
        
        if (Greenfoot.isKeyDown("right")) {
            move(2);
        }
           
        if (Greenfoot.isKeyDown("up")) {
            turn(2);
            move(2);
        }
        
        if (Greenfoot.isKeyDown("down")) {
            turn(-2);
            move(-2);
        }
        
    }   
    
}
