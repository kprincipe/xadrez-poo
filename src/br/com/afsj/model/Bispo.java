package br.com.afsj.model;

import br.com.afsj.control.Xadrez;

public class Bispo extends Peca {

    @Override
    public boolean movimentoOK(int x, int y) {

        if (posX == -1 && posY == -1)
            return true;

        int dx = x - posX;
        int dy = y - posY;

        // Só pode mover na diagonal
        if (Math.abs(dx) != Math.abs(dy))
            return false;

        int passoX = dx > 0 ? 1 : -1;
        int passoY = dy > 0 ? 1 : -1;

        int atualX = posX + passoX;
        int atualY = posY + passoY;

        // Verifica se existe alguma peça bloqueando o caminho
        while (atualX != x && atualY != y) {

            if (Tabuleiro.listaBrancas.pecaPosicao(atualX, atualY) != null)
                return false;

            if (Tabuleiro.listaPretas.pecaPosicao(atualX, atualY) != null)
                return false;

            atualX += passoX;
            atualY += passoY;
        }

        // Impede parar em cima de peça da mesma cor
        if (cor == Xadrez.corBRANCA) {
            if (Tabuleiro.listaBrancas.pecaPosicao(x, y) != null)
                return false;
        } else {
            if (Tabuleiro.listaPretas.pecaPosicao(x, y) != null)
                return false;
        }

        return true;
    }
}