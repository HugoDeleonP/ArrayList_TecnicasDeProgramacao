package br.com.appmusica;

import java.util.Scanner;

import br.com.appmusica.model.Musica;
import br.com.appmusica.service.ManagerMusica;

public class AppMusica {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ManagerMusica manager = new ManagerMusica();
		
		int escolha;
		
		do {
			mostrarMenu();
			System.out.println("Escolha uma das opções acima");
			escolha = input.nextInt();
			input.nextLine();
			
			
			switch(escolha) {
			
			case 1:
				
				Musica MusicaNovo = new Musica();
				MusicaNovo.preencher(input);
				manager.adicionarMusica(MusicaNovo);
				break;
				
			case 2:
				manager.listarMusica();
				break;
				
			case 3:
				
				System.out.println("Digite o indice que deseja remover");
				int index = input.nextInt();
				manager.removerMusica(index);
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
		System.out.println("1 - Adicionar Musica");
		System.out.println("2 - Listar Musicas");
		System.out.println("3 - Remover Musica");
		System.out.println("4 - Sair");
	}

}
