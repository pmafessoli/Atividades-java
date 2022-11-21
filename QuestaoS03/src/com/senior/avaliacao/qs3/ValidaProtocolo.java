package com.senior.avaliacao.qs3;

/**
 * 
 * @author Pablo Mafessoli (mafessolip@gmail.com)
 *
 */

public class ValidaProtocolo implements IValidaProtocolo {

	public static void main(String[] args) {
		ValidaProtocolo v = new ValidaProtocolo();
		v.validaProtocolo("040 674 01");
	}

	@Override
	public boolean validaProtocolo(String protocolo) {
		String imrpimeProtocolo = protocolo;
		protocolo = protocolo.replaceAll("[\\D]", "");
		protocolo.trim();
		int tamanhoProtoco = protocolo.length();
		String digitoProtocolo = protocolo.substring(6);
		String digitoVeificado = "";
		if (tamanhoProtoco < 6 || tamanhoProtoco > 8) {
			throw new IllegalArgumentException("O protocolo " + imrpimeProtocolo + " n�o possui um tamanho correto!");
		}
		int multiplicador = 2;
		int primeiroDigito = 0;
		int multplicacaoPrimeiroDigito = 0;
		int segundoDigito = 0;
		for (int i = protocolo.length() - 3; i >= 0; i--) {

			primeiroDigito = (Character.getNumericValue(protocolo.charAt(i)) * multiplicador);
			multiplicador++;
			multplicacaoPrimeiroDigito += primeiroDigito * 10;
			primeiroDigito = multplicacaoPrimeiroDigito % 11;
		}

		int multiplicadorSegundoDigito = 2;
		int multplicacaoSegundoDigito = 0;
		protocolo = protocolo.substring(0, 6);
		protocolo = "" + protocolo + primeiroDigito;
		for (int y = protocolo.length() - 1; y >= 0; y--) {

			segundoDigito = (Character.getNumericValue(protocolo.charAt(y)) * multiplicadorSegundoDigito);
			multiplicadorSegundoDigito++;
			multplicacaoSegundoDigito += segundoDigito * 10;

			segundoDigito = multplicacaoSegundoDigito % 11;

		}
		
		digitoVeificado = "" + primeiroDigito + segundoDigito;
		if (digitoVeificado.equals(digitoProtocolo)) {
			System.out.println("O protocolo " + imrpimeProtocolo + " � valido!");
			return true;
		} else {
			throw new IllegalArgumentException("Os digitos do protocolo " + imrpimeProtocolo + " s�o inv�lidos.");
		}
	}

}
