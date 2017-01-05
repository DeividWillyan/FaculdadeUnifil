public class PilhaNode {
   
    private Node node;

    public void empilhar(Integer tamanho) {       
        Node no = new Node();        
        no.setTamanho(tamanho);
        no.setProximo(node);
        node = no;        
    }
    
    public void desempilhar() {
        if(node != null) {      
            node = node.getProximo();
        }    
    }    
    
    // tamanho do ultimo objeto no topo da pilha
    public Integer topo() { 
        if (node == null) {
            return 10;
        } else {
            return node.getTamanho();
        }
    }
    
    
}
