package br.com.appaluno;

import java.util.Scanner;

import br.com.appaluno.model.Aluno;
import br.com.appaluno.service.GerenciadorAluno;

public class appAluno {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		GerenciadorAluno gerenciador = new GerenciadorAluno();
		
		int escolha;
		
		do {
			mostrarMenu();
			escolha = escolhaMenu(input, "Escolha uma das opções acima. \n");
			
			switch(escolha) {
			
			case 1:
				Aluno alunoNovo = new Aluno();
				alunoNovo.preencher(input);
				gerenciador.adicionarAluno(alunoNovo);
				break;
				
			case 2:
				gerenciador.listarAluno();
				break;
				
			case 3:
				
				System.out.println("Digite o índice que deseja remover");
				int index =input.nextInt();
				input.nextLine();
				
				gerenciador.removerAluno(index);
				break;
				
			case 4:
				System.out.println("Atividades encerradas");
				break;
				
			default:
				System.out.println("Escolha inválida");
				break;
			}
			
		}while(escolha != 4);
	}
	
	public static void mostrarMenu() {
		System.out.println("1 - Adicionar aluno");
		System.out.println("2 - Listar alunos");
		System.out.println("3 - Remover aluno");
		System.out.println("4 - Sair");
	}
	
	public static int escolhaMenu(Scanner input, String instrucao) {
		System.out.println(instrucao);
		int valor = input.nextInt();
		input.nextLine();
		return valor;
	}
}
