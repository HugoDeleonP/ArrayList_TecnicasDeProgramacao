package br.com.apptv.service;

import java.util.ArrayList;
import java.util.List;

import br.com.apptv.model.Tv;

public class GerenciadorTv {
	private List<Tv> list;
	
	public GerenciadorTv() {
		this.list = new ArrayList<Tv>();
	}
	
	public void adicionar(Tv televisao) {
		list.add(televisao);
	}
	
	public void listar() {
		if (list.isEmpty()) {
			
			System.out.println("Ausência de itens");
			return;
		}
		
		for(int index = 0; index < list.size(); index ++) {
			Tv tv = list.get(index);
			tv.imprimir(index);
		}
	}
	
	public void remover(int index) {
		
		if(index >= 0 && index < list.size()) {
			list.remove(index);
			System.out.println("Remoção realizada com sucesso.");
		} 
		else {
			System.out.println("Índice inexistente");
		}
	}
	
}
