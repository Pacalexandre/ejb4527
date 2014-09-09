package br.com.caelum.livraria.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateful;

import br.com.caelum.livraria.modelo.Livro;

@Stateful
@Remote(Carrinho.class)
public class CarrinhoBean {

	private List<Livro> livros = new ArrayList<Livro>();
	private double total;

	public void addLivro(Livro livro) {
		System.out.println("Adicionado:" + livro.getNome());
		this.livros.add(livro);
		this.total += livro.getPreco();
	}

	public List<Livro> getLivros() {
		System.out.println("Lista de Livros");
		return this.livros;

	}

	public double getTotal() {
		System.out.println("Total:" + total);
		return this.total;
	}

	public void finalizaCompra() {
		System.out.println("Finalizando compra:");
		for (Livro livro : this.livros) {
			System.out.println("Livro " + livro.getNome() + "R$"
					+ livro.getPreco());
		}
	}

}
