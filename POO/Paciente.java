public class Paciente {
	String nome; 
	String sexo; 
	Double peso; 
	Double altura;
	
	public double calcularIMC(double peso, double altura) {
		return peso / (altura*altura); 
	}
}

