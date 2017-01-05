import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Add here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Add extends Actor
{
 
      private static int ALTURA = 400;
    private static int LARGURA = 600;  
        Add addButton;
    Remove removeButton;
    
    public void act() 
    {
     
        
        Remove removeButton = new Remove();
        
        this.addObject(addButton, LARGURA-addButton.getImage().getWidth(), ALTURA-2*addButton.getImage().getHeight());
        addObject(removeButton, LARGURA-removeButton.getImage().getWidth(), ALTURA-removeButton.getImage().getHeight());
        
        
        if (Greenfoot.mouseClicked(this)) {
        
            MyWorld mw = new  MyWorld();
            
            String _nome = Greenfoot.ask("Nome do Usuario");
            int _idade = Integer.parseInt(Greenfoot.ask("Idade do Usuario"));
        
            mw.InserirNoInicio(_nome, _idade);        
        
            this.addObject(new Pessoa(), 150, ALTURA/2);
        
            Label label = new Label("Teste", 15);
            this.addObject(label, 150, 10);
        
        }
        
        
    }    
}
