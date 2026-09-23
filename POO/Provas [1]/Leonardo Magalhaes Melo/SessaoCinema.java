public class SessaoCinema {
	private int numeroDaSala;
	private String filme;
	private int capacidade;
	private int ingressosVendidos;
	private Double precoIngresso;
	
	//construtores
	public SessaoCinema(int numeroDaSala, String filme, int capacidade){
		this.numeroDaSala = numeroDaSala;
		this.filme = filme;
		this.capacidade = capacidade;
		this.ingressosVendidos = 0;
		this.precoIngresso = 25.0;
	}
	
	public SessaoCinema(int numeroDaSala, String filme, int capacidade, Double precoIngresso){
		this.numeroDaSala = numeroDaSala;
		this.filme = filme;
		this.capacidade = capacidade;
		this.ingressosVendidos = 0;
		this.precoIngresso = precoIngresso;
	}
	
	//metodos
	public Double venderIngresso(){ 
		if((this.capacidade - ingressosVendidos) >= 1) {
			this.ingressosVendidos++;
			return precoIngresso * 1; 
		}else {
		return -1.0;
		}
	}
	
		
	public Double venderIngresso(int quantidade){ 
		if((this.capacidade - ingressosVendidos) >= quantidade) {
			this.ingressosVendidos += quantidade;
			return this.precoIngresso * quantidade; 
		} else {
			return -1.0;
		}
	}
	
	public Double venderIngresso(int quantidade, boolean meiaEntrada){ 
		if((this.capacidade - ingressosVendidos) >= quantidade) {
			if(meiaEntrada == true) { //if(meiaEntrada)
				Double desconto = (precoIngresso * quantidade) - (precoIngresso * quantidade * 0.5); 
				this.ingressosVendidos += quantidade;
				return (this.precoIngresso * quantidade) - desconto;
			}
			return this.precoIngresso * quantidade;
		} else {
			return -1.0;
		}
		 
	}
	
	//validar meia entrada
	public Double calcularBilheteria() {
		return this.ingressosVendidos * this.precoIngresso;	
	}
	
	public String exibirSessao() {
		return "Sala [" + this.numeroDaSala + "] - Filme: [" + filme + 
		"] - Ingresso: R$ ["  + this.precoIngresso + "]";
	}
		
	
	public String exibirSessao(boolean mostrarLotacao) {
		if(mostrarLotacao == true) {
			return "Sala [" + this.numeroDaSala + "] - Filme: [" + this.filme + 
			"] - Ingresso: R$ ["  + this.precoIngresso + "]" + " - Lotação: [" + 
			this.ingressosVendidos + "]/[" + this.capacidade + "]";
		}
		return exibirSessao();
	}
	
	//Get and Setters
	public int getNumeroDaSala() {
		return numeroDaSala;
	}
	
	public void setNumeroDaSala(int numeroDaSala) {
		this.numeroDaSala = numeroDaSala;
	}
	
	public String getFilme(){
		return filme;
	}
	
	public void setFilme(String filme) {
		this.filme = filme; 
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade; 
	}
	
	public int getIngressosVendidos() {
		return ingressosVendidos;
	}
	
	public void setIngressosVendidos(int ingressosVendidos) {
		this.ingressosVendidos = ingressosVendidos;
	}
	
	public Double getPrecoIngresso() {
		return precoIngresso;
	}
	
	public void setPrecoIngresso(Double precoIngresso) {
		this.precoIngresso = precoIngresso;	
	}
	
	
	
	
}

