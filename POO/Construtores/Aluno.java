public class Aluno {
	int matricula; 
	String nome; 
	String cpf; 
	String endereco;
	
	public Aluno(int matricula, String nome, String cpf, String endereco) {
		this.matricula = matricula; 
		this.nome = nome; 
		this.cpf = cpf; 
		this.endereco = endereco;
	}
	
	public String toString() {
		return " Matricula: " 
		+ matricula 
		+ " Nome: " 
		+ nome + " CPF: "
		+ cpf + " Endereço: " + endereco;
	}


}

