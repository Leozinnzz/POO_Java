import java.util.Scanner;
public class Loja {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Fatura f1 = new Fatura(1, "Notebook", 2, 350.0);
		Fatura f2 = new Fatura(4, "Celular", 4, 500.0);
		
		System.out.println("Resultado da primeira fatura: " + f1.getValorDaFatura()); 
		System.out.println("Resultado da segunda fatura: " + f2.getValorDaFatura()); 
		
		
	}
}

