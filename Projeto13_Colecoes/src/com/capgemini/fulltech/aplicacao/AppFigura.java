package com.capgemini.fulltech.aplicacao;

import javax.swing.JOptionPane;

import com.capgemini.fulltech.classes.Retangulo;

public class AppFigura {
	public static void main(String[] args) {
		Retangulo retangulo = new Retangulo(2.3, 4.5);
		
		JOptionPane.showInternalMessageDialog(null, retangulo.mostrarFigura());
	}
}
