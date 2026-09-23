public class SessaoCinema {
	private int numeroDaSala;
	private String filme;
	private int capacidade;
	private int ingressosVendidos;
	private Double precoIngresso;
	
	public SessaoCinema(int numeroDaSala, String filme, int capacidade) {
		this.numeroDaSala = numeroDaSala;
		this.filme = filme;
		this.capacidade = capacidade;
		this.ingressosVendidos = 0;
		this.precoIngresso = 25.0;
	}
	
	public SessaoCinema(int numeroDaSala, String filme, int capacidade, Double precoIngresso) {
		this.numeroDaSala = numeroDaSala;
		this.filme = filme;
		this.capacidade = capacidade;
		this.ingressosVendidos = 0;
		this.precoIngresso = precoIngresso;
	}
	
	public Double venderIngresso() {
		return this.venderIngresso(1, false);
	}
	
	public Double venderIngresso(int quantidade) {
		return this.venderIngresso(quantidade, false);
	}
	
	public Double venderIngresso(int quantidade, boolean meiaEntrada) {
		if (quantidade > 0 && quantidade <= (this.capacidade - this.ingressosVendidos)) {
			this.ingressosVendidos += quantidade;
			
			Double valorVenda = (this.precoIngresso * quantidade);
			if (meiaEntrada == true) { //if (meiaEntrada) {
				valorVenda -= (valorVenda * (50.0 / 100.0));
			}
			
			return valorVenda;
		}
		return -1.0;
	}
	
	public Double calcularBilheteria() {
		return (this.ingressosVendidos * this.precoIngresso);
	}
	
	public String exibirSessao() {
		return this.exibirSessao(false);
	}
	
	public String exibirSessao(boolean mostrarLotacao) {
		String mensagem = "Sala " + this.numeroDaSala;
		mensagem += " - Filme: " + this.filme;
		mensagem += " - Ingresso: R$ " + this.precoIngresso;
		
		if (mostrarLotacao == true) { //if (mostrarLotacao) {
			mensagem += " - Lotação: " + this.ingressosVendidos + "/" + this.capacidade;
		}
		
		return mensagem;
	}
	
	public int getNumeroDaSala() {
		return this.numeroDaSala;
	}
	public void setNumeroDaSala(int numeroDaSala) {
		this.numeroDaSala = numeroDaSala;
	}
	
	public String getFilme() {
		return this.filme;
	}
	public void setFilme(String filme) {
		this.filme = filme;
	}
	
	public int getCapacidade() {
		return this.capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public int getIngressosVendidos() {
		return this.ingressosVendidos;
	}
	public void setIngressosVendidos(int ingressosVendidos) {
		this.ingressosVendidos = ingressosVendidos;
	}
	
	public Double getPrecoIngresso() {
		return this.precoIngresso;
	}
	public void setPrecoIngresso(Double precoIngresso) {
		this.precoIngresso = precoIngresso;
	}
	
}
