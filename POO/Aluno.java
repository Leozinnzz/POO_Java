public class Aluno {
	String nome;
	Double nota1; 
	Double nota2; 
	
	public double media(double nota1, double nota2) {
		return (nota1 + nota2) / 2; 
	}
	
	public String resultado(double media) {
		return (media >= 6) ? "APROVADO" : "REPROVADO";
	} 
}

