package br.com.caelum.loja.serializacao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class TestaLeituraDeObjetos {

	public static void main(String[] args) throws FileNotFoundException,
			IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
				"livro.txt"));
		List<Livro> livros = (List<Livro>) ois.readObject();

		for (Livro l : livros) {
			System.out.println(l.getNome());
			System.out.println(l.getPreco());
			System.out.println("-------------------");

		}

	}

}
