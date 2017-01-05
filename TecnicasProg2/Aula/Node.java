public class Node {

	private String nipe;
	private int carta;
	private Node proximo;
	
	
	public String getnipe() {
		return nipe;
	}
	public void setnipe(String nipe) {
		this.nipe = nipe;
	}
	
	public int getcarta() {
		return carta;
	}
	
	public void setcarta(int carta){
		this.carta = carta;
	}
	
	public Node getProximo() {
		return proximo;
	}
	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}	
	
}