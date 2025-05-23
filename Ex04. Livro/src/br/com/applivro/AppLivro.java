package br.com.applivro;

import java.util.Scanner;

import br.com.applivro.model.Livro;
import br.com.applivro.service.ManagerLivro;

public class AppLivro {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ManagerLivro manager = new ManagerLivro();
		
		int escolha;
		
		do {
			mostrarMenu();
			System.out.println("Escolha uma das opções acima");
			escolha = input.nextInt();
			input.nextLine();
			
			
			switch(escolha) {
			
			case 1:
				
				Livro livroNovo = new Livro();
				livroNovo.preencher(input);
				manager.adicionarLivro(livroNovo);
				break;
				
			case 2:
				manager.listarLivro();
				break;
				
			case 3:
				
				System.out.println("Digite o indice que deseja remover");
				int index = input.nextInt();
				manager.removerLivro(index);
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
		System.out.println("1 - Adicionar livro");
		System.out.println("2 - Listar livros");
		System.out.println("3 - Remover livro");
		System.out.println("4 - Sair");
	}
}
