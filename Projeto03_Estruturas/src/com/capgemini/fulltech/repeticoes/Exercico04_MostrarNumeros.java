package com.capgemini.fulltech.repeticoes;

import javax.swing.JOptionPane;

public class Exercico04_MostrarNumeros {

	public static void main(String[] args) {
		/*
		 * Neste programa o usuário fornece uma sequencia de numeros inteiros.
		 * Quando for usuário informar 0, o programa termina.
		 * Se o usuário informa um valor negativo, este é ignorado
		 * Caso contrário, o valor é exibido
		 */
		
		while(true) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));

			if(numero == 0) {
				break;
			}
			
			if(numero < 0) {
				continue;
			}
			System.out.println(numero);
		}
		
		System.out.println("FIM DO PROGRAMA");

	}

}
