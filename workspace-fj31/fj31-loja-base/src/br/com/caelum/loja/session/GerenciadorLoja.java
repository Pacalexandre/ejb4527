package br.com.caelum.loja.session;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.caelum.loja.entity.Autor;
import br.com.caelum.loja.entity.Livro;


@Path("/loja")
public interface GerenciadorLoja {

	Livro procura(String isbn);

	Livro salva(Livro livro);
	
	Autor salvaAutor(Autor autor);
	
	Livro procuraLivro(long id);
	
	List<Livro> listaLivros();
	
	void deleta(long id);
	
	@GET
	@Path("/livros/autor/{nome}")
	@Produces(MediaType.APPLICATION_JSON)
	List<Livro> buscaLivrosPeloAutor(@PathParam("nome") String nome);

}
