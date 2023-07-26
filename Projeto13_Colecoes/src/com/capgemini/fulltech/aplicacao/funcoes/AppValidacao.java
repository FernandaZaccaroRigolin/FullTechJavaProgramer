package com.capgemini.fulltech.aplicacao.funcoes;

import com.capgemini.fulltech.classes.Aluno;
import com.capgemini.fulltech.classes.Curso;
import com.capgemini.fulltech.classes.DocumentoCpf;
import com.capgemini.fulltech.classes.Funcionario;
import com.capgemini.fulltech.classes.Pessoa;
import com.capgemini.fulltech.enumeracoes.Sexos;
import com.capgemini.fulltech.interfaces.funcoes.Validacao;

public class AppValidacao {
	public static void main(String[] args) {

		Validacao<Pessoa> v1 = p -> p.getIdade() >= 18;
		Validacao<Aluno> v2 = p -> p.getNome().contains("Jose");
		Validacao<Funcionario> v3 = p -> p.getSalario() > 10000;

		try {
			Funcionario f = new Funcionario("Ismael", 30, Sexos.MASCULINO, "Professor", new DocumentoCpf("60499015037"),
					5000);
			
			Aluno a = new Aluno("Ana Paula", 20, Sexos.FEMININO, 1100); 
			
			System.out.println("v1 (f): " + v1.validar(f));
			System.out.println("v1 (a): " + v1.validar(a));
			System.out.println("v2 (a): " + v2.validar(a));
			System.out.println("v3 (f): " + v3.validar(f));

		} catch (Exception e) {

		}

	}
}
