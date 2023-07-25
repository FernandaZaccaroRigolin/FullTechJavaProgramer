package com.capgemini.fulltech.aplicacao.funcoes;

import com.capgemini.fulltech.interfaces.funcoes.Busca;

public class AppBusca {

	public static void main(String[] args) {
		Busca b1 = s -> s.length();
		Busca b2 = item -> item.replace(" ", "").length();
		
		Busca b3 = texto -> {
			int cont = 0;
			for (int i = 0; i < texto.length(); i++) {
				if(texto.charAt(i) == 'a') cont++;
			}
			return cont;
		};
		
		// exercicio: criar a variavel b4 com a sua proprio implementação
//		Busca b4 = texto -> {
//			return (int) texto.chars()
//	                .filter(ch -> ch == 'a')
//	                .count();
//		};
		

		
		//executando as expressões
		String curso = "Curso Java Cap";
		System.out.println("b1: " + b1.executar(curso)); 
		System.out.println("b2: " + b2.executar(curso));
		System.out.println("b3: " + b3.executar(curso));

	}

}
