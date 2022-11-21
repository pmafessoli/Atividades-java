package com.senior.avaliacao.qs7;

/**
 * 
 * @author Pablo Mafessoli (mafessolip@gmail.com)
 *
 */

public enum ECedula {
	NOTA100(100), NOTA50(50), NOTA20(20), NOTA10(10), NOTA5(5), NOTA2(2), MOEDA100(1), MOEDA50(0.5), MOEDA25(0.25),
	MOEDA10(0.1), MOEDA5(0.05), MOEDA1(0.01);

	private double valor;

	ECedula(double valor) {
		this.valor = valor;
	}
	public double getValor() {	
		return valor;}
}