package br.com.appbolsa.service;

import java.util.ArrayList;
import java.util.List;

import br.com.appbolsa.model.BolsaValores;

public class ManagerBolsaValores {

	private List <BolsaValores> listBolsaValores;

	public ManagerBolsaValores() {
		this.listBolsaValores = new ArrayList<>();
	}

	public void adicionarBolsaValores(BolsaValores BolsaValoresNovo) {
		listBolsaValores.add(BolsaValoresNovo);
	}

	public void listarBolsaValores() {

		if(listBolsaValores.isEmpty()) {
			System.out.println("Não há elementos");
		}

		for(int index = 0; index < listBolsaValores.size(); index++) {
			BolsaValores BolsaValores = listBolsaValores.get(index);
			BolsaValores.imprimir(index);
		}
	}

	public void removerBolsaValores(int index) {
		if(index >= 0 && index < listBolsaValores.size()) {
			listBolsaValores.remove(index);		
			System.out.println("Remoção realizada com sucesso");
		}

		else {
			System.out.println("Índice inexistente");
		}
	}
}
