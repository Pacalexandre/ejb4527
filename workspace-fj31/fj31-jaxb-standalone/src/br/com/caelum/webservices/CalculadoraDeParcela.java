package br.com.caelum.webservices;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class CalculadoraDeParcela {
	
	@WebMethod
	public double calculaParcela(double valorTotal,int quantidade){
		if (quantidade < 0){
			return 0;
		}
		double oValorTotal = valorTotal * (1 + (quantidade / 100.00));
		return oValorTotal / quantidade;
	}

}
