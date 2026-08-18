import java.util.*;
public class Act5 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Digite o primeiro valor: "); 
		int n1 = sc.nextInt();
		System.out.print("Digite o segundo valor: "); 
		int n2 = sc.nextInt();
		System.out.print("Digite o terceiro valor: ");
		int n3 = sc.nextInt(); 
		System.out.print("Digite o quarto valor: "); 
		int n4 = sc.nextInt();
		
		if(n1 % 2 == 0 && n1 % 3 == 0 )
			System.out.println("O valor " + n1 + " E divisivel por 2 e por 3" ); 
		if(n2 % 2 == 0 && n2 % 3 == 0 )
			System.out.println("O valor " + n2 + " E divisivel por 2 e por 3" ); 
		if(n3 % 2 == 0 && n3 % 3 == 0 )
			System.out.println("O valor " + n3 + " E divisivel por 2 e por 3" ); 
		if(n4 % 2 == 0 && n4 % 3 == 0 )
			System.out.println("O valor " + n4 + " E divisivel por 2 e por 3" ); 
	
		
	}
}

