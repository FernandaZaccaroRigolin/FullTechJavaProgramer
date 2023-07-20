package com.capgemini.fulltech.aplicacao;

import javax.swing.JOptionPane;

import com.capgemini.fulltech.classes.Endereco;
import com.capgemini.fulltech.classes.Pessoa;
import com.capgemini.fulltech.enumeracoes.Sexos;

public class AppPessoa {
	public static void main(String[] args) {
		// Endereco
		Endereco endereco = new Endereco("Av. Rio Preto", 3000, "Rio de Janeiro", "25447000");
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Osvaldo Sila");
		pessoa.setIdade(30);
		pessoa.setSexo(Sexos.MASCULINO);
		pessoa.setEndereco(endereco);
		
		JOptionPane.showMessageDialog(null, pessoa.getDados());
		
		
	}

}
