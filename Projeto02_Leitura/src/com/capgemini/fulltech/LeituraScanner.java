package com.capgemini.fulltech;

import java.util.Scanner;

public class LeituraScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual o seu nome?");
		String nome = scanner.next();

		System.out.println("Qual a sua idade?");
		int idade = scanner.nextInt();

		String resultado = "Nome informado: " + nome + "\nIdade informada: " + idade;

		System.out.println(resultado);

		scanner.close();
		;
	}
}
