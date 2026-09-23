import java.util.Scanner;
public class Cinema {
	public static void main (String[] args) { 
		Scanner sc = new Scanner(System.in);
		SessaoCinema c1 = new SessaoCinema(1, "Homem aranha", 40); 
		SessaoCinema c2 = new SessaoCinema(2, "Bad Boys", 60, 50.0); 
	 
		int opc; 
		
		do {
			
			System.out.println("Escolha o filme: "); 
			System.out.println("1 - " + c1.exibirSessao());
			System.out.println("2 - " + c2.exibirSessao());
			System.out.print("\nDigite uma opcao: ");
			int resp = sc.nextInt();
			sc.nextLine();
            SessaoCinema filmeSelecionado = null;
			switch(resp) {
				case 1:
					filmeSelecionado = c1;
					break;
				case 2:
					filmeSelecionado = c2;
					break;
				default:
					System.out.println("Opção invalida! ");
					continue;
			}
			
			System.out.println("Menu de Opções do " + resp + "° Filme selecionado");
			System.out.println("1 - vender ingresso");
			System.out.println("2 - calcular Bilheteria");
			System.out.println("3 - Exibir Sessao");
			System.out.print("\nDigite uma opção: ");
			int opt = sc.nextInt();
			sc.nextLine();
			switch(opt) {
				case 1: 
					System.out.print("Quantos ingressos vai vender? (Digite 1 para venda unica) : ");
                    int qtdIngresso = sc.nextInt();
                    sc.nextLine();
					double vendaSucesso = 0.0;
                       
                    if(qtdIngresso == 1) {
						vendaSucesso = filmeSelecionado.venderIngresso();
							if(vendaSucesso > 0.0) {
								System.out.println("Ingresso vendido com sucesso!");
								System.out.println("Valor da venda do ingresso: " + vendaSucesso);
							}else {
								System.out.println("Erro capacidade insuficiente!");
							}
					}else {
						System.out.print("Vai ser meia entrada? (sim/nao) "); 
						String meiaEntrada = sc.nextLine();
						if(meiaEntrada.equalsIgnoreCase("sim")) {
							vendaSucesso = filmeSelecionado.venderIngresso(qtdIngresso, true);
							if(vendaSucesso > 0.0) {
								System.out.println("Ingresso vendido com sucesso!");
								System.out.println("Valor da venda do ingresso com o desconto de meia entrada: " + vendaSucesso);
							}else {
								System.out.println("Erro capacidade insuficiente!");
							}
						}else if(meiaEntrada.equalsIgnoreCase("nao")) {
							vendaSucesso = filmeSelecionado.venderIngresso(qtdIngresso);
							if(vendaSucesso > 0.0) {
								System.out.println("Ingresso vendido com sucesso!");
								System.out.println("Valor da venda do ingresso: " + vendaSucesso);
							}else {
								System.out.println("Erro capacidade insuficiente!");
							}
						}
					}
					break;
                case 2: 
					System.out.println("Valor total da bilheteria " + filmeSelecionado.calcularBilheteria());
					break;
				case 3: 
					System.out.print("Deseja exibir a essão com lotação? (sim/nao) ");
					String result = sc.nextLine();
					if(result.equalsIgnoreCase("sim")) {
						System.out.println(filmeSelecionado.exibirSessao(true));
					} 
					else if(result.equalsIgnoreCase("nao")) {
						System.out.println(filmeSelecionado.exibirSessao());
					}
			}
				
				
			
		}while(true);
	}
}

