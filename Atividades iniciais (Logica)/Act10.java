import java.util.*;
public class Act10{
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Digite a nota do trabalho de laboratorio: ");
		int nota1 = sc.nextInt(); 
		System.out.print("Digite a nota da avaliação semestral: ");
		int nota2 = sc.nextInt(); 
		System.out.print("Digite a nota do exame final: ");
		int nota3 = sc.nextInt(); 
		
		double mediaP = ( (nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		
		System.out.println("Media ponderada das notas digitadas: " + mediaP);
		
		if(mediaP > 8 && mediaP <= 10)
			System.out.println("Nota A");
		else if(mediaP > 7 && mediaP <= 8)
			System.out.println("Nota B");
		else if(mediaP > 6 && mediaP <= 7)
			System.out.println("Nota C");
		else if(mediaP > 5 && mediaP <= 6)
			System.out.println("Nota D");
		else if(mediaP > 0 && mediaP <= 5)
			System.out.println("Nota E");
	}
}
				
