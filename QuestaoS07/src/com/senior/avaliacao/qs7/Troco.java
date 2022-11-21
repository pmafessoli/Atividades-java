package com.senior.avaliacao.qs7;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author Pablo Mafessoli (mafessolip@gmail.com)
 *
 */


class Troco implements IMaquina {
	public static void main(String[] args) {
		Troco t = new Troco();
	}

	public Troco() {

	}

	private ECedula tipo;
	private int quantidade;

	public void adicionaQuantidade(int qtde) {
		quantidade += qtde;
	}

	public Troco(ECedula tipo, int quantidade) {
		super();
		this.tipo = tipo;
		this.quantidade = quantidade;
	}

	public ECedula getTipo() {
		return tipo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	@Override
	public List<Troco> montarTroco(double troco) {
		List<Troco> result = new LinkedList<>();

		return result;
	}

}
