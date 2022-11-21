package com.senior.avaliacao.qs4;

/**
 * 
 * @author Pablo Mafessoli (mafessolip@gmail.com)
 *
 */

public class Conversor implements IConversor {

	public static void main(String[] args) {
		Conversor c = new Conversor();
		c.converteBase5(40);

	}

	@Override
	public String converteBase5(int decimal) {
		int valorInicial = decimal;
		int divisao;
		int mod;
		String resultado = "";

		while (decimal > 0) {
			mod = decimal % 5;
			divisao = decimal / 5;
			decimal = divisao;
			resultado += Integer.toString(mod);

		}
		String s = resultado;
		String invertida = new StringBuilder(s).reverse().toString();
		System.out.println("Valor decimal: " + valorInicial +"\nValor convertido para base 5: " + invertida);
		return invertida;

	}
}
