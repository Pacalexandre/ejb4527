package br.com.caelum.cliente.programa;

import br.com.caelum.cliente.CalculadoraDeParcela;
import br.com.caelum.cliente.CalculadoraDeParcelaService;

public class Programa {

	public static void main(String[] args) {
		CalculadoraDeParcela calculador = new CalculadoraDeParcelaService().getCalculadoraDeParcelaPort();
		System.out.println(calculador.calculaParcela(300, 4));
	}

}
