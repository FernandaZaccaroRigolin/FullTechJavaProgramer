package com.capgemini.fulltech.aplicacao;

import javax.swing.JOptionPane;

import com.capgemini.fulltech.classes.Curso;

public class AppCurso {

	public static void main(String[] args) {
		try {
			Curso curso = new Curso(40, "Java Web", 2, 0);
			JOptionPane.showMessageDialog(null, curso.getDados());
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
			// e.printStackTrace();
		}
	}
}
