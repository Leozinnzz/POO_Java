import java.util.*;
public class Transporte {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Onibus buzao1 = new Onibus(1, "Express", 40, 12.50);
		Onibus buzao2 = new Onibus(2, "Horizonte", 60);
		
		do {
		
			System.out.println("1 - embarcar passageiro: ");
			System.out.println("2 - desembarcar passageiro: ");
			System.out.println("3 - calcular renda: ");
			System.out.println("4 - exibir informações: ");
			System.out.println();
			System.out.print("Escolha uma opção: ");
			int opc = sc.nextInt();
			sc.nextLine();
			switch(opc) {
				case 1:
					System.out.print("Vai definir quantidade de passsageiros? (Sim ou Nao): ");
					String resp = sc.nextLine();
						if(resp.equalsIgnoreCase("sim")) {
							System.out.print("Digite a quantidade de passageiros: ");
							int qtd = sc.nextInt();
							System.out.println(qtd + " passageiros adicionado ao onibus");
							buzao1.embarcarPassageiro(qtd);
							buzao2.embarcarPassageiro(qtd);
						}
						else if(resp.equalsIgnoreCase("nao")) {
							System.out.println("1 passageiro adicionado ao onibus");
							buzao1.embarcarPassageiro();
							buzao2.embarcarPassageiro();
						}
						break;
				case 2:
					System.out.print("Vai definir a quantidade de passsageiros? (Sim ou Nao): ");		
					String resp2 = sc.nextLine();	
					if(resp2.equalsIgnoreCase("sim")){
						System.out.print("Digite a quantidade de passageiros para desembarcar: ");
						int qtd2 = sc.nextInt();
						System.out.println(qtd2 + " passageiros removido do onibus");
						buzao1.desembarcarPassageiro(qtd2);
						buzao2.desembarcarPassageiro(qtd2);
						sc.nextLine();
					} else if(resp2.equalsIgnoreCase("nao")){
						System.out.println("1 passageiro removido do onibus");
						buzao1.desembarcarPassageiro();
						buzao2.desembarcarPassageiro();
						sc.nextLine();
					}		
					break;
				case 3: 
					System.out.print("Digite o tipo da tarifa: ");
					String tarifa  = sc.nextLine();
					System.out.println(buzao1.calcularRenda(tarifa));
					System.out.println(buzao2.calcularRenda(tarifa));
					break;
				case 4:
					System.out.println(buzao1.exibirInfo());
					System.out.println(buzao2.exibirInfo(true));
			}
			
		}while(true);
	}
}
