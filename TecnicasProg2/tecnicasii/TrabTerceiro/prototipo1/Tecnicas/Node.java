public class Node {        
    
    private Node proximo;
    private Integer tamanho;

    public Node getProximo(){
        return this.proximo;
    }   
    
    public void setProximo(Node proximo){
        this.proximo = proximo;
    }
    
    public Integer getTamanho(){
        return this.tamanho;
    }   
    
    public void setTamanho(Integer tamanho){
        this.tamanho = tamanho;
    }  
}