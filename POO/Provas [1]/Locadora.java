import java.util.Scanner;
public class Locadora {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); 
		Veiculo v1 = new Veiculo("ADDF4", "MODELO A", "ECONOMICO");
		Veiculo v2 = new Veiculo("MDSF1", "MODELO B", "SUV", 10);
		Veiculo v3 = new Veiculo("CGSH2", "MODELO C", "LUXO");
	
		
		boolean flag = true;
		while(flag) {
			System.out.println("========MENU=======");
			System.out.println("1 - Calcular Locacao ");
			System.out.println("2 - Calcular Locacao de veiculo rodado");
			System.out.println("3 - Calcular Locacao de veiculo rodado com seguro");
			System.out.println("4 - Exibir detalhes do veiculo");
			System.out.println("0 - Encerrar sessão");
			int opc = sc.nextInt();
			switch(opc) {
				case 1:   
					System.out.println("Calculo de locacao veiculo 1: " + v1.calcularLocacao(10));
					System.out.println("Calculo de locacao veiculo 2: " + v2.calcularLocacao(20));
					System.out.println("Calculo de locacao veiculo 3: " + v3.calcularLocacao(30));
					break;
				case 2: 
					System.out.println("Calculo de locacao com quilometros rodados v1: " + v1.calcularLocacao(2, 10));
					System.out.println("Calculo de locacao com quilometros rodados v2: " + v2.calcularLocacao(5, 15));
					System.out.println("Calculo de locacao com quilometros rodados v3: " + v3.calcularLocacao(4, 10));
					break;
				case 3: 
					System.out.println("Calculo de locacao com quilometros rodados com a taxa v1: " + v1.calcularLocacao(10, 15, true));
					System.out.println("Calculo de locacao com quilometros rodados com a taxa v2: " + v2.calcularLocacao(20, 15, true));
					System.out.println("Calculo de locacao com quilometros rodados com a taxa v3: " + v3.calcularLocacao(30, 15, true));
					break;
				case 4: 
					System.out.println("Veiculo 1: " + v1.exibirDetalhes());
					System.out.println("Veiculo 2: " + v2.exibirDetalhes());
					System.out.println("Veiculo 3: " + v3.exibirDetalhes());	
					break;
				case 0: 
					flag = false;
					break;
			}
		}
		
	}
}
