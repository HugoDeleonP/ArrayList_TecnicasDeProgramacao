package br.com.appcasa.service;

import br.com.appcasa.model.Casa;

import java.util.List;
import java.util.ArrayList;

public class GerenciadorCasa {
	private List <Casa> list; 
	
	public GerenciadorCasa() {
		this.list = new ArrayList<Casa>();
	}
	
	public void adicionarCasa(Casa casa) {
		list.add(casa);
	}
	
	public void listarCasa() {
		if(list.isEmpty()) {
			System.out.println("Ausência de elementos");
		}
		
		for(int index = 0; index < list.size(); index++) {
			Casa casa = list.get(index);
			casa.imprimir(index);
		}
	}
	
	public void removerCasa(int index) {
		
		if(index >= 0 && index < list.size()) {
			list.remove(index);
			System.out.println("Remoção realizada com sucesso");
		} else {
			System.out.println("Índice não encontrado");
		}
	}
}
