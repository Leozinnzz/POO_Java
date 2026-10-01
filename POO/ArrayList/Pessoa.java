public class Pessoa {
	private String nome;
	private int diaDeNascimento;
	private int mesDeNascimento;
	private String telefone;
	
	public Pessoa (String nome, int diaDeNascimento, int mesDeNascimento, String telefone){
		this.nome = nome;
		this.diaDeNascimento = diaDeNascimento; 
		this.mesDeNascimento = mesDeNascimento;
		this.telefone = telefone;
	}
	
	public Pessoa(String nome){
		this.nome = nome;
		this.diaDeNascimento = 0;
		this.mesDeNascimento = 0;
		this.telefone = "Indefined";
	}
	

    public String getNome() {
        return nome;
    }

    public int getDiaDeNascimento() {
        return diaDeNascimento;
    }

    public int getMesDeNascimento() {
        return mesDeNascimento;
    }

    public String getTelefone() {
        return telefone;
    }
   
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDiaDeNascimento(int diaDeNascimento) {
        this.diaDeNascimento = diaDeNascimento;
    }

    public void setMesDeNascimento(int mesDeNascimento) {
        this.mesDeNascimento = mesDeNascimento;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
