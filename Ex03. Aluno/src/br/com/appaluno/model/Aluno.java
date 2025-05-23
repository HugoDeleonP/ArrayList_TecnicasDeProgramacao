package br.com.appaluno.model;

import java.util.Scanner;

public class Aluno {
	Scanner input = new Scanner(System.in);
	
	private String nome;
	private int idade;
	private String matricula;
	private int anoIngresso;
	
	public void preencher(Scanner input) {
		
		System.out.println("Digite o nome: ");
		this.nome = input.nextLine();
		
		System.out.println("Digite a idade: ");
		this.idade = input.nextInt();
		input.nextLine();
		
		System.out.println("Digite a matricula: ");
		this.matricula = input.nextLine();
		
		System.out.println("Digite o ano de ingresso: ");
		this.anoIngresso = input.nextInt();
	}
	
	public void imprimir(int index) {
		System.out.println("[ " + index + " ]");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("matricula: " + matricula);
		System.out.println("Ano de ingresso: " + anoIngresso);
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public int getAnoIngresso() {
		return anoIngresso;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

}
