package br.com.appanimal;

import br.com.appanimal.model.AnimalEstimacao;
import br.com.appanimal.service.ManagerAnimal;

import java.util.Scanner;

public class AppAnimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ManagerAnimal manager = new ManagerAnimal();
		int opcao;

		do {
			mostrarMenu();

			System.out.println("Escolha uma das opções acima.");
			opcao = input.nextInt();
			input.nextLine();
			switch (opcao) {
			case 1:
				AnimalEstimacao animalNovo = new AnimalEstimacao();
				animalNovo.preencher(input);
				manager.adicionarAnimal(animalNovo);
				break;
			
			case 2:
				manager.listarAnimal();
				break;
				
			case 3:
				System.out.println("Digite o indice do slot que deseja remover");
				int index= input.nextInt();
				manager.removerAnimal(index);
				break;
				
			case 4:
				System.out.println("Atividades encerradas");
				break;
				
			default:
				System.out.println("Dígito inválido");
				break;
			}
		} while (opcao != 4);
	}

	private static void mostrarMenu() {
		System.out.println("1 - Adicionar animal");
		System.out.println("2 - Listar animais");
		System.out.println("3 - Remover animal");
		System.out.println("4 - Sair");
	}

}
