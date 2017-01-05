public class ListaNo {

    private No node, ini, fim;   
    private int qtd;

    public ListaNo() {
        this.qtd = 0;       
    }

    // insere objeto na posiçao.
    public void inserir(Object objeto, int pos) {
        No no = new No();
        if (qtd == 0) {
            no.setValor(objeto);
            no.setProximo(ini);
            ini = no;
        } else {
            no.setValor(objeto);
            no.setProximo(ini);
            ini = no;            
        }
        qtd++;
    }
    
    public void remover() {
        if (node != null) {
            node = node.getProximo();
        }     
    }

    public Object buscar(Object objeto) {
        No aux = this.ini;
        for (int i = 0; i < qtd; i++) {
            if(aux.getValor() != objeto) {
                aux = aux.getProximo();
            } else {                
                return "Encontrado " +aux.getValor();
            }        
        }        
        return "Não Encontrado";        
    }

}