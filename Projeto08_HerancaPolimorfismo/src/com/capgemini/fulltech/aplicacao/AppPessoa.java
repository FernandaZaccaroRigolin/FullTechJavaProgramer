package com.capgemini.fulltech.aplicacao;

import javax.swing.JOptionPane;

import com.capgemini.fulltech.classes.Endereco;
import com.capgemini.fulltech.classes.Pessoa;
import com.capgemini.fulltech.enumeracoes.Sexos;

public class AppPessoa {
	public static void main(String[] args) {
		// Endereco
		Endereco endereco = new Endereco("Av. Rio Preto", 3000, "Rio de Janeiro", "25447-000");
		// Pessoa
		Pessoa p1 = new Pessoa("Osvaldo Silva", 30, Sexos.MASCULINO, endereco);
		Pessoa p2 = new Pessoa("Maria", 30, Sexos.FEMININO, endereco);
		// Apresentando dados
		JOptionPane.showMessageDialog(null, p1.getDados());
		JOptionPane.showMessageDialog(null, p2.getDados());
		
	}

}
