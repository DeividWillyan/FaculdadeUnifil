
public class FilaNo {

    private No inicio, fim;

    FilaNo(){
        this.inicio = null;
    }

    public void enfileirar(Object objeto) {
        No no = new No();
        no.setValor(objeto);
        no.setProximo(null);

        if (inicio == null) {        
            inicio = no;
            fim = no;
        } else {
            fim.setProximo(no);
            fim = no;        
        }    
    }

    public void desenfileirar() {
       if (inicio == null) {
           fim = null;
           // Fila Variza
        } else {
            inicio = inicio.getProximo();
        }
    }
    
    public Object primeiro() {
        return inicio;
    }

}
