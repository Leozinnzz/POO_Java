import java.util.Scanner;
public class Disciplina{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Aluno a = new Aluno("Leonardo", 1,  6.0);
		Aluno a2 = new Aluno("Joao", 2,  10.0);
		
		System.out.println("Alunos");
		System.out.println(a.resultado());
		System.out.println(a2.resultado());
		
	}
}

