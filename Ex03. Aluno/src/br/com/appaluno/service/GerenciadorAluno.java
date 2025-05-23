package br.com.appaluno.service;

import br.com.appaluno.model.Aluno;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorAluno {

	List<Aluno> listAluno;

	public GerenciadorAluno() {
		this.listAluno = new ArrayList<>();
	}

	public void adicionarAluno(Aluno aluno) {
		listAluno.add(aluno);
	}

	public void listarAluno() {

		if (listAluno.isEmpty()) {
			System.out.println("Há ausência de elementos");
		}

		for (int index = 0; index < listAluno.size(); index++) {
			Aluno aluno = listAluno.get(index);
			aluno.imprimir(index);
		}
	}

	public void removerAluno(int index) {
		if (index >= 0 && index < listAluno.size()) {
			listAluno.remove(index);
			System.out.println("Remoção realizada com sucesso!");
		} else {
			System.out.println("O índice não existe");
		}
	}
}