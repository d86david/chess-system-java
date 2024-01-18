package aplicacao;


import xadrez.PartidaDeXadrez;

public class aplicacao {

	public static void main(String[] args) {
		
		PartidaDeXadrez partida = new PartidaDeXadrez();
		UI.imprimeTabuleiro(partida.getPecas());

	}

}
