package br.com.appgame.service;

import java.util.ArrayList;
import java.util.List;

import br.com.appgame.model.Game;

public class ManagerGame {
	private List <Game> listGame;

	public ManagerGame() {
		this.listGame = new ArrayList<>();
	}

	public void adicionarGame(Game GameNovo) {
		listGame.add(GameNovo);
	}

	public void listarGame() {

		if(listGame.isEmpty()) {
			System.out.println("Não há elementos");
		}

		for(int index = 0; index < listGame.size(); index++) {
			Game Game = listGame.get(index);
			Game.imprimir(index);
		}
	}

	public void removerGame(int index) {
		if(index >= 0 && index < listGame.size()) {
			listGame.remove(index);		
			System.out.println("Remoção realizada com sucesso");
		}

		else {
			System.out.println("Índice inexistente");
		}
	}

}
