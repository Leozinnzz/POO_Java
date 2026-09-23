public class Pessoa {
	private String nome;
	private String sexo; 
	private Data nascimento; 
	
	
	public Pessoa(String nome){
		this.nome = nome;
		this.nascimento = new Data(01, 01, 2000);
	}
	
	public Pessoa(String nome, String sexo, Data nascimento){
		this.nome = nome; 
		this.sexo = sexo;
		this.nascimento = nascimento;
	}
	
	public String mostrarIdade(Data hoje){
		int idade = hoje.getAno() - nascimento.getAno();
		return "A pessoa tem " + idade  + " anos de idade";
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getSexo(){
		return nome;
	}
	
	public void setSexo(String sexo){
		this.sexo = sexo;
	}
	

}
