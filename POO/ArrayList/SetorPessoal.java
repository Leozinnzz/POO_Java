public class SetorPessoal {	
	Funcionario funcionarios[] = new Funcionario[10]; 
	
	public boolean adicionarFuncionario(Funcionario funcionario) {
		for(int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i] == null) {
				funcionarios[i] = funcionario;
				return true;
			}
		}
		return false;
	}
	
	public boolean removerFuncionario(Funcionario funcionario) {
		for(int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i] == null) {
				funcionarios[i] = funcionario;
				return true;
			}
		}
		return false;
	}
}

