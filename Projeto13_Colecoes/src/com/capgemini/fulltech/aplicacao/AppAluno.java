package com.capgemini.fulltech.aplicacao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import com.capgemini.fulltech.classes.Aluno;
import com.capgemini.fulltech.classes.Curso;
import com.capgemini.fulltech.enumeracoes.Sexos;

public class AppAluno {

	public static void main(String[] args) {

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			
			List<Curso> cursos = new ArrayList<>();
			cursos.add(new Curso(10, "HTML", 20));
			cursos.add(new Curso(20, "Javascript", 40, 500));
			cursos.add(new Curso(30, "Asp.Net Core", 40, 1200));
			cursos.add(new Curso(40, "SQL Server", 60, 2500));

			// Solicitando dados do aluno para o usuário
			String nome = JOptionPane.showInputDialog("Informe seu nome: ");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));

			Sexos sexo = (Sexos) JOptionPane.showInputDialog(null, "Informe o sexo: ", "Sexo",
					JOptionPane.INFORMATION_MESSAGE, null, Sexos.values(), null);

			int matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a matrícula: "));
			Aluno aluno = new Aluno(nome, idade, sexo, matricula, cursos);
			System.out.println(aluno.getDados());
			System.out.println(aluno.listarCursos());
			//JOptionPane.showInternalMessageDialog(null, aluno.getDados());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
