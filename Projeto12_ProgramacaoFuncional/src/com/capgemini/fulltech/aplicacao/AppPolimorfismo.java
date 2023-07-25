package com.capgemini.fulltech.aplicacao;

import javax.swing.JOptionPane;

import com.capgemini.fulltech.classes.Aluno;
import com.capgemini.fulltech.classes.Curso;
import com.capgemini.fulltech.classes.DocumentoCnpj;
import com.capgemini.fulltech.classes.Funcionario;
import com.capgemini.fulltech.classes.Pessoa;
import com.capgemini.fulltech.enumeracoes.Sexos;

public class AppPolimorfismo {

	public static void main(String[] args) {
		try {
			Pessoa p2 = new Funcionario("Juliano", 40, Sexos.MASCULINO, "coordenador",
					new DocumentoCnpj("14130448000134"), 20000);

			p2.setNome("Juliano Silva");

			if (p2 instanceof Funcionario) {
				((Funcionario) p2).setCargo("Gerente");
				mostrarPessoa(p2);
			}

			p2 = new Aluno("Gerson", 50, Sexos.MASCULINO, 1000);
			if (p2 instanceof Aluno) {
				((Aluno) p2).setCurso(new Curso(110, "Java", 100, 1200.0));
			}

			mostrarPessoa(p2);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void mostrarPessoa(Pessoa pessoa) {
		JOptionPane.showInternalMessageDialog(null, pessoa.getDados());
	}
}
