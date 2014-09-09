package br.com.caelum.loja.cliente;

import java.rmi.Naming;

import br.com.caelum.loja.rmi.Carrinho;
import br.com.caelum.loja.rmi.CarrinhoFactory;
import br.com.caelum.loja.rmi.Livro;

public class ClienteLojaCarrinho {

	public static void main(String[] args) throws Exception {
		CarrinhoFactory factory = (CarrinhoFactory) Naming
				.lookup("rmi://192.168.10.116:1099/loja/carrinhos");

		Carrinho carrinho=factory.create();
		
		Livro l1 = new Livro();
		l1.setNome("Pais e Filhos");
		l1.setPreco(100.0);

		Livro l2 = new Livro();
		l2.setNome("Pais s");
		l2.setPreco(200.0);

		Livro l3 = new Livro();
		l3.setNome("Pbagulho");
		l3.setPreco(300.0);

		Livro l4 = new Livro();
		l4.setNome("Filhos");
		l4.setPreco(400.0);

		carrinho.addLivro(l1);
		carrinho.addLivro(l2);
		carrinho.addLivro(l3);
		carrinho.addLivro(l4);

		System.out.println(carrinho.getTotal());
	}

}
