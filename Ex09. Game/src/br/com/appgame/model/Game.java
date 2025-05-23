package br.com.appgame.model;

import java.util.Scanner;

public class Game {
	
	Scanner input = new Scanner(System.in);
	
	private String titulo;
	private String plataforma;
	private String classificacaoEtaria;
	private double preco;
	
	public void preencher(Scanner input) {
		System.out.println("Título: ");
		titulo = input.nextLine();
		
		System.out.println("Plataforma: ");
		plataforma = input.nextLine();
		
		System.out.println("Classificação etária: ");
		classificacaoEtaria = input.nextLine();
		
		System.out.println("Preço: ");
		preco = input.nextDouble();
		input.nextLine();
	}
	
	public void imprimir(int index) {
		System.out.println("ID: " + index);
		System.out.println("Título: " + titulo);
		System.out.println("Plataforma: " + plataforma);
		System.out.println("Classificação etária: " + classificacaoEtaria);
		System.out.println("Preço: " + preco);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getClassificacaoEtaria() {
		return classificacaoEtaria;
	}

	public void setClassificacaoEtaria(String classificacaoEtaria) {
		this.classificacaoEtaria = classificacaoEtaria;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	

}
