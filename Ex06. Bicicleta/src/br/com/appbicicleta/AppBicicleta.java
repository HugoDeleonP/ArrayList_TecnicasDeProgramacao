package br.com.appbicicleta;

import br.com.appbicicleta.model.Bicicleta;
import br.com.appbicicleta.service.ManagerBicicleta;

import java.util.Scanner;

public class AppBicicleta {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ManagerBicicleta manager = new ManagerBicicleta();
		int opcao;

		do {
			mostrarMenu();

			System.out.println("Escolha uma das opções acima.");
			opcao = input.nextInt();
			input.nextLine();
			switch (opcao) {
			case 1:
				Bicicleta BicicletaNovo = new Bicicleta();
				BicicletaNovo.preencher(input);
				manager.adicionarBicicleta(BicicletaNovo);
				break;
			
			case 2:
				manager.listarBicicleta();
				break;
				
			case 3:
				System.out.println("Digite o indice do slot que deseja remover");
				int index= input.nextInt();
				manager.removerBicicleta(index);
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
		System.out.println("1 - Adicionar Bicicleta");
		System.out.println("2 - Listar animais");
		System.out.println("3 - Remover Bicicleta");
		System.out.println("4 - Sair");
	}

}
