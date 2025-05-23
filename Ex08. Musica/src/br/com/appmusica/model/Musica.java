package br.com.appmusica.model;
import java.util.Scanner;

public class Musica {
	Scanner input = new Scanner(System.in);
	
	private String titulo;
	private String artista;
	private int duracao;
	private double preco;
	
	public void preencher(Scanner input) {
		System.out.println("Título: ");
		titulo = input.nextLine();
		
		System.out.println("Diretor: ");
		artista = input.nextLine();
		
		System.out.println("Duração: ");
		duracao = input.nextInt();
		
		System.out.println("Preço: ");
		preco = input.nextDouble();
		input.nextLine();
	}
	
	public void imprimir(int index) {
		System.out.println("ID: " + index);
		System.out.println("Título: " + titulo);
		System.out.println("Artista: " + artista);
		System.out.println("Duração: " + duracao);
		System.out.println("Preço: " + preco);
	}

	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
