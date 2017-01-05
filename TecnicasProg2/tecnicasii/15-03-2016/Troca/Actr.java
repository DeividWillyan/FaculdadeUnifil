import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class actor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Actr extends Actor
{
    MyWorld mw;
    public Actr(int imgn)
    {
        /*Recebe um int como identificador do objeto, 1 = Elephant, 2 = Spider;
           * como não encontrei um jeito simples de usar as imagens do próprio
           * greenfoot no código, eu coloquei elas na pasta Images,
           * e utilizei como se fossem imagens de fora
           */
        if(imgn==1)
        {
            
            setImage(new GreenfootImage("elephant.png"));
        }
        else
        {
            setImage(new GreenfootImage("spider.png"));
        }
    }
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            if(mw==null) mw = (MyWorld)getWorld();
            
            mw.actors(this);
        }
    }    
}
