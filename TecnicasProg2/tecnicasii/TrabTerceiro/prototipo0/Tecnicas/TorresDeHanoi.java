
public class TorresDeHanoi {   

    PilhaNode p1 = new PilhaNode();
    PilhaNode p2 = new PilhaNode();
    PilhaNode p3 = new PilhaNode();        
    
    //PilhaNode [] pilhas = {new Pilha(),new Pilha(),new Pilha()}
    
   /* void move(int x, int y){
        //Valida numeros de entrada
        movimentar(--x,--y)
    }
    
    void movimentar(pilha de, pilha para){
        de < para
        para.empilhar(de)
        de.desempilhar()
    }*/

   /* public void insert(Integer pilha, Integer valor) {        
        switch (pilha) {        
            case 1:
            p1.empilhar(valor);
            break;                
            case 2:
            p2.empilhar(valor);
            break;                
            case 3:
            p3.empilhar(valor);
            break;
            default:
            System.out.println("Escolha as Pilhas 1, 2 ou 3.");            
        }          
    }   */
    
    
    public void autoInsert() {
    
        p1.empilhar(10); // base (not null)
        p1.empilhar(3);
        p1.empilhar(2);
        p1.empilhar(1);
        p2.empilhar(10); // base (not null)
        p3.empilhar(10); // base (not null)
        
    }

    public void move(Integer de, Integer para) {

        if ((de == 1) && (para == 2)) {

            if (p1.topo() > p2.topo()) {
                System.out.print("Não é possivel mover, Objeto maior que o topo!");
            } else {
                p2.empilhar(p1.topo());
                p1.desempilhar();
            }    

        } else if ((de == 1) && (para == 3)) {

            if (p1.topo() > p3.topo()) {
                System.out.print("Não é possivel mover, Objeto maior que o topo!");
            } else {
                p3.empilhar(p1.topo());
                p1.desempilhar();
            }   

        } else if ((de == 2) && (para == 1)) {

            if (p2.topo() > p1.topo()) {
                System.out.print("Não é possivel mover, Objeto maior que o topo!");
            } else {
                p1.empilhar(p2.topo());
                p2.desempilhar();
            }   

        } else if ((de == 2) && (para == 3)) {

            if (p2.topo() > p3.topo()) {
                System.out.print("Não é possivel mover, Objeto maior que o topo!");
            } else {
                p3.empilhar(p2.topo());
                p2.desempilhar();
            }   

        } else if ((de == 3) && (para == 1)) {

            if (p3.topo() > p1.topo()) {
                System.out.print("Não é possivel mover, Objeto maior que o topo!");
            } else {
                p1.empilhar(p3.topo());
                p3.desempilhar();
            }   

        } else if ((de == 3) && (para == 2)) {

            if (p3.topo() > p2.topo()) {
                System.out.print("Não é possivel mover, Objeto maior que o topo!");
            } else {
                p2.empilhar(p3.topo());
                p3.desempilhar();
            }   

        } else {
            System.out.println("Não é possivel realizar esta mudança!");
        }

    }
}
