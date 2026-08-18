public class Fatura {
	int numero;
	String descricao;
	int quantidade = 0; 
	Double preco = 0.0;
	
	public Fatura(int numero, String descricao, int quantidade, double preco) {
		this.numero = numero; 
		this.descricao = descricao; 
		this.quantidade = quantidade; 
		this.preco = preco;
	} 
	
	public double getValorDaFatura(){
		return quantidade * preco;
	}
	
}
