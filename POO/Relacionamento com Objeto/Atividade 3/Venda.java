public class Venda {	
	private int numero; 
	private Cliente comprador; 
	private Produto produto; 
	private int quantidade;
	
	public String imprimir(){
		return "Comprador: " + comprador.getNome() + " Descrição: " + produto.getDescricao() +
		" Quantidade: " + quantidade + " Valor total da compra: " + (produto.getPreco() * quantidade) +
		((produto.getPreco() * quantidade <= comprador.getLimiteDeCredito()) ? " O valor esta dentro do limite de credito" : 
		" O valor ultrapassou o limite de credito"); 
	}
	
	public int getNumero(){
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public Cliente getComprador(){
		return comprador;
	}
	
	public void setComprador(Cliente comprador){
		this.comprador = comprador;
	}
	
	public Produto getProduto(){
		return produto;
	}
	
	public void setProduto(Produto produto){
		this.produto = produto;
	}
	
	public int getQuantidade(){
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
}

