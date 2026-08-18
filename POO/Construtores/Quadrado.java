public class Quadrado {
	Double lado; 
	
	public Quadrado(double lado) {
		this.lado = lado; 
	}
	
	public double calcularArea(double lado){
		return lado*lado; 
	}
	
	public double calcularPerimetro(double lado){
		return lado*4; 
	}
	
	
}
