package br.com.appcasa;

import java.util.Scanner;

import br.com.appcasa.model.Casa;
import br.com.appcasa.service.GerenciadorCasa;

public class AppCasa {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		GerenciadorCasa gerenciador = new GerenciadorCasa();
		
		int escolha;
		
		do {
			mostrarMenu();
			escolha = opcaoMenu(input, "Escolha uma das seguintes opções:");
			
			switch(escolha) {
			
			case 1: 
				Casa casaAdicionada = new Casa();
				casaAdicionada.preencher(input);
				gerenciador.adicionarCasa(casaAdicionada);
				break;
				
			case 2:
				gerenciador.listarCasa();
				break;
				
			case 3:
				
				int index = opcaoMenu(input, "Escreva o índice da casa que deseja remover: ");
				gerenciador.removerCasa(index);
				break;
				
			case 4:
				System.out.println("Atividades encerradas");
				break;
				
			default:
				System.out.println("Número inválido");
				break;
			}
			
		} while(escolha != 4);
	}
	
	private static void mostrarMenu() {
		System.out.println("1 - Adicionar casa");
		System.out.println("2 - Listar casas");
		System.out.println("3 - Remover casa");
		System.out.println("4 - Sair");
	}
	
	private static int opcaoMenu(Scanner input, String instrucao) {
		System.out.println(instrucao);
		int valor = input.nextInt();
		input.nextLine();
		return valor;
	}
}
