public class Pilha {

    int qtdElementos;
    Node proximo;

    public Pilha() {    
        this.qtdElementos = 0;
        this.proximo = null;
    }

    public boolean isEmpty(){
        return qtdElementos == 0;
    }

    public void push(int carta, String nipe){
        Node novo = new Node();
        if(qtdElementos == 0) {
            novo.setcarta(carta);
            novo.setnipe(nipe);
            novo.setProximo(proximo);
            this.proximo = novo;
        }else{
            novo.setcarta(carta);
            novo.setnipe(nipe);
            novo.setProximo(proximo);
            this.proximo = novo;
        }
        this.qtdElementos++;
    }

    public Object popCarta() {
        int _carta = proximo.getcarta();
        Node aux = proximo;
        proximo = proximo.getProximo();
        aux = null;		
        return _carta;
    }

    public String popNipe() {
        String _nipe = proximo.getnipe();
        Node aux = proximo;
        proximo = proximo.getProximo();
        aux = null;		
        return _nipe;
    }
    
    
    

}