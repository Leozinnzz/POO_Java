public class Carro {
	
	private Double combustivel; 
	
	public Carro(double combustivel){
		this.combustivel = combustivel;
	}
	
	public Carro(){
		this.combustivel = 0.0;
	}
	
	public double getCombustivel(){
		return combustivel;
	}
	
	public double autonomia() {
		return combustivel * 12.0;
	}
	
	public double autonomia(String tipoCombustivel) {
		if(tipoCombustivel.equalsIgnoreCase("etanol"))
			return combustivel * 8.0;
		else
			return combustivel * 12.0;
	}
	
	
	public double autonomia(String tipoCombustivel, double abastecimento) {
		combustivel += abastecimento;
		if(tipoCombustivel.equalsIgnoreCase("etanol"))
			return combustivel * 8;
		return combustivel * 12;
	}
	
	public double autonomia(String tipoCombustivel, boolean carga) {
		
		if(tipoCombustivel.equalsIgnoreCase("etanol")) {
			double distancia = combustivel * 8;
			if(carga == true) 
				return distancia - (distancia * 0.3);
			else 
				return distancia;
		} 
		double distancia = combustivel * 12;
		if(carga == true)
			return distancia - (distancia * 0.3);
		else 
			return distancia;
	}	
}

