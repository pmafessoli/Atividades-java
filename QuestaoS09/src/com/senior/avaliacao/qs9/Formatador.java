package com.senior.avaliacao.qs9;

/**
 * 
 * @author Pablo Mafessoli (mafessolip@gmail.com)
 *
 */

public class Formatador implements IFormatador {
	public static void main(String[] args) throws Exception {
		Formatador f = new Formatador();
		f.formatar(15350);

	}

	@Override
	public String formatar(double num) throws Exception {

		String str = String.valueOf(num);
		
		int casasInt = str.indexOf('.');
		int casasDec = str.length() - casasInt - 1;

		validar(num, casasDec);
		
		if (casasDec == 1) {
			str += '0';
		}
		
		String stringFormatada = "";
		String stringRevertida = reverter(str);
		for (int i = 0; i < stringRevertida.length(); i++) {
			if (i > 3 && i % 3 == 0) {
				stringFormatada += '.';
			}
			char ch = stringRevertida.charAt(i);
			stringFormatada += ch == '.' ? ',' : ch;
		}
		return reverter(stringFormatada);
	}
	
	private void validar(double num, int casasDec) throws Exception {
		if (num < 0.0) {
			throw new Exception("Número não pode ser menor que 0");
		}
		if (num > 9999999.99) {
			throw new Exception("Número não pode ser maior que 9999999.99");
		}
		if (casasDec > 2) {
			throw new Exception("Máximo de casas decimais é 2");
		}
	} 
	
	private String reverter(String str) {
		String stringRevertida = "";
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			stringRevertida = ch + stringRevertida;
		}
		System.out.println(stringRevertida);
		return stringRevertida;
	}
}
