package xadrez;

import tabuleiro.Posicao;

public class PosicaoXadrez {
	
	private char coluna;
	private int linha;
	
	public PosicaoXadrez(char coluna, int linha) {
		
		if(coluna < 'A' || coluna >'H' || linha <1 || linha > 8) {
			throw new XadrezException("Erro ao instanciar a posição no xadrez.Os valores válidos são A1 ao H8");
		}
		
		this.coluna = coluna;
		this.linha = linha;
	}

	public char getColuna() {
		return coluna;
	}

	public int getLinha() {
		return linha;
	}
	
	protected Posicao paraPosicao() {
		return new Posicao(8 - linha, coluna - 'A');
		
	}
	
	protected static PosicaoXadrez paraPosicaoXadrez(Posicao posicao) {
		return new PosicaoXadrez ((char)('A' - posicao.getColuna()), 8 -posicao.getLinha() );
	}

	@Override
	public String toString() {
		return "" + coluna + linha;
	}

	
	
	
	
	
	
	

}
