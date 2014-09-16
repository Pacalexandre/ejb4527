package br.com.caelum.loja.message;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJBException;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(activationConfig = {
		@ActivationConfigProperty(
				propertyName="destinationType",
				propertyValue="javax.jms.Queue"),
		@ActivationConfigProperty(
				propertyName="destination",
				propertyValue="queue/loja")})
public class Financeiro implements MessageListener{

	@Override
	public void onMessage(Message message) {
		String text;
		try {
			text = ((TextMessage)message).getText();
			System.out.println("Financeiro Processo "+ text);
		} catch (JMSException e) {
			throw new EJBException(e);
		}
		
	}

}
