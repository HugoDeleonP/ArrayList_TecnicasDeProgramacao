package br.com.appfilme;

import java.util.Scanner;

import br.com.appfilme.model.Filme;
import br.com.appfilme.service.ManagerFilme;

public class AppFilme {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ManagerFilme manager = new ManagerFilme();
		
		int escolha;
		
		do {
			mostrarMenu();
			System.out.println("Escolha uma das opções acima");
			escolha = input.nextInt();
			input.nextLine();
			
			
			switch(escolha) {
			
			case 1:
				
				Filme FilmeNovo = new Filme();
				FilmeNovo.preencher(input);
				manager.adicionarFilme(FilmeNovo);
				break;
				
			case 2:
				manager.listarFilme();
				break;
				
			case 3:
				
				System.out.println("Digite o indice que deseja remover");
				int index = input.nextInt();
				manager.removerFilme(index);
				break;
				
			case 4:
				System.out.println("Atividades encerradas.");
				break;
				
			default:
				System.out.println("Digite um número válido");
				break;
			}
			
		}while(escolha != 4);

	}
	
	
	private static void mostrarMenu() {
		System.out.println("1 - Adicionar Filme");
		System.out.println("2 - Listar Filmes");
		System.out.println("3 - Remover Filme");
		System.out.println("4 - Sair");
	}

}
