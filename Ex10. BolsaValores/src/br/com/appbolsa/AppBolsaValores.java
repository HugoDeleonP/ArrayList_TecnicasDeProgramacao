package br.com.appbolsa;

import java.util.Scanner;

import br.com.appbolsa.model.BolsaValores;
import br.com.appbolsa.service.ManagerBolsaValores;

public class AppBolsaValores {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ManagerBolsaValores manager = new ManagerBolsaValores();
		
		int escolha;
		
		do {
			mostrarMenu();
			System.out.println("Escolha uma das opções acima");
			escolha = input.nextInt();
			input.nextLine();
			
			
			switch(escolha) {
			
			case 1:
				
				BolsaValores BolsaValoresNovo = new BolsaValores();
				BolsaValoresNovo.preencher(input);
				manager.adicionarBolsaValores(BolsaValoresNovo);
				break;
				
			case 2:
				manager.listarBolsaValores();
				break;
				
			case 3:
				
				System.out.println("Digite o indice que deseja remover");
				int index = input.nextInt();
				manager.removerBolsaValores(index);
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
		System.out.println("1 - Adicionar bolsa de valores");
		System.out.println("2 - Listar bolsa de valores");
		System.out.println("3 - Remover bolsa de valores");
		System.out.println("4 - Sair");
	}
}
