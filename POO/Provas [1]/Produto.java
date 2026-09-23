public class Produto {
	private String nome; 
	private Double preco; 
	private int estoque; 
	private String categoria; 
	
	public Produto(String nome, Double preco, int estoque, String categoria) {
		this.nome = nome; 
		this.preco = preco; 
		this.estoque = estoque;
		this.categoria = categoria;
	}
	
	public Double vender(int quantidade) {
		if(this.estoque < quantidade){ 
			return null;
		}
		else 
			this.estoque -= quantidade;
		return quantidade * preco;
	}
	
	public Double vender(int quantidade, Double desconto) {
		if(this.estoque < quantidade)
			return null;
		this.estoque -= quantidade;
		return (preco*quantidade) - desconto;
	}
	
	public Double comprar(int quantidade) {
		this.estoque += quantidade;
		return quantidade * preco;
	}
	
	public Double comprar(int quantidade, Double frete) {
		this.estoque += quantidade;
		return preco * quantidade + frete;
	}
	
	public Double calcularValorTotalEstoque() {
		return this.preco * this.estoque;
	}
	
	public Double calcularValorTotalEstoque(Double imposto) {
		Double total = calcularValorTotalEstoque();
		return total + (total*(imposto/100));
	}
	
	public String exibirDetalhes(){
		return " Nome: " + nome + " Preco: " + preco + " Categoria:" + categoria;
	}
	
	public String exibirDetalhes(boolean mostrarEstoque){
		if(mostrarEstoque)
			return " Nome: " + nome + " Preco: " + preco + " Estoque: " + estoque + " Categoria:" + categoria;
		return exibirDetalhes();
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getPreco(){
		return preco;
	}
	
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public int getEstoque(){
		return estoque;
	}
}

