public class Fatura {
	int numero;
	String descricao;
	int quantidade; 
	Double preco;
	
	public Fatura(int numero, String descricao, int quantidade, double preco) {
		this.numero = numero; 
		this.descricao = descricao; 
		this.quantidade = (quantidade <= 0) ? 0 : quantidade; 
		this.preco = (preco <= 0) ? 0.0 : preco; 
	} 
	
	public double getValorDaFatura(){
		return quantidade * preco;
	}
	
}
