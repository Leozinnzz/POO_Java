import java.util.Scanner;
public class Cinema{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		SessaoCinema f1 = new SessaoCinema(2, "Homem Aranha", 120, 25.00);
		
		System.out.println("Bem vindo ao sistema do cinema");
		Boolean loop = true;
		while(loop){
			System.out.printf("\nO que deseja fazer?\n");
			System.out.println("1 - Vender Ingresso");
			System.out.println("2 - Calcular Bilheteria");
			System.out.println("3 - Exibir Sessão");
			System.out.println("4 - Encerrar Programa");
			System.out.println("Ingressos vendidos:" + f1.getIngressosVendidos());
			int opt = scan.nextInt();
			
			switch(opt){
				case 1:
				scan.nextLine();
				System.out.println("Quantos ingressos deseja comprar?");
				int qtd = scan.nextInt();
				if(f1.venderIngresso(qtd) < 0.0){ //Execução do método em redundancia. Gera valores incorretos.
					System.out.println("Sessão lotada");
					break;
					}
				scan.nextLine();
				System.out.println("É meia entrada? (S/N)");
				boolean meiaEntrada = scan.nextLine().equalsIgnoreCase("S");
				if(qtd == 1){
						if(meiaEntrada){
							System.out.println("Ingresso para " + f1.getFilme() + " comprado com sucesso. Valor R$ " + f1.venderIngresso(qtd,meiaEntrada));
							} else{
								System.out.println("Ingresso para " + f1.getFilme() + " comprado com sucesso. Valor R$ " + f1.venderIngresso());
								}
					} else{
						if(meiaEntrada){
								System.out.println("Ingressos para " + f1.getFilme() + " comprado com sucesso. Valor R$ " + f1.venderIngresso(qtd, meiaEntrada));
							}else{
								System.out.println("Ingressos para " + f1.getFilme() + " comprado com sucesso. Valor R$ " + f1.venderIngresso(qtd));
								}
						}
				break;
				
				case 2:
				System.out.println("Bilheteria de: " + f1.getFilme() + " - Atual: R$ " + f1.calcularBilheteria());
				break;
				
				case 3:
				scan.nextLine();
				System.out.println(f1.exibirSessao());
				System.out.println("Deseja mostrar lotação? (S/N)");
				boolean mostrarLotacao = scan.nextLine().equalsIgnoreCase("S");
				if(mostrarLotacao){
					System.out.println(f1.exibirSessao(mostrarLotacao));
					}
				break;
				case 4:
				System.out.println("PROGRAMA ENCERRADO");
				loop = false;
				break;
				default:
				System.out.println("Opção inválida");
				break;

				}
			
			}
		}
	}
