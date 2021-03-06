package br.com.caelum.rest;

import java.net.URI;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.session.GerenciadorLoja;

@Stateless
@Path("/loja")
public class LojaResource {

	@EJB
	GerenciadorLoja gerenciador;

	@GET
	@Path("/livros")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Livro> getLivrosXml() {
		List<Livro> livros = gerenciador.listaLivros();
		return livros;
	}

	@GET
	@Path("/livro/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Livro getLivro(@PathParam("id") Long id) {

		Livro livro = gerenciador.procuraLivro(id);
		if (livro == null) {
			throw new WebApplicationException(Response.Status.NOT_FOUND);
		}
		System.out.println(livro.getNome());
		return livro;
	}

	@POST
	@Path("/livro")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cadastra(Livro livro) {
		Livro salvo = gerenciador.salva(livro);
		System.out.println("Livro" + salvo.getNome());
		return Response.created(URI.create("/loja/livro/" + salvo.getId()))
				.build();
	}

	@DELETE
	@Path("/livro/{id}")
	public Response cadastra(@PathParam("id") Long id) {
		gerenciador.deleta(id);
		System.out.println(" Deleta Livro");
		return Response.ok().build();
	}

}
