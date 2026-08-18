public class Retangulo{	
	double comprimento = 1.0; 
	double largura = 1.0;
	
	public double calcularArea(double comprimento, double largura){
		return comprimento * largura; 
	} 
	
	public double calcularPerimetro(double comprimento, double largura){
		return (comprimento + largura) * 2; 
	}
	
}

