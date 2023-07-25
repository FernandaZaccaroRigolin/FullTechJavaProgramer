package com.capgemini.fulltech.aplicacao;

import com.capgemini.fulltech.classes.Endereco;

public class AppEndereco2 {
	public static void main(String[] args) {
		try {
			Endereco endereco = new Endereco("Av. Rio Preto", 3000, "Rio de Janeiro", "25447-000");

			endereco.setNumero(0);

			System.out.println(endereco.getDados());
		} catch (NullPointerException | NumberFormatException e) {

			System.out.println("Erro de referência nula: " + e.getMessage());

		} catch (Exception e) {

			System.out.println("Ocorreu um erro geral: " + e.getMessage());

		}

	}
}
