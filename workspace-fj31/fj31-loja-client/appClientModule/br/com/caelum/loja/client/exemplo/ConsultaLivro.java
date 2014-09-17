package br.com.caelum.loja.client.exemplo;

import java.util.List;

import br.com.caelum.loja.ws.ConsultaLivrosBean;
import br.com.caelum.loja.ws.ConsultaLivrosBeanService;
import br.com.caelum.loja.ws.Livro;

public class ConsultaLivro {

	public static void main(String[] args) {
		ConsultaLivrosBean service = new ConsultaLivrosBeanService().getConsultaLivrosBeanPort();
		List<Livro> livros = service.buscaLivro("Paul");
		for (Livro l : livros) {
			System.out.println(l.getNome());
		}
		
	}

}
