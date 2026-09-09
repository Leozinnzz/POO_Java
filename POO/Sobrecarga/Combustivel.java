import java.util.Scanner;
public class Combustivel {	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Carro c1 = new Carro(10.0);
		
		System.out.println(c1.autonomia("etanol"));
		
		System.out.println(c1.autonomia("etanol", true));
		
	}
}

