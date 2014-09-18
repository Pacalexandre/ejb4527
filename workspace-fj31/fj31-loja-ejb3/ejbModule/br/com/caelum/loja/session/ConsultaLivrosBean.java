package br.com.caelum.loja.session;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.sun.org.glassfish.gmbal.ParameterNames;

import br.com.caelum.loja.entity.Autor;
import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.ws.ConsultaDeLivros;

@Stateless
@WebService
@Remote(ConsultaDeLivros.class)
public class ConsultaLivrosBean implements ConsultaDeLivros {
	@PersistenceContext
	private EntityManager em;

	@Override
	@WebMethod(operationName="ConsultaPorNome")
	@WebResult(name="Livros")
	public List<Livro> buscaLivro(@WebParam(name="nome") String nome) {
		Query q = em.createQuery("select l from Livro l left join fetch l.autores where l.nome like :nome");
		q.setParameter("nome", "%"+nome+"%");
		return q.getResultList();
	}
	

	@WebMethod(operationName="ConsultaAutor")
	@WebResult(name="Autor")
	public List<Autor> buscaAutor(@WebParam(name="autor") String nome) {
		Query q = em.createQuery("from Autor where nome like :nome");
		q.setParameter("nome", "%"+nome+"%");
		return q.getResultList();
	}
	
	
	

}
