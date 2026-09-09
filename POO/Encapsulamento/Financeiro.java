import java.util.Scanner;
import java.util.ArrayList;
public class Financeiro {	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); 
		Boleto b = new Boleto(12, "Agua", 15, 220.0);
		
		System.out.println(b.pagar(18, 10, 220.0));
		/*
		 
		ArrayList<Boleto> list = new ArrayList<>();
		boolean flag = true;
		while (flag){
			System.out.println("======= Menu ========");
			System.out.println("0 - sair");
			System.out.println("1 - Gerar Boleto");
			System.out.println("2 - Pagar Boleto");
			System.out.println("3 - Mostrar Boletos");
			System.out.print("Escolha uma opção: ");
			int resp = sc.nextInt(); 
			switch(resp) {
				case 1: 
					System.out.print("Digite o codigo do boleto: ");
					int codigo = sc.nextInt(); 
					sc.nextLine();
					System.out.print("Digite a descricao do boleto: ");
					String descricao = sc.nextLine(); 
					System.out.print("Digite o dia de vencimento do boleto: ");
					int diaDeVencimento = sc.nextInt(); 
					System.out.print("Digite o valor do boleto: ");
					double valor = sc.nextDouble(); 
					Boleto b = new Boleto(codigo, descricao, diaDeVencimento, valor);
					list.add(b);
					break;
				case 2:
					Boleto c = new Boleto(0, "", 0, 0.0);
					System.out.print("Digite o dia para realizar o pagamento: ");
					int dia = sc.nextInt();
					System.out.print("Digite o desconto em porcentagem: ");
					double desconto = sc.nextDouble();
					System.out.print("Digite o valor para pagar: ");
					double valorPago = sc.nextDouble();
					boolean resultado = c.pagar(dia, desconto, valorPago);
					break;
				case 3: 
					
					for(int i = 0; i < list.size(); i++) {
						Boleto bl = list.get(i);
						System.out.println("Boleto " + (i+1)); 
						System.out.println(bl.exibir()); 
						
					}
					break; 
					
				case 0:
					flag = false; 
					break; 
				default:
					System.out.println("Digite uma opção valida! ");
			}
		}
		*/
		
		
	}
}

