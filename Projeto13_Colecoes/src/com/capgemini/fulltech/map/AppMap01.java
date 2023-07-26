package com.capgemini.fulltech.map;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class AppMap01 {
	public static void main(String[] args) {
		// No Map, a chave deve ser exclusiva. A chave é armazenada em uma coleção Set

		Map<Integer, String> cursos = new HashMap<Integer, String>();

		cursos.put(123, "Dot Net");
		cursos.put(945, "Java");
		cursos.put(336, "Angular");
		cursos.put(123, "Oracle"); // com a mesma chave, o valor é substitudo

		// exibindo através do método forEach
		cursos.forEach((k, v) -> System.out.println(k + ": " + v));

		System.out.println("-".repeat(20));

		// exibindo através da esttrutura for (foreach)
		for (Map.Entry<Integer, String> item : cursos.entrySet()) {
			System.out.println(item.getKey() + ": " + item.getValue());
		}

		System.out.println("-".repeat(20));

		// buscando um elemento pela chave

		int chave = Integer.parseInt(JOptionPane.showInputDialog("Informe o código"));

		if (cursos.containsKey(chave)) {
			String valor = cursos.get(chave);
			System.out.println("Valor associado à chave: " + valor);
		} else {
			System.out.println("Nenhum valor encontrado com este código.");
		}
	}
}
