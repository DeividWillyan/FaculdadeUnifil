public class TorresDeHanoi {   

    PilhaNode[] pilhas = { new PilhaNode(), new PilhaNode(), new PilhaNode() };

    void run() {        
        pilhas[0].empilhar(3);
        pilhas[0].empilhar(2);
        pilhas[0].empilhar(1);        
    }

    // Metodo de Validação!
    void movimentar(Integer x, Integer y) {        
        try {
            if ((x > 0 ) || (x  < 2) || (y > 0) || (y < 2))  move(--x,--y);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("[ERRO] - Valor da movimentação Invalido!\n" + e);
        }        
    }

    private void move(Integer x, Integer y) {    
        if ( pilhas[x].topo() < pilhas[y].topo() ) {
            pilhas[y].empilhar(pilhas[x].topo());
            pilhas[x].desempilhar();            
        } else {            
            System.out.println("Não é possivel mover, Objeto maior ou igual ao topo!");
        }    
    }
}

