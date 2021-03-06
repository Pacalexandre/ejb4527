package br.com.caelum.loja.client.exemplo;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class ClienteRestEjbAutor {

	public static void main(String[] args) throws ClientProtocolException,
			IOException {
		HttpClient htcli = new DefaultHttpClient();

		HttpGet get = new HttpGet(
				"http://localhost:8080/fj31-loja-rest/loja/livros/autor/Alexandre");
		get.addHeader("accept", "application/json");

		HttpResponse response = htcli.execute(get);
		InputStream content = response.getEntity().getContent();
		System.out.println(response.getStatusLine());
		Scanner scanner = new Scanner(content);
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		content.close();
	}

}
