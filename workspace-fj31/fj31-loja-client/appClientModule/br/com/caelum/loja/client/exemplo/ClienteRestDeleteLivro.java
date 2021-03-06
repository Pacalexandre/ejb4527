package br.com.caelum.loja.client.exemplo;

import java.io.IOException;
import java.io.InputStream;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.impl.client.DefaultHttpClient;

public class ClienteRestDeleteLivro {

	public static void main(String[] args) throws ClientProtocolException,
			IOException {
		HttpClient http = new DefaultHttpClient();

		HttpDelete delete = new HttpDelete(
				"http://localhost:8080/fj31-loja-rest/loja/livro/21");

		HttpResponse response = http.execute(delete);
		InputStream content = response.getEntity().getContent();
		System.out.println(response.getStatusLine());
		content.close();

	}

}
