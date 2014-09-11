package br.com.caelum.loja.session;
import javax.ejb.EJB;
import javax.ejb.Remote;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import br.com.caelum.loja.entity.Livro;

@Singleton
@Remote(Agendador.class)
@Startup
public class AgendadorBean implements Agendador{
	
	@EJB 
	private Carrinho carrinho;

	@Schedule(hour="*", minute="*/10",second="0" , persistent=false)
	public void agenda() {
		System.out.println("Agendando o Agendador");
		
		//Livro l1 = new Livro();
		//l1.setNome("Fausto");
		//l1.setPreco(150);
		//this.carrinho.addLivro(l1);
		//System.out.println("Total: " + carrinho.getTotal());
		//this.carrinho.finalizaCompra();
		

	}
	

}
