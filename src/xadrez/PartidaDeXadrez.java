package xadrez;


import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {
	
	private Tabuleiro tabuleiro;
	
	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		iniciaPartida();
	}
	
	public PecaDeXadrez[][] getPecas(){
		PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for(int i =0; i<tabuleiro.getLinhas(); i++) {
			for (int j=0; j<tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaDeXadrez)tabuleiro.peca(i, j);
			}
		}
		return mat;
	}
	
	private void iniciaPartida() {
		tabuleiro.posicionarPeca(new Torre(tabuleiro, Cor.BRANCA), new Posicao(7,0));
		tabuleiro.posicionarPeca(new Rei(tabuleiro, Cor.PRETA),new Posicao(0,4));
		tabuleiro.posicionarPeca(new Rei(tabuleiro, Cor.BRANCA), new Posicao(7,4));
	}

}
