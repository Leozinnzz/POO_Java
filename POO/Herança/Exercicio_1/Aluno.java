public class Aluno extends Pessoa {
	
	private String matricula; 
	private String curso; 
	private Double nota1; 
	private Double nota2; 
	
	public Aluno(String nome, String cpf, String telefone, String matricula, String curso, Double nota1, Double nota2){
		super(nome, cpf, telefone);
		this.matricula = matricula;
		this.curso = curso; 
		this.nota1 = nota1; 
		this.nota2 = nota2;
	}
	
	public String getMatricula(){
		return matricula;
	}
	
	public void setMatricula(String matricula){
		this.matricula = matricula;
	}
	
	public String getCurso(){
		return curso;
	}
	
	public void setCurso(String curso){
		this.curso = curso;
	}
	
	public Double getNota1(){
		return nota1;
	}
	
	public void setNota1(Double nota1){
		this.nota1 = nota1;
	}
	
	public Double getNota2(){
		return nota2;
	}
	
	public void setNota2(Double nota2){
		this.nota2 = nota2;
	}
	
	public Double calcularMedia() {
		return (nota1 + nota2) / 2;
	}
	
	public String situacao(){
		Double media = calcularMedia();
		return (media >= 6.0)  ? "APROVADO" : "REPROVADO";
	}
	
}
