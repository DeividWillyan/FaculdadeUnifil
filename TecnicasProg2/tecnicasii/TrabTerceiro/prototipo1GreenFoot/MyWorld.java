import greenfoot.*; 

public class MyWorld extends World {

   
    public MyWorld() {   
        super(800, 500, 1);  

        Torre1 T1 = new Torre1();
        Torre2 T2 = new Torre2();
        Torre3 T3 = new Torre3();
        Enviar ev = new Enviar();
        Ok ok = new Ok();   

        addObject(T1,100,250);
        addObject(T2,400,250);
        addObject(T3,700,250);
        addObject(ev,300,450);
        addObject(ok,500,450);

    }   
    
}
