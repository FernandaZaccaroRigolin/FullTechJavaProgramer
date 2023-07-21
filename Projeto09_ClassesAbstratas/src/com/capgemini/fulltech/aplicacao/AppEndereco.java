package com.capgemini.fulltech.aplicacao;

import com.capgemini.fulltech.classes.Endereco;

public class AppEndereco {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco("Av. Rio Preto", 3000, "Rio de Janeiro", "25447-000");
		
		System.out.println(endereco.getDados());
			
	}

}
