package com.capgemini.fulltech.aplicacao;

import javax.swing.JOptionPane;

import com.capgemini.fulltech.classes.Aluno;
import com.capgemini.fulltech.classes.Funcionario;
import com.capgemini.fulltech.classes.Pessoa;
import com.capgemini.fulltech.enumeracoes.Sexos;

public class AppPolimorfismo {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Maria", 30, Sexos.FEMININO);
		Pessoa p2 = new Funcionario("Juliano", 40, Sexos.MASCULINO.FEMININO, "coordenador", 20000);
		
		//Funcionario func = (Funcionario)p2;
		//func.setCargo("Gerente");
		((Funcionario)p2).setCargo("Gerente");
		
		JOptionPane.showMessageDialog(null, p2.getDados());
		p2 = p1;
		JOptionPane.showMessageDialog(null, p2.getDados());
		p2 = new Aluno("Gerson", 50, Sexos.MASCULINO, 1000);
		JOptionPane.showMessageDialog(null, p2.getDados());
		

	}

}
