public class Produto {
	private int codigo;
	private String descricao;
	private Double custo;
	private Double preco = 0.0; //se deixar vazio fica nulo kkkkkkk

	public void calculaPreco(){
		if(custo != null) {
			preco += custo + (custo * 0.25);
		}
	}
	
	public int getCodigo(){
		return codigo;
	}
	
	public void setCodigo(int codigo){
		this.codigo = codigo;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	
	public Double getCusto(){
		return custo;
	}
	
	public void setCusto(Double custo) {
		this.custo = custo;
	}
	
	public Double getPreco(){
		return preco;
	}

}

