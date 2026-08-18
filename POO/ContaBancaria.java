public class ContaBancaria {
	int numero;
	Double saldo = 0.0; 
	
	public void sacar(Double valor) {
		saldo -= valor;
	}
	
	public void depositar(Double valor) {
		saldo += valor; 
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public String toString() {
		return "Numero da conta: " + numero + String.format("%.2f", saldo);
	}
}

