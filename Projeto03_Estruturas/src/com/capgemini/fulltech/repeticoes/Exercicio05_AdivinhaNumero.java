package com.capgemini.fulltech.repeticoes;

import javax.swing.JOptionPane;

public class Exercicio05_AdivinhaNumero {

	public static void main(String[] args) {
		int sorteado = 45;// (int)(Math.random() * 100) + 1; // numero aleatório entre 1 e 100

		int min = 1;
		int max = 100;
		int tentativas = 0;

		while (true) {
			tentativas++;
			int digitado = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero entre " + min + " e " + max + "."));
			
			if (digitado == sorteado)
				break;

			if (digitado < min || digitado > max) 
				continue;

			if (digitado > sorteado) 
				max = digitado - 1;
			 else 
				min = digitado + 1;
		}
		JOptionPane.showMessageDialog(null, "Parabéns você acertou com " + tentativas + " tentativas");		

	}

}
