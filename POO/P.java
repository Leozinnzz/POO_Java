import java.util.*;
public class P {	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Pessoa> lista = new ArrayList<>();
		Pessoa p = new Pessoa(2, "humano", "Joao", 19, 1.72);
		System.out.println(p.nome + " disse: " + p.latir("humano"));
	
		
	}
}

