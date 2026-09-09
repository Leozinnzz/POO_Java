public class Boleto{	
	private int codigo;
	private String descricao;
	private int diaDeVencimento;
	private Double valor;
	private boolean status;
	
	public Boleto(int codigo, String descricao, int diaDeVencimento, double valor) {
		this.codigo = codigo; 
		this.descricao = descricao;
		this.diaDeVencimento = diaDeVencimento;
		this.valor = valor;
		this.status = false;
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
	
	public int getDiaDeVencimento(){
		return diaDeVencimento;
	}
	
	public void setDiaDeVencimento(){
		this.diaDeVencimento = diaDeVencimento;
	}
	
	public boolean pagar(int dia, double desconto, double valorPago){
		if(dia >= diaDeVencimento) {
			valor += (valor/100) * desconto;
			return valorPago >= valor ? true : false;
		} 
		else {
			valor -= (valor/100) * desconto;
			return valorPago >= valor ? true : false; 
		}
	}
	
	public String exibir(){
		return "Codigo do boleto: " + codigo + " Descrição: " + descricao + 
		" Dia de vencimento: " + diaDeVencimento + " Valor: " + valor +
		" Situação: " + status; 
	}
}

