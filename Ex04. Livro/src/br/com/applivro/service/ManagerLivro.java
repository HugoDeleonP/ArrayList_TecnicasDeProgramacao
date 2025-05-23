package br.com.applivro.service;

import br.com.applivro.model.Livro;
import java.util.ArrayList;
import java.util.List;

public class ManagerLivro {

	private List <Livro> listLivro;
	
	public ManagerLivro() {
		this.listLivro = new ArrayList<>();
	}
	
	public void adicionarLivro(Livro livroNovo) {
		listLivro.add(livroNovo);
	}
	
	public void listarLivro() {
		
		if(listLivro.isEmpty()) {
			System.out.println("Não há elementos");
		}
		
		for(int index = 0; index < listLivro.size(); index++) {
			Livro livro = listLivro.get(index);
			livro.imprimir(index);
		}
	}
	
	public void removerLivro(int index) {
		if(index >= 0 && index < listLivro.size()) {
			listLivro.remove(index);		
			System.out.println("Remoção realizada com sucesso");
		}
		
		else {
			System.out.println("Índice inexistente");
		}

	}
}
