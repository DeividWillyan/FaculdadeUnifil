import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;
import java.util.Random;
/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    private boolean firstclick = true;
    Actor fa;
    Actor sa;
   
    int num=0;
    public MyWorld()
    {   
        super(600, 400, 1); 
       
    }
    public void act()
    {
        //Verifica se é o primeiro click, assim salvando as coordenadas do objeto que foi clicado
        if(num==0)
        {
         num = Integer.parseInt(JOptionPane.showInputDialog("Numero de objetos:"));
            if(num>1)
            {
                prepareobjects(num);
            }
        }
    }
    public void prepareobjects(int num)
    {
       
        for(int i=0;i< num;i++)
        {
            addObject(new Actr(rng(1,2)),rng(10,590),rng(10,390));
        }
    }
    public int rng(int min,int max)
    {
        return min + (int)(Math.random() * max); 
    }
    public void actors(Actor a)
    {
        if(firstclick){
            fa = a;
            firstclick=false;
        }
        else{
            firstclick=true;
            sa = a;
            swap();
        }
    }
    public void swap()
    {
        int x = fa.getX();
        int y = fa.getY();
        fa.setLocation(sa.getX(),sa.getY());
        sa.setLocation(x,y);
    }
}
