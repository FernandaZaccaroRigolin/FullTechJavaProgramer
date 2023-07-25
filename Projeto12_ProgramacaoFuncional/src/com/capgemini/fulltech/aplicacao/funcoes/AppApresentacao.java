package com.capgemini.fulltech.aplicacao.funcoes;

import com.capgemini.fulltech.classes.Endereco;
import com.capgemini.fulltech.interfaces.funcoes.Apresentacao;

public class AppApresentacao {
	public static void main(String[] args) {
		
		Apresentacao ap1 = s -> {
			System.out.println(s.toString());
		};
		
		ap1.executar("Programação Funcional");
		ap1.executar(new Endereco("Rua Bahia", 100, "São Paulo", "04200-000"));
	}

}
