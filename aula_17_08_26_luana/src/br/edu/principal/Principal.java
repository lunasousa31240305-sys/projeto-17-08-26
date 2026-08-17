package br.edu.principal;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		String nome;
		double n1, n2, media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite  seu nome: ");
		nome = sc.next();
		
		System.out.println("digite  sua nota 1: ");
		n1 = sc.nextDouble();
		
		System.out.println("digite  sua nota 2: ");
		n2 = sc.nextDouble();
		
		media = (n1 + n2)/2;
		
		System.out.println("nome: " + nome);
		System.out.println("media: " + media);
		
	}

}
