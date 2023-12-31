package com.capgemini.fulltech.comandoif;

import javax.swing.JOptionPane;

public class Exercicio03_CaixaEletronico {
	public static void main(String[] args) {
		/*
		 * Um caixa eletrônico possui as seguintes cedulas 50, 20, 10, 5
		 * 
		 * Determinar a quantidade de cada cedula dado o valor do saque
		 */

		double valorSaque = Double.parseDouble(JOptionPane.showInputDialog(""));
		// fazendo o cast (typecast) para inteiro - coerção
		int valor = (int) valorSaque;

		// verificando se o valor é multiplo de 5
		if (valor % 5 != 0) {
			// throw new NumberFormatException("O valor do saque deve ser múltiplo de 5!");
			JOptionPane.showMessageDialog(null, "O valor deve ser multiplo de 5");
		} else {
			// definindo variaveis para armazenar a quantidade de cedulas
			int q50, q20, q10, q5;
			q50 = q20 = q10 = q5 = 0;

			q50 = valor / 50;
			valor %= 50;

			q20 = valor / 20;
			valor %= 20;

			q10 = valor / 10;
			valor %= 10;

			q5 = valor / 5;

			String resposta = "Valor do saque: " + valorSaque + "\nNotas de 50: " + q50 + "\nNotas de 20: " + q20
					+ "\nNotas de 10: " + q10 + "\nNotas de  5: " + q5;

			JOptionPane.showMessageDialog(null, resposta);
		}
	}
}
