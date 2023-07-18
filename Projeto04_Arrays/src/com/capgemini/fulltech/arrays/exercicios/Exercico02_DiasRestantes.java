package com.capgemini.fulltech.arrays.exercicios;

import javax.swing.JOptionPane;

public class Exercico02_DiasRestantes {
	public static void main(String[] args) {
		/*
		 * Neste exercicio, o usuario informa:
		 * - o dia
		 * - o mes
		 * - o ano
		 * 
		 * Com estas informações determinar quantos 
		 * dias restam para terminar o ano.
		 */
		 int dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia:")); 
		 int mes = Integer.parseInt(JOptionPane.showInputDialog("Informe o mês:"));
		 int ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano:"));
		 
		 int[] meses = {31, ((ano % 4 == 0) ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		 
		 int dias =  meses[mes -1] - dia;
		 
		 for (int i = mes ; i < meses.length; i++) {
			 dias += meses[i];
		 }
		 
		 System.out.println(String.format("Data %d/%d/%d, %d dias restantes " , dia, mes, ano, dias));
		}
	}
