public class Data {
	private int dia; 
	private int mes; 
	private int ano; 
	
	public Data() {
	
	}
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes; 
		this.ano = ano;
	}
	
	public String retornarData() {
		return  "0" + dia + "/" + mes + "/" + ano;
	}
	
	public int getAno(){
		return ano;
	}
	
	public String calcularTempo(Data data) {
		int anos = this.ano - data.ano;
		int meses = this.mes - data.mes;
		if(meses > 12)
			ano++;
		int dia = this.dia - data.dia;
		if(dia > 30)
			meses++;
		return "Anos: " + anos + " Meses " + meses + " Dias: " + dia;
	}
	
	
}

