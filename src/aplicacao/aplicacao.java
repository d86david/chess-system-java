package aplicacao;

import tabuleiro.Posicao;

public class aplicacao {

	public static void main(String[] args) {
		
		Posicao pos = new Posicao();
		pos.setColuna(3);
		pos.setLinha(3);
		
		System.out.println(pos);

	}

}
