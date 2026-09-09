import java.util.*;
public class Empresa {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcionario f = new Funcionario("Leoz", 100.0, 12);
		System.out.println(f.mostrarSalario());
		
		Funcionario f2 = new Funcionario("Joao", 100.0, 13);
		System.out.println(f2.mostrarSalario(30));
		
		
	}
}

