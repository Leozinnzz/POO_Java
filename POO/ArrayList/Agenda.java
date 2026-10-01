public class Agenda {
	private String nomeDaAgenda;
	private Pessoa contatos[];
	private int totalContatos;
	
	public Agenda(String nomeDaAgenda, int tamanho){
		this.nomeDaAgenda = nomeDaAgenda; 
		this.contatos = new Pessoa[tamanho];
		this.totalContatos = 0;
	}
	
	public boolean adicionaPessoa(Pessoa pessoa){
		if(pessoa == null) return false;
		if(buscaContato(pessoa.getNome()) != null) return false;
		for(int i = 0; i < contatos.length; i++){
			if(contatos[i] == null){
				contatos[i] = pessoa;
				totalContatos++;
				return true;
			}
		}
		return false;
	}
	
	public boolean removePessoa(Pessoa pessoa){
		for(int i = 0; i < contatos.length; i++){
			if(contatos[i] != null) {
				if(contatos[i].getNome().equalsIgnoreCase(pessoa.getNome())){
					contatos[i] = null;
					totalContatos--;
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean alteraInformacoes(Pessoa pessoa) { 
		for(int i = 0; i < contatos.length; i++) {
			if(contatos[i] != null) {
				if(contatos[i] == null) continue;
				if(contatos[i].getNome().equalsIgnoreCase(pessoa.getNome())){
					contatos[i] = pessoa;
					return true;
				}
			}
		}		
		return false;
	}
	
	public Pessoa[] buscaPessoas(){
		Pessoa list[] = new Pessoa[totalContatos];
		int idc = 0;
		for(Pessoa p : contatos){
			if(p != null) {
				list[idc++] = p;
			}
		}
		return list;
	}
	
	public Pessoa buscaContato(String nome) {
		if (nome == null) return null;
		for (Pessoa pessoa : contatos){
			if (pessoa == null) continue;
			if (pessoa.getNome().equalsIgnoreCase(nome)){
				return pessoa;
			}
		}
		return null;
	}
	
    public String getNomeDaAgenda() {
        return nomeDaAgenda;
    }

    public int getTotalContatos() {
        return totalContatos;
    }
    
    public void setTotalContatos(int totalContatos) {
        this.totalContatos = totalContatos;
    }

    public void setNomeDaAgenda(String nomeDaAgenda) {
        this.nomeDaAgenda = nomeDaAgenda;
    }
    
    public Pessoa[] getContatos() {
        return contatos;
    }
    
    public void setContatos(Pessoa[] contatos) {
        this.contatos = contatos;
    }
    
}
