import greenfoot.*;

public class MyWorld extends World {
    atorX x = new atorX();
    atorY y = new atorY();
    
    public MyWorld() {    
        super(600, 400, 1);               
                
        addObject(x, 200, 200);               
        addObject(y, 400, 200);
        
        //act();
    //   mouse();
    }        
    
    
    public void act() {
        int posicaoYx = 0;
        int posicaoYy = 0; 
        int posicaoXx = 200;
        int posicaoXy = 200;
        
        posicaoYx = y.getX();
        posicaoYy = y.getY();
        posicaoXx = x.getX();
        posicaoXy = x.getY();
        int marc = 2;
        int marcy = 2;
        
        if (Greenfoot.mouseClicked(x)) {
            marc = 1;
            marcy = 4;
            System.out.println(marc);
        }
               
        if (Greenfoot.mouseClicked(y)) {
            marc = 1;
            marcy = 1;
            System.out.println(marc);
        }
        
        
        if ((marc == 1) && (Greenfoot.mouseClicked(y))) {            
                x.setLocation(posicaoYx, posicaoYy);
                y.setLocation(posicaoXx, posicaoXy);    
                marc = 0;
                marcy = 0;
        } 
        
        if (Greenfoot.mouseClicked(y)) {
            if (marcy == 4) {
                System.out.println(marc);
                 x.setLocation(y.getX(), y.getY());                 
                 y.setLocation(posicaoXx, posicaoXy);
                 marc = 0;
                 marcy = 0;
            }  
        }   
    }         
    
    
    
    public void mouse() {
        
        boolean xx = true;
        boolean yy = true;
        
        int ayy = 0;
        int ayx = 0;
        int axx = 0;
        int axy = 0;
        
        if (Greenfoot.mouseClicked(x)) {
        
            axx = x.getX();
            axy = x.getY();  
            
            xx = false;
            yy = true;
        }
        
        if (Greenfoot.mouseClicked(y)) {
        
            ayx = y.getX();
            ayy = y.getY();        
        
            xx = true;
            yy = false;
            
            
        }
     
        if ((xx == true) && (yy == false)) {
        
            y.setLocation(axx, axy);
            x.setLocation(ayx, ayy);
            xx = true;
            yy = true;
        
        }
        if ((xx == false) && (yy == true)) {
        
            x.setLocation(ayx, ayy);
            xx = true;
            yy = true;
        
        }
        
        
        
    }   
    
}

