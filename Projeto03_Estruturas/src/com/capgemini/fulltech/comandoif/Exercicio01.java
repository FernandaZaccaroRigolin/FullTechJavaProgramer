package com.capgemini.fulltech.comandoif;

import javax.swing.JOptionPane;

public class Exercicio01 {
	public static void main(String[] args) {
		/*
		 * O vale transporte é calculado como sendo 6% sobre um salario bruto de um funcionário
		 * 
		 * Escreva o programa de forma a solicitar:
		 * 
		 *  - o valor do salário
		 *  - o valor gasto mensalmente com transporte
		 *  
		 * Como resposta, o programa deve informar o valor descontado. 
		 */
		
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Valor do salário:"));
		double transporte = Double.parseDouble(JOptionPane.showInputDialog("Gasto com transporte:"));
		
		double vt = salario * 0.06;   // 6 porcento
		
		if (vt > transporte) {
			vt = transporte;
		}
		
		JOptionPane.showMessageDialog(null, "Vale-transporte: " + vt);
		
		
	}
}
