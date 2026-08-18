/*
 * 3. Construa um programa que leia três valores numéricos (representados
pelas variáveis A, B e C) e faça o cálculo do delta de uma equação de
segundo grau, segundo a fórmula de Báskara. O programa deve mostrar
quantas raízes reais a equação possui (delta < 0 – mostrar uma
mensagem dizendo que a equação não possui raízes reais, delta > 0 –
mostrar que possui duas raízes reais, delta = 0 – mostrar que possui
uma única raiz real).
*/

import java.util.*;
public class Act3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Digite o valor de A: ");
		int A = sc.nextInt(); 
		System.out.print("Digite o valor de B: ");
		int B = sc.nextInt(); 
		System.out.print("Digite o valor de C: ");
		int C = sc.nextInt();
		
		int delta = (B*B) - 4*A*C; 
		
		if(delta < 0) 
			System.out.println("Essa equação não possui raízes reais.");
		else if(delta > 0) 
			System.out.println("Essa equação possui  duas raízes reais.");
		else if(delta == 0)
			System.out.println("Essa equação possui uma unica raíz real.");
			
			
		sc.close();
	}
}

