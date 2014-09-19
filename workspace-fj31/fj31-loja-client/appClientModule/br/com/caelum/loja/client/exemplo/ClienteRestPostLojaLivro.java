package br.com.caelum.loja.client.exemplo;

import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

public class ClienteRestPostLojaLivro {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		HttpClient http = new DefaultHttpClient();
		HttpPost post = new HttpPost("http://localhost:8080/fj31-loja-rest/loja/livro");
		post.addHeader("content-type","application/json");
		
		StringEntity json = new StringEntity("{\"nome\":\"Bem vindo a copa do Mundo\"," +
				"\"preco\":1000.0," +
				"\"autores\":" +
				"[{\"nome\":\"Paulo Alexandre\"}]}" );
		post.setEntity(json);
		HttpResponse response = http.execute(post);
		System.out.println(response.getStatusLine());
		System.out.println(response.getFirstHeader("Location"));
	}
}
