import java.util.Scanner;
public class Principal {	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa p1 = new Pessoa("Leonardo");
		Pessoa p2 = new Pessoa("Jorge", "Masculino", 12, 2005);
		
		System.out.println(p1.mostrarIdade());
		System.out.println(p1.mostrarIdade(2005, 04));
		
		
		System.out.println(p2.mostrarIdade());
		System.out.println(p2.mostrarIdade(2005, 04));
	}
}

