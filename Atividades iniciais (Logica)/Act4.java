/*
4. Construa um programa que leia três valores para os lados de um
triângulo (A, B e C). O programa deve verificar se os lados fornecidos
formam realmente um triângulo. Em caso positivo, deve mostrar a
mensagem “Os lados formam um triângulo” e caso contrário “Os valores
informados não podem formar um triângulo”. Para que três valores de
lados formem um triângulo, cada par de lados somados não pode ser
menor ou igual ao terceiro lado.
*/

import java.util.*;
public class Act4 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Digite o valor de A: ");
		int A = sc.nextInt();
		System.out.print("Digite o valor de B: ");
		int B = sc.nextInt();
		System.out.print("Digite o valor de C: ");
		int C = sc.nextInt();
		
		if(A + B > C  && A + C > B && B + C > A)
			System.out.println("Os lados formam um triângulo"); 
		else 
			System.out.println("Os lados não formam um triângulo"); 
		sc.close(); 
	}
}

