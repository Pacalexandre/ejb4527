package br.com.caelum.livraria.ejb;

import java.util.List;

import br.com.caelum.livraria.modelo.Livro;


public interface Carrinho {
	
	void addLivro(Livro livro);
	
	List<Livro> getLivros();
	
	void finalizaCompra();
	
	double  getTotal();
	
}
