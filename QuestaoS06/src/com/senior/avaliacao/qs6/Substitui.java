package com.senior.avaliacao.qs6;

public class Substitui implements ISubstitui {

	/**
	 * 
	 * @author Pablo Mafessoli (mafessolip@gmail.com)
	 *
	 */

	public static void main(String[] args) {
		Substitui s = new Substitui();
		s.substituir("O rato roeu a roupa do rei de roma", "ro", "teste");
	}

	@Override
	public String substituir(String string, String velho, String novo) {
		StringBuilder texto = new StringBuilder();

		texto.append(string);
		String recebeVelho = velho;
		String localNovo = novo;

		int tamanhoStringVelho = recebeVelho.length();
		for (int i = 0; i < texto.length() - tamanhoStringVelho; i++) {
			StringBuilder currentChunk = new StringBuilder();
			for (int x = 0; x < tamanhoStringVelho; x++) {
				currentChunk.append(texto.charAt(i + x));
			}
			if (currentChunk.toString().equals(recebeVelho)) {
				texto.delete(i, i + tamanhoStringVelho);
				texto.insert(i, localNovo);
			}

		}
		System.out.println(texto);
		return localNovo;
	}
}