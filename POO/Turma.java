import java.util.*;
public class Turma {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Aluno> alunos = new ArrayList<Aluno>(); 
		
		
		Aluno a1 = new Aluno();
			
		System.out.print("Digite o nome do primeiro aluno: "); 
		String nome1 = sc.nextLine(); 
		System.out.print("Digite a 1° nota do primeiro aluno: "); 
		Double nota1 = sc.nextDouble(); 
		System.out.print("Digite a 1° nota do primeiro aluno: "); 
		Double nota2 = sc.nextDouble(); 
		
		a1.nome = nome1; 
		a1.nota1 = nota1; 
		a1.nota2 = nota2;
		alunos.add(a1);
		
		
		Aluno a2 = new Aluno();
		sc.nextLine();
		System.out.print("Digite o nome do segundo aluno: "); 
		String nome2 = sc.nextLine(); 
		System.out.print("Digite a 1° nota do segundo aluno: "); 
		Double nota3 = sc.nextDouble(); 
		System.out.print("Digite a 1° nota do segundo aluno: "); 
		Double nota4 = sc.nextDouble(); 
		
		a2.nome = nome2; 
		a2.nota1 = nota3; 
		a2.nota2 = nota4;
		alunos.add(a2);
		
		
		System.out.println("Primeiro aluno: "); 
		System.out.println("Nome: " + a1.nome); 
		System.out.println("media das notas: " + a1.media(nota1, nota2)); 
		System.out.println("Resultado: " + a1.resultado(a1.media(nota1, nota2)));
		
				
		System.out.println("Segundo aluno: "); 
		System.out.println("Nome: " + a2.nome); 
		System.out.println("media das notas: " + a2.media(nota3, nota4)); 
		System.out.println("Resultado: " + a2.resultado(a2.media(nota3, nota4)));
		
		sc.close();
		
		
		
	}
}

