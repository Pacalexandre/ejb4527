package br.com.caelum.loja.client.exemplo;

import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.caelum.loja.entity.Autor;
import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.GerenciadorLoja;

public class ClienteGerenciador {

	public static void main(String[] args) throws NamingException {
		InitialContext ic  = new InitialContext();
		
		GerenciadorLoja gerenciador = (GerenciadorLoja)ic.lookup("ejb:fj31-loja-ear/" +
				"fj31-loja-ejb3/GerenciadorLojaBean!br.com.caelum.loja.session.GerenciadorLoja");
		
		Autor autor = new Autor();
		Livro livro = new Livro();
		livro.setNome("Eleicoes do Malandro");
		livro.setPreco(140.45);
		
		autor.setNome("Renato Russo");
		autor = gerenciador.salvaAutor(autor);
		livro.getAutores().add(autor);
		
		gerenciador.salva(livro);
		System.out.println("FOI ...");
	}

}
