package br.com.appgame;

import java.util.Scanner;

import br.com.appgame.model.Game;
import br.com.appgame.service.ManagerGame;

public class AppGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ManagerGame manager = new ManagerGame();
		
		int escolha;
		
		do {
			mostrarMenu();
			System.out.println("Escolha uma das opções acima");
			escolha = input.nextInt();
			input.nextLine();
			
			
			switch(escolha) {
			
			case 1:
				
				Game GameNovo = new Game();
				GameNovo.preencher(input);
				manager.adicionarGame(GameNovo);
				break;
				
			case 2:
				manager.listarGame();
				break;
				
			case 3:
				
				System.out.println("Digite o indice que deseja remover");
				int index = input.nextInt();
				manager.removerGame(index);
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
		System.out.println("1 - Adicionar jogo de video game");
		System.out.println("2 - Listar jogos de video game");
		System.out.println("3 - Remover jogo de video game");
		System.out.println("4 - Sair");
	}

}
