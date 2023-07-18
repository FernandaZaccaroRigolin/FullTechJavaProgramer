package com.capgemini.fulltech.repeticoes;

import javax.swing.JOptionPane;

public class Exercicio01_GerarSenha {
	public static void main(String[] args) {
		/*
		 * O programa deve gerar uma senha contendo 6 digitos numericos aleatórios
		 * No final, mostrar a senha gerada 
		 */
		
		String senha = "";
		
		for (int i = 0; i < 6; i++) {
			senha += (int)(Math.random() * 10);
			//System.out.println(senha);
		}
		
		JOptionPane.showInternalMessageDialog(null, senha);
		
	}
}
