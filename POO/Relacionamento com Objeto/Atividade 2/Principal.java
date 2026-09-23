import java.util.Scanner;
public class Principal {
	public static void main (String[] args) {
		Data d = new Data(07, 12, 2022);
		Data hoje = new Data(02, 11, 2021);
		Pessoa p1 = new Pessoa("Leonardo");
		
		System.out.println(p1.mostrarIdade(hoje));
		
	}
}

