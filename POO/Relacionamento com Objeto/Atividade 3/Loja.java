import java.util.Scanner; 
public class Loja {
	public static void main (String[] args) {
		Produto p = new Produto();
		Cliente c = new Cliente();
		Venda v = new Venda();
		
		//produto
		p.setCodigo(1);
		p.setDescricao("Arroz");
		p.setCusto(20.0);
		p.calculaPreco();
		
		//cliente 
		c.setNome("Leo");
		c.setCpf("12342355");
		c.setRenda(10.0);
		c.calculaLimite();
		
		v.setNumero(1);
		v.setQuantidade(1); 
		v.setComprador(c);
		v.setProduto(p);
		System.out.println(v.imprimir());
		
	}
}

