package br.com.caelum.loja.session;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.ws.ConsultaDeLivros;

@Stateless
@WebService
@Remote(ConsultaDeLivros.class)
public class ConsultaLivrosBean implements ConsultaDeLivros {
	@PersistenceContext
	private EntityManager em;

	@Override
	@WebMethod
	public List<Livro> buscaLivro(String nome) {
		Query q = em.createQuery("select l from Livro l left join fetch l.autores where l.nome like :nome");
		q.setParameter("nome", "%"+nome+"%");
		return q.getResultList();
	}
	
	

}
