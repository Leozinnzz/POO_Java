import java.util.Scanner;

public class P2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produto p = new Produto("Abobora", 10.0, 10, "Alimentos");
		Produto p2 = new Produto("Arroz", 15.0, 20, "Alimentos");
		Produto p3 = new Produto("Feijao", 12.0, 10, "Alimentos");
		
		do {
			System.out.println("-----MENU-----");
			System.out.println("1. Vender um produto sem desconto.");
			System.out.println("2. Vender um produto com desconto.");
			System.out.println("3. Comprar produto sem frete.");
			System.out.println("4. Comprar produto com frete.");
			System.out.println("5. Calcular o valor total do estoque (sem imposto)."); 
			System.out.println("6. Calcular o valor total do estoque (com imposto)."); 
			System.out.println("7. Exibir detalhaes (sem estoque)."); 
			System.out.println("8. Exibir detalhaes (com estoque)."); 
			System.out.println("9. Sair do programa."); 
			System.out.println(); 
			System.out.print("Digite uma opção: "); 
			int opc = sc.nextInt(); 
			sc.nextLine();
			switch(opc) {
				case 1: 
					System.out.print("Digite a quantidade que voce deseja vender: ");
					int qtd = sc.nextInt();
					
					Double v1 = p.vender(qtd);
					Double v2 = p2.vender(qtd);
					Double v3 = p3.vender(qtd);
	
					System.out.println("Produto 1: " + (v1 != null ? v1 : "Quantidade indisponivel"));
					System.out.println("Produto 2: " + (v2 != null ? v2 : "Quantidade indisponível"));
					System.out.println("Produto 3: " + (v3 != null ? v3 : "Quantidade indisponivel"));
					break;
				case 2: 
					System.out.print("Digite a quantidade que voce deseja vender e um valor de desconto: ");
					int qtd2 = sc.nextInt();
					double desconto = sc.nextDouble();
					
					Double vd1 = p.vender(qtd2, desconto);
                    Double vd2 = p2.vender(qtd2, desconto);
                    Double vd3 = p3.vender(qtd2, desconto);
                    
                    System.out.println("Produto 1: " + (vd1 != null ? vd1 : "Quantidade indisponivel"));
                    System.out.println("Produto 2: " + (vd2 != null ? vd2 : "Quantidade indisponivel"));
                    System.out.println("Produto 3: " + (vd3 != null ? vd3 : "Quantidade indisponivel"));
					break;
				case 3: 
					System.out.print("Digite a quantidade que voce deseja comprar: (sem frete) "); 
					int c1 = sc.nextInt(); 
					System.out.println("Produto 1: " + p.comprar(c1));
					System.out.println("Produto 2: " + p2.comprar(c1));
					System.out.println("Produto 3: " + p3.comprar(c1));
					break;
				case 4: 
					System.out.print("Digite a quantidade que voce deseja comprar: (com frete) ");
					int c2 = sc.nextInt(); 
					System.out.println("Produto 1: " + p.comprar(c2, 20.0));
					System.out.println("Produto 2: " + p2.comprar(c2, 30.0));
					System.out.println("Produto 3: " + p3.comprar(c2, 50.0));
					break;
				case 5: 
					System.out.println("Valor total do estoque (sem imposto): " + p.calcularValorTotalEstoque());
					System.out.println("Valor total do estoque (sem imposto): " + p2.calcularValorTotalEstoque());
					System.out.println("Valor total do estoque (sem imposto): " + p3.calcularValorTotalEstoque());
					break;
				case 6: 
					System.out.println("Valor total do estoque (com imposto de 20%): " + p.calcularValorTotalEstoque(20.0));
					System.out.println("Valor total do estoque (com imposto de 20%): " + p2.calcularValorTotalEstoque(10.0));
					System.out.println("Valor total do estoque (com imposto de 20%): " + p3.calcularValorTotalEstoque(30.0));
					break;
				case 7: 
					System.out.println(p.exibirDetalhes());
					System.out.println(p2.exibirDetalhes());
					System.out.println(p3.exibirDetalhes());
					break;
				case 8: 
					System.out.println(p.exibirDetalhes(true));
					System.out.println(p2.exibirDetalhes(true));
					System.out.println(p3.exibirDetalhes(true));
					break;
				case 9: 
					return;
			}
			
		}while(true);
	}
}

