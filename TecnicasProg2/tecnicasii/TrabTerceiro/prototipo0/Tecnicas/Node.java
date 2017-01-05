public class Node {        
    
    private Node proximo, anterior;
    private Integer tamanho;

    public Node getProximo(){
        return this.proximo;
    }   
    
    public void setProximo(Node anterior){
        this.proximo = anterior;
    }
    
      public Node getAnterior(){
        return this.anterior;
    }   
    
    public void setAnterior(Node anterior){
        this.anterior = anterior;
    }
    
    public Integer getTamanho(){
        return this.tamanho;
    }   
    
    public void setTamanho(Integer tamanho){
        this.tamanho = tamanho;
    }  
}