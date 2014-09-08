package br.com.caelum.loja.serializacao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class TestaEscritaDeObjetos {

	public static void main(String[] args) throws FileNotFoundException,
			IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(
				"livro.txt"));

		Livro l1 = new Livro();
		l1.setNome("Pais e Filhos");
		l1.setPreco(100.0);

		Livro l2 = new Livro();
		l2.setNome("Pais s");
		l2.setPreco(200.0);

		Livro l3 = new Livro();
		l3.setNome("Pbagulho");
		l3.setPreco(300.0);

		Livro l4 = new Livro();
		l4.setNome("Filhos");
		l4.setPreco(400.0);

		List<Livro> livros = new ArrayList<Livro>();
		livros.add(l1);
		livros.add(l2);
		livros.add(l3);
		livros.add(l4);

		oos.writeObject(livros);
		oos.close();

	}

}
