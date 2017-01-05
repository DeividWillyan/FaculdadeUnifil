import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enviar extends Actor {
    
    TorresDeHanoi h = new TorresDeHanoi();
    int s = 1;
    
    public void act()     {
        
        if(s == 1) {
            h.run(1,2,3);
            s = 0;
        }
        
        if(Greenfoot.mouseClicked(this)){
            teste();
        }
        
          
    }    
    
    public Enviar(){
        GreenfootImage image = new GreenfootImage("Enviar.png");
        setImage(image);   
    }
    
    public void teste(){
        
        Integer x = Integer.parseInt(Greenfoot.ask("De Onde Vem"));
        Integer y = Integer.parseInt(Greenfoot.ask("Para Onde Vai"));

        h.movimentar(x,y);
      
    }
    
    
    
}
