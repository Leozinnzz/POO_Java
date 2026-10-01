import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa jao = new Pessoa("Asdrubal");
		Agenda a = new Agenda("Campeões", 12);
		
		
		boolean flag = true;
		while(flag){
			Pessoa[] list = a.buscarPessoas(); 
			
			System.out.println("\n==================MENU====================");
			System.out.println("1 - cadastrar contatos");
			System.out.println("2 - remover contatos");
			System.out.println("3 - buscar um contato pelo nome");
			System.out.println("4 - alterar contato");
			System.out.println("5 - listar aniversariantes de um mês");
			System.out.println("6 - listar telefones de contatos que tenham telefone cadastrado");
			System.out.print("\nDigite uma opção: ");
			int opc = sc.nextInt();
			sc.nextLine();
			switch(opc){
				case 1:
					Pessoa p2 = new Pessoa("Leo", 19, 4, "99103692");
					System.out.println((a.adicionarPessoa(p2) == true ? "Pessoa adicionada com sucesso!" : "Erro fatal!"));
					break; 
				case 2:
					Pessoa alvo = a.buscarContato("Leo");
					a.removerPessoa(alvo);
					break;
				case 3: 
					System.out.print("Digite o nome: ");
					String name = sc.nextLine();
					Pessoa contato = a.buscarContato(name);
					System.out.println(contato);
					break;
				case 4:
					Pessoa p1 = new Pessoa("Joao", 21, 4, "997228043");
					a.alterarInformacoes(p1);
					break;
				case 5:
					System.out.println("Digite um mes para a busca: ");
					int mes = sc.nextInt();
					sc.nextLine();
					
					for(int i = 0; i < a.getTotalContatos(); i++) {
						Pessoa p = list[i];
						if(list[i].getMesDeNascimento() == mes){
							System.out.println("Nome: " + p.getNome() + "Dia de nascimento: " +
							p.getDiaDeNascimento() + "Mes de nascimento: " + p.getMesDeNascimento());
						}
					}
					break;
				case 6: 
					System.out.println("Telefones cadastrados"); 
					for(int i = 0; i < a.getTotalContatos(); i++) {
						Pessoa pep = list[i]; 
						if(pep != null) {
							String tel = pep.getTelefone();
							System.out.println("Nome: " + pep.getNome() + " Telefone: " + tel);
						}
					} 
					break;
				case 0:	
					flag = false;
					System.out.println("Loop encerrado");
				default:
					System.out.println("Digite uma opção válida!");
					
			}
		}
	}
}
