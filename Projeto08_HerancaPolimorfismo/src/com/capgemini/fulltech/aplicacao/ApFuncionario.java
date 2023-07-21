package com.capgemini.fulltech.aplicacao;

import javax.swing.JOptionPane;

import com.capgemini.fulltech.classes.Endereco;
import com.capgemini.fulltech.classes.Funcionario;
import com.capgemini.fulltech.enumeracoes.Sexos;

public class ApFuncionario {

	public static void main(String[] args) {
		Endereco endereco = new Endereco("Av. Rio Preto", 3000, "Rio de Janeiro", "25447-000");
		Funcionario funcionario = new Funcionario ("Benedito", 50, Sexos.MASCULINO, "Motorista", 5000);
		//funcionario.setEndereco(endereco);
		
		JOptionPane.showMessageDialog(null, funcionario.getDados());
	}

}
