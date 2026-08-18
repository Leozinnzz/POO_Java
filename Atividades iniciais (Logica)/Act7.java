import java.util.*; 
public class Act7 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Digite o primeiro valor: "); 
		int n1 = sc.nextInt();  
		System.out.print("Digite o segundo valor: "); 
		int n2 = sc.nextInt();  
		System.out.print("Digite o terceiro valor: "); 
		int n3 = sc.nextInt();
		
		int maior = Math.max(n1, Math.max(n2, n3)); 
		
		System.out.println("Maior número: " + maior); 
		
		sc.close();
	}
}

