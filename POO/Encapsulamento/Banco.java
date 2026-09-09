import java.util.Scanner;
public class Banco {	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaCorrente c = new ContaCorrente("Leo", 1234);
		
		System.out.println(c.cadastrar(1234));
		System.out.println(c.alterarSenha(1234, 3324));
		System.out.println(c.debitar(3324, 240.0));
		System.out.println(c.creditar(3324, 300.0));
		System.out.println(c.debitar(3324, 240.0));
		System.out.println(c.consultaSaldo(3323));
		
		
	}
}

