package com.capgemini.fulltech.aplicacao.funcoes;

import com.capgemini.fulltech.interfaces.funcoes.Operacao;

public class AppOperacao {

	public static void main(String[] args) {
		// double calcular(double x, double y);
		Operacao op1 = (x, y) -> x + y; 
		Operacao op2 = (a, b) -> a * b  + 10;
		Operacao op3 = (x, y) -> x / y;
		Operacao op4 = (x, y) -> {
			double  n = Math.random();
			return x + y + n;
		};
		
		// exercicio: criar a variavel op5 com a sua propri implementação
		
		
		// Executando as expressões lambda
		System.out.println("op1: " + op1.calcular(10, 3)); 
		System.out.println("op2: " + op2.calcular(10, 3));
		System.out.println("op3: " + op3.calcular(10, 3));
		System.out.println("op4: " + op4.calcular(10, 3));
		
	}

}
