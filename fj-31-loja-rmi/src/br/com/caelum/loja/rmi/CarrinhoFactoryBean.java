package br.com.caelum.loja.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CarrinhoFactoryBean extends UnicastRemoteObject implements CarrinhoFactory {

	protected CarrinhoFactoryBean() throws RemoteException {
		super();
	}

	public Carrinho create() throws RemoteException {
		CarrinhoBean carrinho = new CarrinhoBean();
		return carrinho;
	}
}
