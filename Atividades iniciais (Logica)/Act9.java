/*
 9.Uma empresa decide dar um aumento de 30% aos funcionários cujo
salário é inferior a 5000. Escreva um programa que possa ser utilizado
para efetuar o cálculo do salário reajustado de um funcionário, a partir
do valor do salário informado pelo usuário.
*/

import java.util.*;
public class Act9 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o salario: "); 
		double salario = sc.nextDouble();
		double aumento = 0;
		double novoSalario = 0;
		if(salario <= 5000) {
			aumento = (salario/100) * 30; 
			novoSalario =+ salario + aumento;
		}
		
		System.out.println("O novo salario é de " + novoSalario + " Reais");
	}
}

