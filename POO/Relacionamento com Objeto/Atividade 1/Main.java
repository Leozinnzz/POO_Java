import java.util.Scanner;
public class Main {	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa p = new Pessoa();
		ContaBancaria c = new ContaBancaria();
		
		p.setNome("Leonardo");
		p.setCpf("123456785");
		p.setEndereco("Rua - A");
		p.setTelefone("99103692");
		
		c.setCliente(p);
		c.setNumeroDaConta(4);
		System.out.println(c.depositar(120.0));
		System.out.println(c.sacar(10.0));
		
		
		System.out.println("Nome: " + c.getCliente().getNome() +
		" CPf" + c.getCliente().getCpf() + " Endereço: " 
		+ c.getCliente().getEndereco() + " Telefone: " + c.getCliente().getTelefone() +
		" Renda: "+ c.getCliente().getRenda() + " Saldo: " + c.getSaldo());
	
	}
}

