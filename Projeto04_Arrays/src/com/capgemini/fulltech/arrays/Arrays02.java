package com.capgemini.fulltech.arrays;

import javax.swing.JOptionPane;

public class Arrays02 {

	public static void main(String[] args) {
		/*
		 * Definir uma lista de nomes, cuja quantidade é informada pelo usuário.
		 * Em seguida fornecer uma palabra representando um elemento de busca.
		 * Os nomes devem ser apresentados com base nesta busca.
		 */
		
		
		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos nomes"));
		String[] nomes = new String[quantidade];
		for (int i = 0; i < nomes.length; i++) {
			nomes[i] = JOptionPane.showInputDialog("Informe o nome " + (i + 1) + "/" + quantidade);
			System.out.println(nomes[i]);
		}
		System.out.println("-".repeat(30));
		String busca =JOptionPane.showInputDialog("Informe um texto de busca");
		
		for (String nome : nomes) {
			if(nome.toUpperCase().contains(busca.toUpperCase())) {
				System.out.println(nome);
			}
		}


	}

}
