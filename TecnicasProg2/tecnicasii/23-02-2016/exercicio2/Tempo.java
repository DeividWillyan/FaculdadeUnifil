import greenfoot.*;
import java.awt.Color;


public class Tempo extends Actor {
    public Tempo()   {
        this("");
    }
 
    public Tempo(String text)    {
        setText(text);
    }
 
    public void setText(String text)   {
        setImage(new GreenfootImage(text, 34, Color.red, new Color(0, 0, 0, 0)));
    } 
   
}