package br.com.apptv;

import java.util.Scanner;

import br.com.apptv.model.Tv;
import br.com.apptv.service.GerenciadorTv;

public class AppTv {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		GerenciadorTv gerenciador = new GerenciadorTv();
		
		int escolha;
		
		do {
			mostrarMenu();
			escolha = escolhaMenu(input, "Escolha uma opção");
			
			switch(escolha) {
			
			case 1:
				Tv novaTv = new Tv();
				novaTv.preencher(input);
				gerenciador.adicionar(novaTv);
				break;
				
			case 2:
				gerenciador.listar();
				break;
			
			case 3:
				int index = escolhaMenu(input, "Digite o índice da televisão para ser removido: ");
				gerenciador.remover(index);
				break;
				
			case 0:
				System.out.println("Atividades encerradas");
				return;
				
			default:
				System.out.println("Opção inexistente");
			}
		}while(escolha != 0);
	}
	
	
	private static void mostrarMenu() {
		System.out.println("\nMENU:");
		System.out.println("1 - Adicionar televisão");
		System.out.println("2 - Listar televisões;");
		System.out.println("3 - Remover televisão");
		System.out.println("0 - Sair");
	}
	
	private static int escolhaMenu(Scanner input, String mensagem) {
		System.out.println(mensagem);
		int valor = input.nextInt();
		input.nextLine();
		return valor;
	}
}
