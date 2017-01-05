
public class PilhaNo {

    private No node;
   
    public void empilhar(Object objeto) {       
        No no = new No();        

        no.setValor(objeto);
        no.setProximo(node);
        node = no;
    }

    public void desempilhar() {
        if(node != null) {
            node = node.getProximo();
        }    
    }    

    public Object topo() { 
        return node.getValor();
    }   

}
