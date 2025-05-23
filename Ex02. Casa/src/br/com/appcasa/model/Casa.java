package br.com.appcasa.model;

import java.util.Scanner;

public class Casa {

	private String endereco;
	private double area;
	private int numeroQuartos;
	private double preco;
	
	public void preencher(Scanner input) {
		System.out.println("Endereço: ");
		endereco = input.nextLine();
		
		System.out.println("Área: ");
		area = input.nextDouble();
		
		System.out.println("Número de quartos: ");
		numeroQuartos = input.nextInt();
		
		System.out.println("Preço: ");
		preco = input.nextDouble();
	}
	
	public void imprimir(int index) {
		System.out.println("[ " + index + " ]");
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Área: " + this.area);
		System.out.println("Número de quartos: " + this.numeroQuartos);
		System.out.println("Preço: " + this.preco);
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setArea(double area) {
		this.area = area;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setNumeroQuartos(int numeroQuartos) {
		this.numeroQuartos = numeroQuartos;
	}
	
	public int getNumeroQuartos() {
		return numeroQuartos;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
	
}
