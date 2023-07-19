package com.capgemini.fulltech.aplicacao;

import com.capgemini.fulltech.classes.Endereco;

public class AppEndereco {

	public static void main(String[] args) {
		
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Av. Rio Branco");
		endereco.setNumero(3000);
		endereco.setCidade("Rio de Janeiro");
		endereco.setCep("25447000");
		
		System.out.println(endereco.getDados());
			
	}

}
