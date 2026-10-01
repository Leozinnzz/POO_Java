public class SetorPessoal {	
	Funcionario funcionarios[] = new Funcionario[10]; 
	
	public boolean adicionarFuncionario(Funcionario funcionario) {
		for(int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i] != null) {
				if(funcionarios[i].getNome().equalsIgnoreCase(funcionario.getNome()) || funcionarios[i].getMatricula() == funcionario.getMatricula())
				return false;
			}
				
			if(funcionarios[i] == null) {
				funcionarios[i] = funcionario;
				return true;
			}
		}
		return false;
	}
	
	public boolean removerFuncionario(Funcionario funcionario) {
		for(int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i] != null) {
				if(funcionarios[i].getMatricula() == (funcionario.getMatricula())) {
					funcionarios[i] = null;
					return true;
				}
			}
		}
		return false;
	}
	
	public Funcionario buscarFuncionario(int matricula) {
		for(int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i] != null) {
				if(funcionarios[i].getMatricula() == matricula){
					return funcionarios[i];
				}
			}	
		}
		return null;
	}
	
	public Funcionario buscarFuncionario(String nome){
		for(int i = 0; i < funcionarios.length; i++) {
			if(funcionarios[i] != null) {
				if(funcionarios[i].getNome().equalsIgnoreCase(nome))
					return funcionarios[i];
			}
		}
		return null;
	}
	
	public Funcionario[] listarFuncionarios(int departamento){
		Funcionario lista[] = new Funcionario[funcionarios.length];
		for(int i = 0; i < funcionarios.length; i++){
			if(funcionarios[i] != null){
				if(funcionarios[i].getDepartamento() == departamento){ 
					lista[i] = funcionarios[i];
				}
			}
			
		}
		return lista;
	}
	
	public Funcionario[] listarFuncionarios(String funcao){
		Funcionario lista[] = new Funcionario[funcionarios.length];
		for(int i = 0; i < funcionarios.length; i++){
			if(funcionarios[i] != null){
				if(funcionarios[i].getFuncao().equalsIgnoreCase(funcao)){ 
					lista[i] = funcionarios[i];
				}
			}
		}
		return lista;
	}
	
	public Funcionario[] listarFuncionarios(){
		return funcionarios;
	}
	
	public void ordenarVetor() {
		for (int i = 1; i < funcionarios.length; i++)
		{
			int j = i - 1;
			Funcionario key = funcionarios[i];
			
			while(j >= 0 && funcionarios[j].getMatricula() > key.getMatricula()) {
				funcionarios[j + 1] = funcionarios[j];
				j++;
			}
			
			funcionarios[j] = key;
		}
	}
}

