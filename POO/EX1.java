public class EX1 {
	String nome; 
	Double horasTrabalhadas = 0.0; 
	Double valorHora = 0.0;
	
	public double salarioFinal(double horasTrabalhadas, double valorHora){
		return ((horasTrabalhadas * valorHora) - (horasTrabalhadas * valorHora) * 0.11);
	}
}

