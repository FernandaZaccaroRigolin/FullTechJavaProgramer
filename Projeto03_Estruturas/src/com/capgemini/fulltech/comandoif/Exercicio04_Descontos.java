package com.capgemini.fulltech.comandoif;

import javax.swing.JOptionPane;

public class Exercicio04_Descontos {
	public static void main(String[] args) {
		/*
		 * A mensalidade de uma escola é cobrada de acordo com o seguinte critério:
		 * 
		 * 1. Se o aluno estudar de manhã, o desconto será de 10% 
		 * 2. Se a média total no ano anterior for 9.5 ou 10 ele tera um desconto de 15%
		 */

		double mensalidade = Double.parseDouble(JOptionPane.showInputDialog("Valor da mensalidade:"));
		double media = Double.parseDouble(JOptionPane.showInputDialog("Média do ano anterior:"));
		if (media < 0 || media > 10) {
			JOptionPane.showMessageDialog(null, "A média deve estar entre 0 e 10");
			return;
		}

		int periodo = Integer.parseInt(JOptionPane.showInputDialog("Período: 1-Manhã, 2-Noite"));
		if (periodo < 1 || periodo > 2) {
			JOptionPane.showMessageDialog(null, "Período incorreto");
			return;
		}
		
		// verifica os descontos
		double desconto = 0;
		if(media >= 9.5) {
			desconto +=  mensalidade * 0.15;
		}
		if (periodo == 1) {
			desconto += desconto + mensalidade * 0.1;
		}
		
		String resposta = "Mensalidade: " + mensalidade +
				"\nDesconto: " + desconto +
				"\nValor a pagar: " + (mensalidade - desconto);
		
		JOptionPane.showMessageDialog(null, resposta);
	}
}
