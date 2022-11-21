package com.senior.avaliacao.qs10;

/**
 * 
 * @author Pablo Mafessoli (mafessolip@gmail.com)
 *
 */

public class JogoVelha implements IJogoVelha {
	public static void main(String[] args) {
		JogoVelha j = new JogoVelha();
	}

	@Override
	public char verificaGanhador(char[][] tabuleiro) throws Exception {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if ((tabuleiro[i][j] != 'X') && (tabuleiro[i][j] != 'O') && (tabuleiro[i][j] != '_')) {
					throw new Exception("Erro");
				}
			}
		}

		boolean vencedor = false;
		char jogadorVencedor = '_';

		if ((tabuleiro[0][0] == 'X') && (tabuleiro[0][1] == 'X') && (tabuleiro[0][2] == 'X')) {
			if (vencedor) {
				throw new Exception("Erro");
			}
			vencedor = true;
			jogadorVencedor = 'X';
		}
		if ((tabuleiro[1][0] == 'X') && (tabuleiro[1][1] == 'X') && (tabuleiro[1][2] == 'X')) {
			if (vencedor) {
				throw new Exception("Erro");
			}
			vencedor = true;
			jogadorVencedor = 'X';
		}
		if ((tabuleiro[2][0] == 'X') && (tabuleiro[2][1] == 'X') && (tabuleiro[2][2] == 'X')) {
			if (vencedor) {
				throw new Exception("Erro");
			}
			vencedor = true;
			jogadorVencedor = 'X';
		}

		if ((tabuleiro[0][0] == 'O') && (tabuleiro[0][1] == 'O') && (tabuleiro[0][2] == 'O')) {
			if (vencedor) {
				throw new Exception("Erro");
			}
			vencedor = true;
			jogadorVencedor = 'O';
		}
		if ((tabuleiro[1][0] == 'O') && (tabuleiro[1][1] == 'O') && (tabuleiro[1][2] == 'O')) {
			if (vencedor) {
				throw new Exception("Erro");
			}
			vencedor = true;
			jogadorVencedor = 'O';
		}
		if ((tabuleiro[2][0] == 'O') && (tabuleiro[2][1] == 'O') && (tabuleiro[2][2] == 'O')) {
			if (vencedor) {
				throw new Exception("Erro");
			}
			vencedor = true;
			jogadorVencedor = 'O';
		}

		if ((tabuleiro[0][0] == 'X') && (tabuleiro[1][0] == 'X') && (tabuleiro[2][0] == 'X')) {
			if (vencedor) {
				throw new Exception("Erro");
			}
			vencedor = true;
			jogadorVencedor = 'X';
		}
		if ((tabuleiro[0][1] == 'X') && (tabuleiro[1][1] == 'X') && (tabuleiro[1][1] == 'X')) {
			if (vencedor) {
				throw new Exception("Erro");
			}
			vencedor = true;
			jogadorVencedor = 'X';
		}
		if ((tabuleiro[0][2] == 'X') && (tabuleiro[1][2] == 'X') && (tabuleiro[2][2] == 'X')) {
			if (vencedor) {
				throw new Exception("Erro");
			}
			vencedor = true;
			jogadorVencedor = 'X';
		}

		if ((tabuleiro[0][0] == 'O') && (tabuleiro[1][0] == 'O') && (tabuleiro[2][0] == 'O')) {
			if (vencedor) {
				throw new Exception("Erro");
			}
			vencedor = true;
			jogadorVencedor = 'O';
		}
		if ((tabuleiro[0][1] == 'O') && (tabuleiro[1][1] == 'O') && (tabuleiro[1][1] == 'O')) {
			if (vencedor) {
				throw new Exception("Erro");
			}
			vencedor = true;
			jogadorVencedor = 'O';
		}
		if ((tabuleiro[0][2] == 'O') && (tabuleiro[1][2] == 'O') && (tabuleiro[2][2] == 'O')) {
			if (vencedor) {
				throw new Exception("Erro");
			}
			vencedor = true;
			jogadorVencedor = 'O';
		}

		if ((tabuleiro[0][0] == 'X') && (tabuleiro[1][1] == 'X') && (tabuleiro[2][2] == 'X')) {
			if (vencedor) {
				throw new Exception("Erro");
			}
			vencedor = true;
			jogadorVencedor = 'X';
		}
		if ((tabuleiro[0][2] == 'X') && (tabuleiro[1][1] == 'X') && (tabuleiro[2][0] == 'X')) {
			if (vencedor) {
				throw new Exception("Erro");
			}
			vencedor = true;
			jogadorVencedor = 'X';
		}

		if ((tabuleiro[0][0] == 'O') && (tabuleiro[1][1] == 'O') && (tabuleiro[2][2] == 'O')) {
			if (vencedor) {
				throw new Exception("Erro");
			}
			vencedor = true;
			jogadorVencedor = 'O';
		}
		if ((tabuleiro[0][2] == 'O') && (tabuleiro[1][1] == 'O') && (tabuleiro[2][0] == 'O')) {
			if (vencedor) {
				throw new Exception("Erro");
			}
			vencedor = true;
			jogadorVencedor = 'O';
		}

		return jogadorVencedor;

	}
}
