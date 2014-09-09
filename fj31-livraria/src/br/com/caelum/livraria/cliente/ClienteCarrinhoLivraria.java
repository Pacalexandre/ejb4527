package br.com.caelum.livraria.cliente;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.livraria.ejb.Carrinho;
import br.com.caelum.livraria.modelo.Livro;



public class ClienteCarrinhoLivraria {
	public static void main(String[] args) throws NamingException {
		InitialContext ic = new InitialContext();
		
		Carrinho carrinho = (Carrinho)ic.lookup("ejb:/livraria/CarrinhoBean!br.com.caelum.livraria.ejb.Carrinho?stateful");
	
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
		
		carrinho.finalizaCompra();
	}

}
