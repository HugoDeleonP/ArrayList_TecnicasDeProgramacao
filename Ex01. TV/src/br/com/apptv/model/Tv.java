package br.com.apptv.model;

import java.util.Scanner;

public class Tv {
	
	Scanner input = new Scanner(System.in);
	
	private String marca;
	private double tamanho;
	private String resolucao;
	private double preco;
	
	public void preencher(Scanner input) {
		
		System.out.println("Digite a marca:");
		this.marca = input.nextLine();
		
		System.out.println("Digite o tamanho: ");
		this.tamanho = input.nextDouble();
		
		input.nextLine();
		
		System.out.println("Digite a resolução: ");
		this.resolucao = input.nextLine();
		
		System.out.println("Digite o preco: ");
		this.preco = input.nextDouble();
		input.nextLine();
	}
	
	public void imprimir(int index) {
		
		System.out.println("\nMarca: " + marca );
		System.out.println("Tamanho: " + tamanho);
		System.out.println("Resolução: " + resolucao);
		System.out.println("Preço: " + preco);
		System.out.println("---------------------------------");
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public double getTamanho() {
		return tamanho;
	}
	
	public void setTamanho(double tamanho) {
		this.tamanho = tamanho;
	}
	
	public String getResolucao() {
		return resolucao;
	}
	
	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	

}
