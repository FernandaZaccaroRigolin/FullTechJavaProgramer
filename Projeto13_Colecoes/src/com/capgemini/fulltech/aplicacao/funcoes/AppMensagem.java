package com.capgemini.fulltech.aplicacao.funcoes;

import javax.swing.JOptionPane;

import com.capgemini.fulltech.interfaces.funcoes.Mensagem;

public class AppMensagem {

	public static void main(String[] args) {
		Mensagem msg1 = () -> "Java Programer";
		Mensagem msg2 = () -> "Valor gerado: " + Math.random();
		Mensagem msg3 = () -> {
			String texto = JOptionPane.showInputDialog("Informe um texto:");
			return "Texto informado: " + texto;
		};
		
		// exercicio: criar a variavel msg4 com a sua proprio implementação
		
		
		System.out.println("msg1: " + msg1.mostrar());
		System.out.println("msg2: " + msg2.mostrar());
		System.out.println("msg3: " + msg3.mostrar());
	}
}

