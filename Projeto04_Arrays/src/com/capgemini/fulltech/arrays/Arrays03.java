package com.capgemini.fulltech.arrays;

public class Arrays03 {

	public static void main(String[] args) {
		double[][] turmas = new double[3][];
		
		double[] notas_turma1 = { 7.5, 8, 9.5, 6.5, 5 };
		double[] notas_turma2 = { 9, 4.5 };
		double[] notas_turma3 = { 0, 5.5, 4.5, 3.5, 10 };
		
		turmas[0] = notas_turma1;
		turmas[1] = notas_turma2;
		turmas[2] = notas_turma3;
		
		for (int i = 0; i < turmas.length; i++) {
			System.out.print("Turma "+ (i + 1) + ": ");
			for (int j = 0; j < turmas[i].length; j++) {
				System.out.print(((j==0) ? " ": "") + turmas[i][j]);
			}
			System.out.println();
		}

	}

}
