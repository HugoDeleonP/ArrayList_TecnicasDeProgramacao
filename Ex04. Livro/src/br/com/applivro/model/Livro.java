package br.com.applivro.model;
import java.util.Scanner;

public class Livro {
	
	Scanner input = new Scanner(System.in);
	
	private String titulo;
	private String autor;
	private int numeroPaginas;
	private double preco;
	
	public void imprimir(int index) {
		System.out.println("[ "+ index + " ]");
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Número de páginas: " + numeroPaginas);
		System.out.println("Preço: " + preco);
	}
	
	public void preencher(Scanner input) {
		System.out.println("Título: ");
		titulo = input.nextLine();
		
		System.out.println("Autor: ");
		autor = input.nextLine();
		
		System.out.println("Número de páginas: ");
		numeroPaginas = input.nextInt();
		
		System.out.println("Preço: ");
		preco = input.nextDouble();
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setAutor(String autor) {
		this.autor= autor;
	}
	
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas= numeroPaginas;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
}
