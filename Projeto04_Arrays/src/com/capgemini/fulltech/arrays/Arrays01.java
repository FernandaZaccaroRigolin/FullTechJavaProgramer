package com.capgemini.fulltech.arrays;

public class Arrays01 {
	public static void main(String[] args) {
		// array de numeros inteiros
		int[] numeros = new int[5];
		numeros[0] = 12;
		numeros[1] = 16;
		numeros[2] = -10;
		numeros[3] = 9;
		numeros[4] = 7;

		// int[] numeros2 = new int[]{12, 16, -10, 9, 7};
		int[] numeros2 = { 12, 16, -10, 9, 7 };

		int[] numeros3;
		numeros3 = new int[]{ 12, 16, -10, 9, 7 };

		// apresentando os elementos
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
		System.out.println("-".repeat(10));
		
		//usando a estrutura foreath - ou loop for aprimorado
		for (int item : numeros2) {
			System.out.println(item);
		}
		System.out.println("-".repeat(10));
		
		int posicao = 0;
		while(posicao < numeros3.length) {
			System.out.println(numeros3[posicao++]);
		}

	}
}
