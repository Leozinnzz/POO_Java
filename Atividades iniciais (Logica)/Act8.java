import java.util.*; 
public class Act8 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int tam = 4;
		int[] vet = new int[tam]; 
		for(int i = 0; i < tam; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt(); 
		} 
		
		int menor = 9999999;
		for(int i = 0; i < tam; i++) {
			if(vet[i] < menor)
				menor = vet[i];
		}
		System.out.println("Menor numero: " + menor);
	}
}

