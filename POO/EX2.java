import java.util.*; 
public class EX2 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in); 
		ArrayList<Paciente> pacientes = new ArrayList<>();
		
		Paciente p1 = new Paciente();
		System.out.print("Digite o nome do primeiro paciente: "); 
		String nome1 = sc.nextLine(); 
		System.out.print("Digite o sexo do primeiro paciente: ");
		String sexo1 = sc.nextLine();
		System.out.print("Digite o peso do primeiro paciente: ");
		double peso1 = sc.nextDouble();
		System.out.print("Digite a altura do primeiro paciente: ");
		double altura1 = sc.nextDouble();
		sc.nextLine();
		
		//builders
		p1.nome = nome1; 
		p1.sexo = sexo1; 
		p1.peso = peso1; 
		p1.altura = altura1;
		pacientes.add(p1);


		Paciente p2 = new Paciente();
		System.out.print("Digite o nome do segundo paciente: "); 
		String nome2 = sc.nextLine(); 
		System.out.print("Digite o sexo do segundo paciente: ");
		String sexo2 = sc.nextLine();
		System.out.print("Digite o peso do segundo paciente: ");
		double peso2 = sc.nextDouble();
		System.out.print("Digite a altura do segundo paciente: ");
		double altura2 = sc.nextDouble();
		sc.nextLine();
		
		//builders
		p2.nome = nome2; 
		p2.sexo = sexo2; 
		p2.peso = peso2; 
		p2.altura = altura2;
		pacientes.add(p2);
		
		System.out.println("Paciente 1" );
		System.out.println("Nome: " + p1.nome);
		System.out.println("Sexo: " + p1.sexo);
		System.out.println("IMC: " + String.format("%.2f", p1.calcularIMC(p1.peso, p1.altura)));

		System.out.println("Paciente 2" );
		System.out.println("Nome: " + p2.nome);
		System.out.println("Sexo: " + p2.sexo);
		System.out.println("IMC: " + String.format("%.2f", p2.calcularIMC(p2.peso, p2.altura)));
		
	
	}
}

