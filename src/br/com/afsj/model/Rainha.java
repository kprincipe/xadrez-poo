package br.com.afsj.model;

public class Rainha extends Peca {
	@Override
	public boolean movimentoOK(int x, int y) {
	
		// se peça não estiver no tabuleiro, pode ser movida para qualquer posição
		if (posX == -1 && posY == -1) {
			return true;
		}
		
		if (y == posY || x == posX) {
			return true;
		}
		
		// movimentos na diagonal ↖️↙️↘️↗️
		for (int i = 0; i < 8; i++) {
			// diagonal esquerda superior ↖ 
			if (x == posX-i &&  y == posY-i) {
				return true;
			}
			
			// diagonal direita inferior ↘
			if (x == posX+i && y == posY+i) {
				return true;
			}
			
			// diagona direita superior ️↗️
			if (x == posX+i && y == posY-i) {
				return true;	
			} 
			
			// diagonal esquerda inferior ↙️
			if (x == posX-i && y == posY+i) {
				return true;	
			} 
				
		}
		
		return false;
	}
	
	@Override
	public boolean capturar(int x, int y) {
		if (y == posY || x == posX) {
			return true;
		}
		
		// movimentos na diagonal ↖️↙️↘️↗️
		for (int i = 0; i <= 7	; i++) {
			// diagonal esquerda superior ↖ 
			if (x == posX-i &&  y == posY-i) {
				return true;
			}
					
			// diagonal direita inferior ↘
			if (x == posX+i && y == posY+i) {
				return true;
			}
					
			// diagona direita superior ️↗️
			if (x == posX+i && y == posY-i) {
				return true;	
			} 
					
			// diagonal esquerda inferior ↙️
			if (x == posX-i && y == posY+i) {
				return true;	
			} 
						
		}
		
		return false;
	}
}
