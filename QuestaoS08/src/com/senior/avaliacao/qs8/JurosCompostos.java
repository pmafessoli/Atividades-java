package com.senior.avaliacao.qs8;

/**
 * 
 * @author Pablo Mafessoli (mafessolip@gmail.com)
 *
 */

public class JurosCompostos implements IJurosCompostos {

	public static void main(String[] args) {
		JurosCompostos j = new JurosCompostos();
		j.calcularValorFinal(782.63, 15, 3);
	}

	@Override
	public double calcularValorFinal(double valorInicial, double juros, int parcelas) {

		double valorFinal = valorInicial * (Math.pow((1 + juros / 100), parcelas));
		System.out.printf("%.2f", valorFinal);
		return valorFinal;
	}

}