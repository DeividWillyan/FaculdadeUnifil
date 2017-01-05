public class Execultar {
    public static void main(String args[]){
    
        Pilha p = new Pilha();
        p.push(2, "COPAS");
        System.out.println(p.proximo.getcarta() +" "+p.proximo.getnipe());
    }    
}
