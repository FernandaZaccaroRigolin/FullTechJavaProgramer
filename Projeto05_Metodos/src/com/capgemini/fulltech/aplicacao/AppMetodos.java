package com.capgemini.fulltech.aplicacao;

import com.capgemini.fulltech.metodos.Metodos;

public class AppMetodos {

	public static void main(String[] args) {
		double[] valores = { 2.3, 4.5, 7.8, 9.0 };
		
		// metodo somarElementos(): duas formas de utilização do valor de retorno
		double soma = Metodos.somarElementos(valores);
		System.out.println("Soma: " + soma);
		System.out.println("Soma: " +  Metodos.somarElementos(valores));
		
		System.out.println("-".repeat(30));
		//System.out.println("Endereço de valores:" + valores);
				
		//método trocar elementos
		Metodos.trocarElementos(valores);
		for (double num : valores)  {
			System.out.println(num);
		}
		System.out.println("-".repeat(30));
		double[] troca = Metodos.trocarRetornarElementos(valores);
		
		System.out.println("Lista valores (original):");
		for (double num : valores)  {
			System.out.println(num);
		}
		System.out.println("Lista troca (original):");
		for (double num : troca)  {
			System.out.println(num);
		}
		
		System.out.println("-".repeat(30));
		System.out.println("Média 1: "+ Metodos.calcularMedia(2, 3));
		System.out.println("Média 2: "+ Metodos.calcularMedia(2, 3, 8, 7, 9));
		System.out.println("Média 3: "+ Metodos.calcularMedia(valores));
		System.out.println("Média 4: "+ Metodos.calcularMedia());
		
		System.out.println("-".repeat(30));
		
		// metodo trocarElementos revisado
		//Metodos.trocarElementos(new double[] { 2 }); //ArithmeticExceptionS
		//Metodos.trocarElementos(new double[] {  }); //ArithmeticException
		Metodos.trocarElementos(null); // NullPointerExeption
		
	}

}
