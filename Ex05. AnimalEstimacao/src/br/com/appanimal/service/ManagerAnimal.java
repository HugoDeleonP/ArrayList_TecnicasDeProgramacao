package br.com.appanimal.service;

import java.util.ArrayList;
import java.util.List;
import br.com.appanimal.model.AnimalEstimacao;

public class ManagerAnimal {
	
	List <AnimalEstimacao> listAnimal;
	
	public ManagerAnimal(){
		listAnimal =new ArrayList<>();
	}
	
	public void adicionarAnimal(AnimalEstimacao animalNovo) {
		listAnimal.add(animalNovo);
	}
	
	public void listarAnimal() {
		
		for(AnimalEstimacao animalIndex : listAnimal) {
			animalIndex.imprimir();
			System.out.println("**************************");
		}
	}
	
	public void removerAnimal(int index) {
		
		if(index >= 0 && index < listAnimal.size()) {
			listAnimal.remove(index);
			System.out.println("Índice removido com sucesso");
		}
		else {
			System.out.println("Índice inexistente");
		}
	}
}
