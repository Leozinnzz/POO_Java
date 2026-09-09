public class Pessoa{
	private String nome;
	private String sexo;
	private int mesNascimento; 
	private int anoNascimento; 
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
		
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo){
		this.sexo = sexo;
	}

		
	public int getMesNascimento(){
		return mesNascimento;
	}
	
	public void setMesNascimento(int mesNascimento){
		this.mesNascimento = mesNascimento;
	}
		
	public Pessoa(String nome){
		this.nome = nome;
		this.mesNascimento = 1;
		this.anoNascimento = 2000;
		this.sexo = "Undefined";
		
	}
	
	public Pessoa(String nome, String sexo, int mesNascimento, int anoNascimento){
		this.nome = nome;
		this.sexo = sexo;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
	}
	
	public String mostrarIdade(){
		this.anoNascimento = 2018; 
		this.mesNascimento = 10;
		if(mesNascimento > 10) 
			anoNascimento--;
		int idade =  2026 - anoNascimento;
		return "Sexo: " + sexo + " Nome: " + nome + " Idade: " + idade + " Anos" + " e " + mesNascimento + " meses"; 
	}
	
	public String mostrarIdade(int ano, int mes) {
		int idade = 2026 - ano; 
		if(mes > 12)
			idade--;
		return "Sexo: " + sexo + " Nome: " + nome + " Idade: " + idade + " Anos" + " e " + mes + " meses"; 
	}
	
}
