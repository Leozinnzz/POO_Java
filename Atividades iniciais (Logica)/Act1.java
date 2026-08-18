import java.util.*;

/*
 * 1. Faça um programa que leia dois valores numéricos inteiros e apresente
o resultado da diferença do maior valor pelo menor valor. Se os valores
forem iguais, o programa deve mostrar zero.
*/

public class Act1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o primeiro numero: "); 
		int n1 = sc.nextInt(); 
		System.out.print("Digite o segundo numero: ");
		int n2 = sc.nextInt();
		int resultado = n1-n2; 
		System.out.println("Diferença: " + resultado);
		
		

		sc.close();
	}
}

