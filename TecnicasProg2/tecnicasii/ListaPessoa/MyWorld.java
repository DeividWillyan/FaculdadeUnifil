import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private static int ALTURA = 400;
    private static int LARGURA = 600;
    Add addButton;
    Remove removeButton;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(LARGURA, ALTURA, 1);
        
    }
    
    public void started(){
        addButton = new Add();
        removeButton = new Remove();
        
        this.addObject(addButton, LARGURA-addButton.getImage().getWidth(), ALTURA-2*addButton.getImage().getHeight());
        this.addObject(removeButton, LARGURA-removeButton.getImage().getWidth(), ALTURA-removeButton.getImage().getHeight());
        
        
        if (Greenfoot.mouseClicked(this)) {
        
            String _nome = Greenfoot.ask("Nome do Usuario");
            int _idade = Integer.parseInt(Greenfoot.ask("Idade do Usuario"));
        
            InserirNoInicio(_nome, _idade);        
        
            this.addObject(new Pessoa(), 150, ALTURA/2);
        
            Label label = new Label("Teste", 15);
            this.addObject(label, 150, 10);
        
        }
        
        
        
        
    }


    
    int qtdElementos = 0;
    Node primeiro = null, ultimo = null;
    
    public void InserirNoInicio(String nome, int idade) {               
        Node node = new Node(); 
        if(qtdElementos == 0) {                     
            node.setNome(nome);
            node.setIdade(idade);
            node.setProximo(primeiro);
            primeiro = node;            
        }else{          
            node.setNome(nome);
            node.setIdade(idade);
            node.setProximo(primeiro);
            primeiro = node;        
        }       
        qtdElementos++; 
    }
    
    public void buscar(String busca){       
        Node aux = primeiro;        
        for (int i = 0; i < qtdElementos; i++){              
            if (aux.getNome() == busca) {
                System.out.println(aux.getNome() + " " + aux.getIdade() + " Indice -> " + i);
                break;              
            }else{              
                aux = aux.getProximo();                 
            }           
        }       
    }

    
}