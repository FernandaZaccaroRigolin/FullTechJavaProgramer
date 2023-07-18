package com.capgemini.fulltech.arrays.exercicios;

import javax.swing.JOptionPane;

public class Exercicios01_NotasTurmas {

	public static void main(String[] args) {
		/*
		 * Escrever um array bidimensional representando n turmas, onde cada turma possui
		 * uma certa quantidade de alunos (notas).
		 * 
		 * A quantidade de turmas, de alunos por turma e o valor de cada nota deve
		 * ser formado como dado de entrada.
		 * 
		 * Em seguida, apresentar:
		 * - as notas por turma
		 * - a média por turma 
		 */
		
		int qtdeTurmas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de turmas:"));
		
		double[][] turmas = new double[qtdeTurmas][];
		
		for (int i = 0; i < turmas.length; i++) {
			int qtdeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de alunos da turma " + (i + 1) + " :"));
			turmas[i] = new double[qtdeAlunos];
			
			for (int j = 0; j < qtdeAlunos; j++) {
				//turmas[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Nota aluno :" + (j + 1) + "/" + qtdeAlunos));
				turmas[i][j] = Double.parseDouble(JOptionPane.showInputDialog(
						String.format("Nota %d, turma %d", j+1, i+1)));
			}
		}
		
		for (int i = 0; i < turmas.length; i++) {
			System.out.print("Turma "+ (i + 1) + ": ");
			double soma = 0;
			for (int j = 0; j < turmas[i].length; j++) {
				System.out.print(((j==0) ? " ": ", ") + turmas[i][j]);
				soma += turmas[i][j];
			}
			
			System.out.println();
			System.out.println("Média: "+(soma / turmas[i].length));
			System.out.println("-".repeat(30));
		}		
	}
}
