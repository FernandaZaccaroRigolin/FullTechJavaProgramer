package com.capgemini.fulltech.repeticoes;

public class Exercicio02_UsoWhile {
	public static void main(String[] args) {
		int numero = (int)(Math.random() * 10) + 1; // numero aleatório entre 1 e 10
		
		
		while(numero < 5) {
			System.out.println(numero);
			numero++;
		}
		
		System.out.println("FIM DO PROGRAMA");
		
	}
}
