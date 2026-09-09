public class Carro {
	private Double combustivel;
	private Double quilometragem = 0.0; 
	
	public Carro(double combustivel){
		this.setCombustivel(combustivel);
	} 
	
	public double getQuilometragem() {
		return quilometragem;
	}
	
	public void setQuilometragem(double quilometragem) {
		this.quilometragem = quilometragem; 
	}
	
	public double getCombustivel(){
		return combustivel; 
	}
	
	public void setCombustivel(double combustivel){
		this.combustivel = combustivel; 
	}
	
	public double autonomia() {
		return combustivel / 12;   
	} 
	
	public void abastecer(double litros) {
		combustivel += litros; 
	}
	
	public void percorrerDistancia(int distancia) {
		double consumo = distancia / 12;
		if(combustivel >= consumo) {
			quilometragem += distancia; 
			combustivel -= consumo;
		} else {
			System.out.println("Combustivel insuficiente");
		}
	}
	
}
