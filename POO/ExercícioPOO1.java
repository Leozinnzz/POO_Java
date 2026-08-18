import java.util.*;
public class ExercícioPOO1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<EX1> lista = new ArrayList<>();  
		
		for(int i = 0; i < 3; i++) {
			EX1 funcionario = new EX1();
			System.out.println("Funcionario " + (i+1) + ":"); 
			System.out.print("Nome:" ); 
			String nome = sc.nextLine();
			System.out.print("Horas trabalhadas: ");
			double horasTrabalhadas = sc.nextDouble();
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			sc.nextLine();
			funcionario.nome = nome; 
			funcionario.horasTrabalhadas = horasTrabalhadas;
			funcionario.valorHora = valorHora;
			lista.add(funcionario);
		}
			
		for(int i = 0; i < lista.size(); i++) {
			System.out.println("Funcionario " + (i+1) ); 
			EX1 func = lista.get(i);
			System.out.println("Nome: " + func.nome); 
			System.out.println("Salario: " + func.salarioFinal(func.horasTrabalhadas, func.valorHora)); 
		}
	}
}

