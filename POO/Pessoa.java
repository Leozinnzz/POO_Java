public class Pessoa extends Animal {	
	String nome; 
	Integer idade; 
	Double altura;
	
	public Pessoa(int id, String tipo, String nome, Integer idade, double altura) {
		super(id, tipo);
		this.nome = nome; 
		this.idade = idade;
		this.altura = altura;
	}
	
	@Override
	public String toString(){
		return "Nome: " + nome + " Idade: " + idade + " Altura: " + altura;  
	}
}

