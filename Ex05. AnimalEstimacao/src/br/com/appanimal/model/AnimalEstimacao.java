package br.com.appanimal.model;

import java.util.Scanner;

public class AnimalEstimacao {
	
	Scanner input = new Scanner(System.in);
	
	private String especie;
	private String raca;
	private int idade;
	private double peso;
	
	public void preencher(Scanner input) {
		System.out.println("Espécie: ");
		especie = input.nextLine();
		
		System.out.println("Raça: ");
		raca = input.nextLine();
		
		System.out.println("Idade: ");
		idade = input.nextInt();
		input.nextLine();
		
		System.out.println("Peso: ");
		peso = input.nextDouble();
		input.nextLine();
		
	}
	
	public void imprimir() {
		System.out.println("Espécie: " + especie);
		System.out.println("Raça: " + raca);
		System.out.println("Idade: " + idade);
		System.out.println("Peso: " + peso);
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
