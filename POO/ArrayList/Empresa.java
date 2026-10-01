import java.util.Scanner;
public class Empresa{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		SetorPessoal s = new SetorPessoal();
		
		do {
			System.out.println("\n1 - Adicionar funcionario");
			System.out.println("2 - Remover funcionario");
			System.out.println("3 - Buscar funcionario (matricula) ");
			System.out.println("4 - Buscar funcionario (nome) ");
			System.out.println("5 - Listar funcionarios (departamento) ");
			System.out.println("6 - Listar funcionarios (função) ");
			System.out.println("7 - Listar funcionarios");
			System.out.println("8 - Ordenar vetor");
			System.out.print("\nDigite uma opção: "); 
			int opc = sc.nextInt(); 
			sc.nextLine();
			switch(opc){
				case 1:
					Funcionario f1 = new Funcionario();
					System.out.print("Matricula: ");
					int matricula = sc.nextInt();
					
					sc.nextLine();
					System.out.print("Nome: ");
					String nome = sc.nextLine(); 
					
					System.out.print("Departamento: ");
					int departamento = sc.nextInt();
					
					System.out.print("Salario: ");
					double sal = sc.nextDouble();
				
					System.out.print("Função: ");
					sc.nextLine();
					String funcao = sc.nextLine();
					
					f1.setMatricula(matricula);
					f1.setNome(nome);
					f1.setDepartamento(departamento);
					f1.setSalario(sal);
					f1.setFuncao(funcao);
					
					s.adicionarFuncionario(f1);
					break;
				case 2:
					System.out.println("Digite o numero do funcionario: ");
					int m = sc.nextInt();
					Funcionario f = s.buscarFuncionario(m);
					s.removerFuncionario(f);
					break;
				case 3: 
					System.out.println("Digite o numero da matricula do funcionario: ");
					int mat = sc.nextInt(); 
					s.buscarFuncionario(mat);
					break;
				case 4:
					System.out.println("Digite o nome do funcionario: ");
					String name = sc.nextLine();
					s.buscarFuncionario(name);
					break;
				case 5:
					System.out.println("Digite o departamento: ");
					int dep = sc.nextInt();
					sc.nextLine();
					Funcionario lista[] = s.listarFuncionarios(dep);
					for(Funcionario func: lista){
						if(func != null) {
							System.out.println("\nNome do funcionario: " + func.getNome());
							System.out.println("Matricula do funcionario: " + func.getMatricula());
							System.out.println("Departamento do funcionario: " + func.getDepartamento());
							System.out.println("Salario do funcionario: " + func.getSalario());
							System.out.println("Funcao do funcionario: " + func.getFuncao());
						}
					}
					break;
				case 6:
					System.out.println("Digite a função: ");
					String fcl = sc.nextLine();
					Funcionario lista2[] = s.listarFuncionarios(fcl);
					for(Funcionario func: lista2){
						if(func != null) {
							System.out.println("\nNome do funcionario: " + func.getNome());
							System.out.println("Matricula do funcionario: " + func.getMatricula());
							System.out.println("Departamento do funcionario: " + func.getDepartamento());
							System.out.println("Salario do funcionario: " + func.getSalario());
							System.out.println("Funcao do funcionario: " + func.getFuncao());
						}
					}
					break;
				case 7: 
					Funcionario lista3[] = s.listarFuncionarios();
					for(Funcionario func: lista3){
						if(func != null) {
							System.out.println("\nNome do funcionario: " + func.getNome());
							System.out.println("Matricula do funcionario: " + func.getMatricula());
							System.out.println("Departamento do funcionario: " + func.getDepartamento());
							System.out.println("Salario do funcionario: " + func.getSalario());
							System.out.println("Funcao do funcionario: " + func.getFuncao());
						}
					}
					break;
				case 8:
					s.ordenarVetor();
					break;
			}
		}while(true);
	}
}
