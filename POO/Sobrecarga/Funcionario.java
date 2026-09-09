public class Funcionario {
	
	private String nome; 
	private Double salarioBase;
	private Integer tempoDeServico;
	
	public Funcionario(String nome, double salarioBase, int tempoDeServico) {
		this.nome = nome; 
		this.salarioBase = salarioBase; 
		this.tempoDeServico = tempoDeServico; 
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalarioBase(){
		return salarioBase;
	}
	
	public int getTempoDeServico(){
		return tempoDeServico;
	}
	
	public void setTempoDeServico(int tempoDeServico) {
		this.tempoDeServico = tempoDeServico;
	}
	
	public double mostrarSalario(){
		if(tempoDeServico <= 10) {
			return salarioBase += (salarioBase/100) * 12;
			
		}
		return salarioBase += (salarioBase/100) * 17;
	}
	
	public double mostrarSalario(double vendas){
		if(tempoDeServico <= 10) {
			double comissao = (vendas/100) * 1.5;
			return salarioBase + ((salarioBase/100) * 5) + comissao; 
		} 
		double comissao = (vendas/100) * 2;
		return salarioBase + ((salarioBase/100) * 10) + comissao;
	}
	
}

