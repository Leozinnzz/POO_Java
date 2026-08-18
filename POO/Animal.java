public class Animal {
	Integer id; 
	String tipo;
	
	public Animal(int id, String tipo){
		this.id = id;
		this.tipo = tipo;
	}
	
	public String latir(String tipo){
		return (tipo == "humano") ? "Auau" : "nada";
	}
}
