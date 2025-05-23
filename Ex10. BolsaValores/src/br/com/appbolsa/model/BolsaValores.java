package br.com.appbolsa.model;

import java.util.Scanner;

public class BolsaValores {
	
	Scanner input = new Scanner (System.in);
	
	private String nomeEmpresa;
	private double precoAcao;
	private double volumeNegociacoes;
	private double variacaoDiaria;
	
	public void preencher(Scanner input) {
		System.out.println("Nome da empresa: ");
		nomeEmpresa = input.nextLine();
		
		System.out.println("Preço da ação: ");
		precoAcao = input.nextDouble();
		
		System.out.println("Volume de negociações: ");
		volumeNegociacoes = input.nextDouble();
		
		System.out.println("Variação diária: ");
		variacaoDiaria = input.nextDouble();
		input.nextLine();
	}
	
	public void imprimir(int index) {
		System.out.println("ID: " + index);
		System.out.println("Título: " + nomeEmpresa);
		System.out.println("Plataforma: " + precoAcao);
		System.out.println("Classificação etária: " + volumeNegociacoes);
		System.out.println("Preço: " + variacaoDiaria);
	}	
}
