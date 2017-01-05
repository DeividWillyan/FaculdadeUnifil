public class TorresDeHanoi {   

    PilhaNode[] pilhas = { new PilhaNode(), new PilhaNode(), new PilhaNode() };

    public void run(Integer v1, Integer v2, Integer v3) {        
        pilhas[0].empilhar(v3);
        pilhas[0].empilhar(v3);
        pilhas[0].empilhar(v1);        
    }

    // Metodo de Validação!
    void movimentar(Integer x, Integer y) {        
        try {
            if ((x > 0 ) || (x  < 2) || (y > 0) || (y < 2))  move(--x,--y);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("[ERRO] - Valor da movimentação Invalido!\n" + e);
        }        
    }

    int passo = 1;
    private void move(Integer x, Integer y) {    
        if ( pilhas[x].topo() < pilhas[y].topo() ) {
            pilhas[y].empilhar(pilhas[x].topo());
            pilhas[x].desempilhar();      
            System.out.println("Objeto Movido Com Sucesso! - " + passo++);
            System.out.println("De: " + x + " para -> " + y);
        } else {            
            System.out.println("Não é possivel mover, Objeto maior ou igual ao topo!");
        }    
    }
}

