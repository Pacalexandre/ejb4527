package br.com.caelum.loja.session;

import java.util.List;

import br.com.caelum.loja.entity.Autor;
import br.com.caelum.loja.entity.Livro;

public interface GerenciadorLoja {

	Livro procura(String isbn);

	Livro salva(Livro livro);
	
	Autor salvaAutor(Autor autor);
	
	Livro procuraLivro(long id);
	
	List<Livro> listaLivros();
	
	void deleta(long id);

}
