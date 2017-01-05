
public class PilhaNode {
   
    private Node node;
    //private Integer topo;

    public void empilhar(Integer tamanho) {       
        Node no = new Node();        
        if (node == null) {
            no.setTamanho(tamanho);
            no.setProximo(node);
            node = no;
        } else {         
            no.setTamanho(tamanho);
            no.setProximo(node);
            node = no;
        }        
    }
    
    public void desempilhar() {
        if(node != null) {      
            node = node.getProximo();
        }    
    }    
    
    // tamanho do ultimo objeto no topo da pilha
    public Integer topo() { 
        return node.getTamanho();
    }   
    
    
}
