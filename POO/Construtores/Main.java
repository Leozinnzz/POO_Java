import java.util.Scanner;
public class Main{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); 
		Aluno a1 = new Aluno(1, "Leonardo", "123458902-35", "RUA-A");
		Aluno a2 = new Aluno(1, "Joao", "1489674345-43", "RUA-B");
		
		System.out.println("1° Aluno: " + a1.toString());
		System.out.println("2° Aluno: " + a2.toString());
		
	}
}




