package br.com.caelum.loja.session;

import java.io.StringWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.ejb.EJBException;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import br.com.caelum.loja.entity.Livro;
import br.com.caelum.loja.util.Livros;

@Stateless
@Local(Mensageiro.class)
public class MensageiroBean implements Mensageiro {
	
	@Resource(mappedName="java:/ConnectionFactory")
	private ConnectionFactory fabrica;
	
	@Resource(mappedName="java:/queue/loja")
	private Destination destination;

	
	public void enviaMensagem(List<Livro> livros) {
		
		try {
			Connection conexao = this.fabrica.createConnection("jms","caelum");
			Session sessao = conexao.createSession(false, Session.AUTO_ACKNOWLEDGE);
			Livros wrapper = new Livros();
			wrapper.adicionaLivros(livros);
			
			Marshaller marsh = JAXBContext.newInstance(Livros.class).createMarshaller();
			StringWriter sw = new StringWriter();
			marsh.marshal(wrapper, sw);
			
			TextMessage textmes = sessao.createTextMessage(sw.toString());
			
			MessageProducer produtor = sessao.createProducer(this.destination);
			produtor.send(textmes);
			
			produtor.close();
			conexao.close();
			
		} catch (JMSException e) {
			throw new EJBException(e);
		} catch (JAXBException e) {
			throw new EJBException(e);
		}
		
		System.out.println("Mensagem: " + livros.toString());
	}
	
	

}
