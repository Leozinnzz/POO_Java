import java.util.*;
public class Quad {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Digite o lado do primeiro quadrado: ");
		double lado1 = sc.nextDouble();
		Quadrado q1 = new Quadrado(lado1);
		System.out.print("Digite o lado do segundo quadrado: ");
		double lado2 = sc.nextDouble();
		Quadrado q2 = new Quadrado(lado2);
		System.out.println("Area do primeiro quadrado: " + q1.calcularArea(q1.lado) + "m²");
		System.out.println("Area do segundo quadrado: " + q2.calcularArea(q2.lado) + "m²");
		
		System.out.println("Perimetro do primeiro quadrado: " + q1.calcularPerimetro(q1.lado) + "m²");
		System.out.println("Perimetro do segundo quadrado: " + q2.calcularPerimetro(q2.lado) + "m²");
	}
}


