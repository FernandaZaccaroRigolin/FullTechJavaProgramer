package com.capgemini.fulltech;

import javax.swing.JOptionPane;

public class LeituraSwing {
	public static void main(String[] args) {

		String nome = JOptionPane.showInputDialog("Qual o seu nome?");

		int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual é sua idade?"));

		double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual é sua altura?"));

		String resultado = " Nome: " + nome + "\nIdade" + idade + "\nAltura" + altura;

		JOptionPane.showInternalMessageDialog(null, resultado);

	}
}
