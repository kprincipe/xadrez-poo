package br.com.afsj.model;

public class Torre extends Peca {
	
	@Override
	public boolean movimentoOK(int x, int y) {
		if (posX == -1 && posY == -1) {
			return true;
		}
		
		if ((x == posX && y != posY) || (x != posX && y == posY)) {
			
			if (caminhoEstaLivre(x, y)) {
				return true;
			}
		}
		
		return false;
	}

	private boolean caminhoEstaLivre(int destinoX, int destinoY) {
		int direcaoX = Integer.compare(destinoX, posX);
		int direcaoY = Integer.compare(destinoY, posY);

		int atualX = posX + direcaoX;
		int atualY = posY + direcaoY;

		while (atualX != destinoX || atualY != destinoY) {
			
			if (Tabuleiro.listaBrancas.pecaPosicao(atualX, atualY) != null || 
				Tabuleiro.listaPretas.pecaPosicao(atualX, atualY) != null) {
				return false; 
			}
			
			atualX += direcaoX;
			atualY += direcaoY;
		}

		return true;
	}
}