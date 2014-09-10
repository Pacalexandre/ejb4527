package br.com.caelum.loja.session;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.com.caelum.loja.entity.Livro;

@Stateless
@Remote(GerenciadorLoja.class)
public class GerenciadorLojaBean implements GerenciadorLoja {

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
	
}
