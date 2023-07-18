package com.capgemini.fulltech.comandoif;

import javax.swing.JOptionPane;

public class Exercicio04_Descontos {
	public static void main(String[] args) {
		/*
		 * A mensalidade de uma escola é cobrada de acordo cm oseguinte critério:
		 * 
		 * 1. Se o aluno estudar de manhã , o desconto será de 10% 2. Se a média total
		 * no ano anterior for 9.5 ou 10 ele tera um desconto de 15%
		 */

		double mensalidade = Double.parseDouble(JOptionPane.showInputDialog("Valor da mensalidade:"));
		double media = Double.parseDouble(JOptionPane.showInputDialog("Media do ano anterior:"));
		if (media < 0 || media > 10) {
			JOptionPane.showMessageDialog(null, "A media deve estar entre 0 e 10");
			return;
		}

		int periodo = Integer.parseInt(JOptionPane.showInputDialog("Valor da mensalidade:"));
		if (periodo < 1 || periodo > 2) {
			JOptionPane.showMessageDialog(null, "Periodo incorreto");
			return;
		}
	}
}
