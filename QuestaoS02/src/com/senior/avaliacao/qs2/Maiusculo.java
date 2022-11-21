package com.senior.avaliacao.qs2;

/**
 * 
 * @author Pablo Mafessoli (mafessolip@gmail.com)
 *
 */

public class Maiusculo implements IMaiusculo {
	public static void main(String[] args) {
		Maiusculo m = new Maiusculo();
		m.converteMaiusculo("testando, a string, com espaco em       branco");
	}

	@Override
	public String converteMaiusculo(String par) {

		char[] letras = par.toCharArray();
		for (int i = 0; i < letras.length; ++i) {
			if (i == 0 || !Character.isLetterOrDigit(letras[i - 1])) {
				letras[i] = Character.toUpperCase(letras[i]);
			}
		}
		System.out.println(letras);
		return new String(letras);
	}
}