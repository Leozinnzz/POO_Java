import java.util.Scanner;

public class Cinema {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		SessaoCinema sessao = new SessaoCinema(101, "O Devorador de Estrelas", 30);
		
		
		int opcao = -1;
		do {
			System.out.println("=== MENU - CINEMA ===");
			System.out.println("1. Exibir sessão");
			System.out.println("2. Vender ingresso");
			System.out.println("3. Vender ingresso com quantidade");
			System.out.println("4. Vender ingresso com quantidade definida e meia entrada");
			System.out.println("5. Calcular bilheteria");
			System.out.println("0. Sair");
			System.out.print("Digite a opção: ");
			opcao = scan.nextInt();
			scan.nextLine();
			
			if (opcao < 0 || opcao > 5) {
				System.out.println("INFO: Opção inválida.");
				continue;
			}
			
			if (opcao == 1) {
				System.out.print("Exibir com lotação? (1. Sim | 2. Não) ");
				int lotacao = scan.nextInt();
				scan.nextLine();
				
				if (lotacao == 1) {
					System.out.println("\n--> Sessão");
					System.out.println(sessao.exibirSessao(true));
				} else if(lotacao == 2) {
					System.out.println("\n--> Sessão");
					System.out.println(sessao.exibirSessao());
				} else {
					System.out.println("INFO: Valor inválido.");
				}
			} else if (opcao == 2) {
				System.out.println("\n--> Vender ingresso");
				Double valorVenda = sessao.venderIngresso();
				
				if (valorVenda > 0) {
					System.out.println("Valor da venda: R$" + valorVenda);
					System.out.println("INFO: Venda realizada com sucesso.");
				} else {
					System.out.println("INFO: Falha ao vender ingresso");
				}
			} else if (opcao == 3) {
				System.out.println("\n--> Vender ingresso");
				
				System.out.print("Digite a quantidade de ingressos: ");
				int quantidade = scan.nextInt();
				scan.nextLine();
				
				Double valorVenda = sessao.venderIngresso(quantidade);
				
				if (valorVenda > 0) {
					System.out.println("Valor da venda: R$" + valorVenda);
					System.out.println("INFO: Venda realizada com sucesso.");
				} else {
					System.out.println("INFO: Falha ao vender ingresso");
				}
			} else if (opcao == 4) {
				System.out.println("\n--> Vender ingresso");
				
				System.out.print("Digite a quantidade de ingressos: ");
				int quantidade = scan.nextInt();
				scan.nextLine();
				
				System.out.print("Com meia entrada? (1. Sim | 2. Não) ");
				int meiaEntrada = scan.nextInt();
				scan.nextLine();
				
				Double valorVenda = 0.0; 
				
				if (meiaEntrada == 1) {
					valorVenda = sessao.venderIngresso(quantidade, true);
					System.out.println("INFO: Valor inválido.");
				} else if (meiaEntrada == 2) {
					valorVenda = sessao.venderIngresso(quantidade, false);
				} else {
					System.out.println("INFO: Valor inválido.");
				}
				 
				if (valorVenda > 0) {
					System.out.println("Valor da venda: R$" + valorVenda);
					System.out.println("INFO: Venda realizada com sucesso.");
				} else {
					System.out.println("INFO: Falha ao vender ingresso");
				}
			} else if (opcao == 5) {
				System.out.println("\n--> Arrecadação da bilheteria.");
				System.out.println("Valor arrecadado: R$ " + sessao.calcularBilheteria());
			} else {
				System.out.println("\nAplicação finalizada.");
			}
			
			System.out.println();
		} while(opcao != 0);
		
		scan.close();
	}
}
