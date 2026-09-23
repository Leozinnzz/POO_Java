public class ContaBancaria {
	
	private Pessoa cliente; 
	private int numeroDaConta; 
	private Double saldo = 0.0;
	
	public Pessoa getCliente() {
		return cliente; 
	}
	
	public void setCliente(Pessoa cliente) {
		this.cliente = cliente; 
	}
	
	public int getNumeroDaConta() {
		return numeroDaConta;
	}
	
	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	public Double getSaldo() {
		return saldo;
	}
	
	public boolean sacar(Double saque) {
		if(saque <= this.saldo)	{
			this.saldo -= saque;
			return true;
		}
		return false;
	}
	
	public boolean depositar(Double deposito) {
		saldo += deposito;
		return true;
	}
	
	
}
