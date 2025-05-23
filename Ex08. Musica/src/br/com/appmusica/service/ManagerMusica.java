package br.com.appmusica.service;

import java.util.ArrayList;
import java.util.List;

import br.com.appmusica.model.Musica;

public class ManagerMusica {
	private List <Musica> listMusica;

	public ManagerMusica() {
		this.listMusica = new ArrayList<>();
	}

	public void adicionarMusica(Musica MusicaNovo) {
		listMusica.add(MusicaNovo);
	}

	public void listarMusica() {

		if(listMusica.isEmpty()) {
			System.out.println("Não há elementos");
		}

		for(int index = 0; index < listMusica.size(); index++) {
			Musica Musica = listMusica.get(index);
			Musica.imprimir(index);
		}
	}

	public void removerMusica(int index) {
		if(index >= 0 && index < listMusica.size()) {
			listMusica.remove(index);		
			System.out.println("Remoção realizada com sucesso");
		}

		else {
			System.out.println("Índice inexistente");
		}
	}
}
