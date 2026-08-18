public class R {
	public static void main (String[] args) {
		Retangulo retangulo = new Retangulo();
		double resp = retangulo.calcularArea(4.0, 2.0);
		double resp2 = retangulo.calcularPerimetro(4.0, 2.0);
		System.out.println("Area do retangulo: " + resp + "²");
		System.out.println("Perimetro do retangulo: " + resp2);
	}
}

