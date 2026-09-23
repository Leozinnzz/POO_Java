public class Veiculo {

	private String placa; 
	private String modelo;
	private String tipo;
	private int quilometragem; 
	
	public Veiculo (String placa, String modelo, String tipo) {
		this.placa = placa;
		this.modelo = modelo; 
		this.tipo = tipo;
		this.quilometragem = 0; 
	}
	
	public Veiculo (String placa, String modelo, String tipo, int quilometragem) {
		this.placa = placa; 
		this.modelo = modelo;
		this.tipo = tipo; 
		this.quilometragem = quilometragem; 
	} 
	
	public String getPlaca() {
		return placa;
	}
	
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public int getQuilometragem() {
		return quilometragem;
	}
	
	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}
	
	public double calcularLocacao(int dias) {
		int kmViagem = dias * 100;
		this.quilometragem += kmViagem;
		if(this.tipo.equalsIgnoreCase("ECONOMICO")) {
			double locacao = (100.0 * dias) + (0.10 * kmViagem); 
			return locacao;
		}
		
		else if(this.tipo.equalsIgnoreCase("SUV")) {
			double locacao = (150.0 * dias) + (0.10 * kmViagem); 
			return locacao;
		}
		
		else if(this.tipo.equalsIgnoreCase("LUXO")) {
			double locacao = (250 * dias) + (0.10 * kmViagem); 
			return locacao;
		}
		
		else return 0;
	} 
	
	public double calcularLocacao(int dias, int kmRodados) {
		this.quilometragem += kmRodados;
		if(this.tipo.equalsIgnoreCase("ECONOMICO")) {
			double locacao = (100.0 * dias) + (0.10 * kmRodados); 
			return locacao;
		}
		
		else if(this.tipo.equalsIgnoreCase("SUV")) {
			double locacao = (150.0 * dias) + (0.10 * kmRodados); 
			return locacao;
		}
		
		if(this.tipo.equalsIgnoreCase("LUXO")) {
			double locacao = (250 * dias) + (0.10 * kmRodados); 
			return locacao;
		}
		
		return 0;
	}
	
	public double calcularLocacao(int dias, int kmRodados, boolean seguro) {
		this.quilometragem += kmRodados;
		double valorDiaria = 0.0; 
		if(this.tipo.equalsIgnoreCase("ECONOMICO"))
			valorDiaria = 100;
		else if(this.tipo.equalsIgnoreCase("SUV"))
			valorDiaria = 150;
		else if(this.tipo.equalsIgnoreCase("LUXO"))
			valorDiaria = 250;
		
		double total = (valorDiaria * dias) + (0.10 * kmRodados); 
		
		if(seguro == true) 
			total += (50.0 * dias);
			
		return total;
	}
	
	public String exibirDetalhes() {
		double valorDia = 0;
		if(this.tipo.equalsIgnoreCase("ECONOMICO")) {
			valorDia = 100;
		}
		
		else if(this.tipo.equalsIgnoreCase("SUV")) {
			valorDia = 150;
		}
		
		else if(this.tipo.equalsIgnoreCase("LUXO")) {
			valorDia = 250;
		}
	
		return "Placa:" + placa + " Modelo:" + modelo + " Tipo: " + tipo + " Quilometragem atual: " + quilometragem + " Valor por dia: " + valorDia;
	} 
}

