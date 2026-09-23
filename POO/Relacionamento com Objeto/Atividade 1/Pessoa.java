public class Pessoa {
	
	//atributes 
	private String nome; 
	private String cpf; 
	private String endereco; 
	private String telefone;
	private Double renda = 0.0; 
	
	public String getNome() {
		return nome;
	} 
	
	public void setNome(String nome) {
		this.nome = nome; 
	}
	
	public String getCpf() {
		return cpf;
	} 

	public void setCpf(String cpf){
		this.cpf = cpf;
	}
	
	public String getEndereco() {
		return endereco;
	} 

	public void setEndereco(String endereco){
		this.endereco = endereco;
	}
	
	public String getTelefone(){
		return telefone;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
	public Double getRenda(){
		return renda;
	}
	
	public String informacoes(){
		return "Nome: " + nome + " CPF:" + cpf + " Endereco: " + endereco + " Telefone: " + telefone + " Renda: " + renda; 
	}

}
