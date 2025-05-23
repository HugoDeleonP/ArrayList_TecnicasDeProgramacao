package br.com.appfilme.service;

import java.util.ArrayList;
import java.util.List;

import br.com.appfilme.model.Filme;

public class ManagerFilme {
	private List <Filme> listFilme;

	public ManagerFilme() {
		this.listFilme = new ArrayList<>();
	}

	public void adicionarFilme(Filme FilmeNovo) {
		listFilme.add(FilmeNovo);
	}

	public void listarFilme() {

		if(listFilme.isEmpty()) {
			System.out.println("Não há elementos");
		}

		for(int index = 0; index < listFilme.size(); index++) {
			Filme Filme = listFilme.get(index);
			Filme.imprimir(index);
		}
	}

	public void removerFilme(int index) {
		if(index >= 0 && index < listFilme.size()) {
			listFilme.remove(index);		
			System.out.println("Remoção realizada com sucesso");
		}

		else {
			System.out.println("Índice inexistente");
		}
	}
}
