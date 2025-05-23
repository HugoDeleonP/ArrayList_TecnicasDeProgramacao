package br.com.appbicicleta.service;

import java.util.ArrayList;
import java.util.List;
import br.com.appbicicleta.model.Bicicleta;

public class ManagerBicicleta {
	
	List <Bicicleta> listBicicleta;
	
	public ManagerBicicleta(){
		listBicicleta =new ArrayList<>();
	}
	
	public void adicionarBicicleta(Bicicleta BicicletaNovo) {
		listBicicleta.add(BicicletaNovo);
	}
	
	public void listarBicicleta() {
		
		for(Bicicleta BicicletaIndex : listBicicleta) {
			BicicletaIndex.imprimir();
			System.out.println("**************************");
		}
	}
	
	public void removerBicicleta(int index) {
		
		if(index >= 0 && index < listBicicleta.size()) {
			listBicicleta.remove(index);
			System.out.println("Índice removido com sucesso");
		}
		else {
			System.out.println("Índice inexistente");
		}
	}
}
