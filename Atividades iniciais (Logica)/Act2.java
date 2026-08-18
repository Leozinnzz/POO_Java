import java.util.*;

public class Act2 {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		while(true) {
			System.out.print("Digite um valor numerico: ");
			int n1 = sc.nextInt(); 
			switch(n1){
				case 1:
					System.out.println("Permitido!");
					break;
				case 2: 
					System.out.println("Permitido!");
					break;
				case 3:
					System.out.println("Permitido!");
					break;
				case 4:
					System.out.println("Permitido!");
					break;
				case 5:
					System.out.println("Permitido!");
					break;
				case 6:
					System.out.println("Permitido!");
					break;
				case 7:
					System.out.println("Permitido!");
					break;
				case 8: 
					System.out.println("Permitido!");
					break;
				case 9:
					System.out.println("Permitido!");
					break;
				default: 
					System.out.println("O numero esta fora da lista permitida!");
			}
			if(n1 == 0) 
				break;
		}
	}
}

