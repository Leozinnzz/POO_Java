public class ContaCorrente {	
	private String cliente;
	private int numero; 
	private Integer senha; 
	private double saldo;
	
	public ContaCorrente(String cliente, int numero) {
		this.cliente = cliente;
		this.numero = numero; 
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public int getNumero(){
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public void setCliente(String cliente){
		this.cliente = cliente;
	}
	
	public boolean cadastrar(int senha) {
		if(this.senha == null) {
			this.senha = senha;
			System.out.println("Senha cadastrada no banco");
			return true;
		}
		return false;
	}
	public boolean alterarSenha(int senha, int novaSenha) {
		if(this.senha == senha) {
			this.senha = novaSenha;
			System.out.println("Senha alterada");
			return true;
		}
		System.out.println("A senha foi modificada");
		return false;
	}
	
	public boolean debitar(int senha, double valor){
		if(this.senha == senha) {
			if(this.saldo <= 0){
				System.out.println("Saldo insuficiente para debitar");
				return false;
			}
			System.out.println("Dinheiro debitado");
			this.saldo -= valor; 
			return true;
		}
		return false;
	}
	
	public boolean creditar(int senha, double valor) {
		if(this.senha == senha) {
			this.saldo += valor;
			System.out.println("valor creditado");
			return true;
		}
		return false;
	}
	
	public String consultaSaldo(int senha) {
		if(this.senha == senha) 
			return "Cliente: " + cliente + "Saldo: " + saldo;
		else 
			return "SENHA INVÁLIDA!";
	}
}

