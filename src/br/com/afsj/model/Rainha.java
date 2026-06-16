package br.com.afsj.model;

public class Rainha extends Peca {
	@Override
	public boolean movimentoOK(int x, int y) {
		// TODO: implementar movimento da rainha
		return false;
	}
	
	@Override
	public boolean capturar(int x, int y) {
		// TODO: implementar quando rainha pode capturar pecas
		return false;
	}
}
