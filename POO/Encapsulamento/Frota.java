import java.util.Scanner;
public class Frota {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Carro c = new Carro(0.0); 
		
		c.setQuilometragem(10.0);
		System.out.print("Digite a quantidade de combustivel que queira abastecer: "); 
		double litros = sc.nextDouble();
		
		c.abastecer(litros);
		System.out.print("Digite a distancia que deseja percorrer ");
		int distancia = sc.nextInt(); 
		
		c.percorrerDistancia(distancia);
		System.out.println("Distancia percorrida: " + distancia);
		System.out.println("Combustivel: " + c.getCombustivel()); 
		System.out.println("Quilometragem: " + c.getQuilometragem()); 
		System.out.println("autonomia: " + c.autonomia()); 
	}
}

