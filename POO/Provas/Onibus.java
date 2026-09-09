public class Onibus {
	private int numero; 
	private String linha;
	private int capacidade; 
	private int passageirosAtuais; 
	private Double tarifa; 
	
	public  Onibus(int numero, String linha, int capacidade, Double tarifa){
		this.numero = numero;
		this.linha = linha;
		this.capacidade = capacidade;
		this.passageirosAtuais = 0;
		this.tarifa = tarifa;
	}
	
	public  Onibus(int numero, String linha, int capacidade){
		this.numero = numero;
		this.linha = linha;
		this.capacidade = capacidade;
		this.passageirosAtuais = 0;
		this.tarifa = 4.50;
	}
	
	public boolean embarcarPassageiro() {
		if(1 > (this.capacidade - this.passageirosAtuais)) {
			return false;
		}
		this.passageirosAtuais++;
		return true;
	}
	
	public boolean embarcarPassageiro(int quantidade) {
		if(quantidade > (this.capacidade - this.passageirosAtuais)) {
			return false;
		}
		this.passageirosAtuais += quantidade; 
		return true;
	}
	
	public boolean desembarcarPassageiro() {
		if(1 < (this.capacidade - this.passageirosAtuais)) {
			return false;
		}
		this.passageirosAtuais--;
		return true;
	}
	
	public boolean desembarcarPassageiro(int quantidade) {
		if(quantidade < (this.capacidade - this.passageirosAtuais)) {
			return false;
		}
		this.passageirosAtuais -= quantidade;
		return true;
	}
	
	public Double calcularRenda(String tipoTarifa) {
		if(tipoTarifa.equalsIgnoreCase("SIMPLES")) {
			return this.passageirosAtuais * this.tarifa;
		}
		else if(tipoTarifa.equalsIgnoreCase("INTEGRADA")) {
			return this.passageirosAtuais * this.tarifa * 1.5;	
		}
		else 
			return null;
	}
	
	public String exibirInfo(){
		return "Onibus [" + numero + "]" + "Linha [" + linha + "]";
	}
	
	public String exibirInfo(boolean detalhado){
		if(detalhado) {
			return " - Onibus [" + numero + "]" + " - Linha [" + linha + "]" + " - Passageiros: [" + passageirosAtuais + "]/[" + capacidade
			+ "] - Tarifa R$" + tarifa;
		}
		return exibirInfo();
	}
	
}
