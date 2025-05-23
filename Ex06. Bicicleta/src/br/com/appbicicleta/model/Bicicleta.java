package br.com.appbicicleta.model;
import java.util.Scanner;

public class Bicicleta {
	Scanner input = new Scanner(System.in);
	
	private String marca;
	private String modelo;
	private double tamanhoQuadro;
	private double preco;
	
	public void preencher(Scanner input){
		System.out.println("Marca: ");
		marca = input.nextLine();
		System.out.println("Modelo: ");
		modelo = input.nextLine();
		System.out.println("Tamanho do quadro: ");
		tamanhoQuadro = input.nextDouble();
		System.out.println("Preço: ");
		preco = input.nextDouble();
	}
	
	public void imprimir() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Tamanho do quadro: " + tamanhoQuadro);
		System.out.println("Preço: " + preco);
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getTamanhoQuadro() {
		return tamanhoQuadro;
	}

	public void setTamanhoQuadro(double tamanhoQuadro) {
		this.tamanhoQuadro = tamanhoQuadro;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
