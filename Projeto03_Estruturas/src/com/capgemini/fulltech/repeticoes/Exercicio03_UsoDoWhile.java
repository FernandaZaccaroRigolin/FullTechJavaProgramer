package com.capgemini.fulltech.repeticoes;

public class Exercicio03_UsoDoWhile {
	public static void main(String[] args) {
		int numero = (int)(Math.random() * 10) + 1; // numero aleatório entre 1 e 10
		
		do {
			System.out.println(numero);
			numero++;
		} while (numero < 5);
		
		System.out.println("FIM DO PROGRAMA");
	}
}
