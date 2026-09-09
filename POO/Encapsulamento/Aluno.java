public class Aluno {
	private String nome; 
	private int matricula; 
	private Double media; 
	private String situação; 
	
	public Aluno(String nome, int matricula, double media){
		this.setNome(nome); 
		this.setMatricula(matricula);
		this.setMedia(media);
	}
	
	public String getNome(){
		return nome; 
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	
	public int getMatricula(){
		return matricula;
	}
	
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
	
	
	public double getMedia(){
		return media;
	}
	
	public void setMedia(double media){
		this.media = media;
		verificarSituação();
	}
	
	public String verificarSituação(){
		return (media <= 6) ? "REPROVADO" : "APROVADO";  
	}
	
	public String resultado(){
		return "Nome: " + nome + " Matricula: " + matricula + " Media: " + media + " Situação: " + verificarSituação(); 
	}
}

