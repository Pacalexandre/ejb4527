package br.com.caelum.loja.session;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import br.com.caelum.loja.entity.Autor;
import br.com.caelum.loja.entity.Livro;

@Stateless
@Remote(GerenciadorLoja.class)
public class GerenciadorLojaBean implements GerenciadorLoja {

	@PersistenceContext
	private EntityManager em;
	
	private Map<String, Livro> repositorio;
	
	public GerenciadorLojaBean() {
		this.repositorio = new HashMap<String, Livro>();
		
		Livro l1 = new Livro();
		l1.setNome("Ahhh mais um ");
		l1.setPreco(50.0);
		Livro l2 = new Livro();
		l2.setNome("Ahhh mais um ");
		l2.setPreco(50.0);
		Livro l3 = new Livro();
		l3.setNome("Ahhh mais um ");
		l3.setPreco(50.0);
		Livro l4 = new Livro();
		l4.setNome("Ahhh mais um ");
		l4.setPreco(50.0);
		
		this.repositorio.put("11111", l1);
		this.repositorio.put("22222", l2);
		this.repositorio.put("44444", l3);
		this.repositorio.put("33333", l4);
	}
	@Override
	public Livro procura(String isbn) {
		return this.repositorio.get(isbn);
	}
	@Override
	public Livro salva(Livro livro) {
		this.em.persist(livro);
		System.out.println("Salva livro:" + livro.getId());
		return livro;
	}
	@Override
	public Autor salvaAutor(Autor autor) {
		this.em.persist(autor);
		return autor;
	}

	public Livro procuraLivro(long id) {
		System.out.println(id);
		String jpql = "select l from Livro l join fetch l.autores where l.id = :id ";
		try{
		return (Livro) em.createQuery(jpql).setParameter("id", id).getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}
	
	@Override
	public List<Livro> listaLivros() {
		System.out.println("-----------------REST--------------------");
		String jpql = "select distinct(l) from Livro as l join fetch l.autores";
		return this.em.createQuery(jpql).getResultList();
	}
	

	@Override
	public void deleta(long id) {
		Livro livro = em.find(Livro.class, id);
		em.remove(livro);
		System.out.println("Livro Deletado" + id);
		
	}
	
}
