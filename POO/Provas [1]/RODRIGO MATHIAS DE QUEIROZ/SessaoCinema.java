public class SessaoCinema{
	private Integer numeroDaSala; //private int numeroDaSala;
	private String filme;
	private Integer capacidade; //int
	private Integer ingressosVendidos;//int
	private Double precoIngresso;
	
	public SessaoCinema(Integer numeroDaSala, String filme, Integer capacidade){
		this.numeroDaSala = numeroDaSala;
		this.filme = filme;
		this.capacidade = capacidade;
		ingressosVendidos = 0;
		precoIngresso = 25.00;
		}
	public SessaoCinema(Integer numeroDaSala, String filme, Integer capacidade, Double precoIngresso){
		this.numeroDaSala = numeroDaSala;
		this.filme = filme;
		this.capacidade = capacidade;
		ingressosVendidos = 0;
		this.precoIngresso = precoIngresso;
		}
	
	//MÉTODOS
	
	public Double venderIngresso(){
		if(capacidade == ingressosVendidos){
			return -1.0;
			}
			else{
				ingressosVendidos += 1;
				return precoIngresso;
				}
		}
	public Double venderIngresso(Integer quantidade){
		Integer disponivel = capacidade - ingressosVendidos;
		if(quantidade > disponivel){
			return -1.0;
			}
			else{
				ingressosVendidos += quantidade;
				return precoIngresso * quantidade;
				}
		}
	public Double venderIngresso(Integer quantidade, Boolean meiaEntrada){
		Integer disponivel = capacidade - ingressosVendidos;
		if(quantidade > disponivel){
			return -1.0;
			}
			else{
				if(meiaEntrada = true){ //if(meiaEntrada){ //O comando está atribuindo e não comparando.
					ingressosVendidos += quantidade;
					return (precoIngresso * quantidade) / 2.0;
					} else{
					ingressosVendidos += quantidade;
					return precoIngresso * quantidade;
						}
				}
		}
	public Double calcularBilheteria(){
		return ingressosVendidos * precoIngresso;
		}
		
	public String exibirSessao(){
		return "Sala " + numeroDaSala + " - Filme: " + filme + " - Ingresso: R$ " + precoIngresso;
		}
		
	public String exibirSessao(Boolean mostrarLotacao){
		return "Sala " + numeroDaSala + " - Filme: " + filme + " - Ingresso: R$ " + precoIngresso + " Lotação: -> Ingressos Vendidos: " + ingressosVendidos + " Capacidade: " + capacidade;
		}
		
	// GETTERS E SETTERS
	
	public Integer getNumeroDaSala(){ //public int getNumeroDaSala(){
		return numeroDaSala;
		}
	public String getFilme(){
		return filme;
		}
	public Integer getCapacidade(){ //int
		return capacidade;
		}
	public Integer getIngressosVendidos(){//int
		return ingressosVendidos;
		}
	public Double getPrecoIngresso(){
		return precoIngresso;
		}

	public void setNumeroDaSala(Integer numeroDaSala){
		this.numeroDaSala = numeroDaSala;
		}
	public void setFilme(String filme){
		this.filme = filme;
		}
	public void setCapacidade(Integer capacidade){
		this.capacidade = capacidade;
		}
	public void setIngressosVendidos(Integer ingressosVendidos){
		this.ingressosVendidos = ingressosVendidos;
		}
	public void setPrecoIngresso(Double precoIngresso){
		this.precoIngresso = precoIngresso;
		}

}
