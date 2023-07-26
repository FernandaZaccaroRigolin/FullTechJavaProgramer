package com.capgemini.fulltech.list;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.fulltech.classes.Aluno;
import com.capgemini.fulltech.classes.Funcionario;
import com.capgemini.fulltech.classes.Pessoa;
import com.capgemini.fulltech.enumeracoes.Sexos;

public class AppListComplementos {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<? extends Pessoa> pessoas = new ArrayList<Funcionario>();
		List<? super Aluno> lista = new ArrayList<Pessoa>();
		
		Aluno aluno = new Aluno("Mauro", 40, Sexos.MASCULINO, 1000);
		
		// A adição abaixo não é permitida por questões de instabilidade de acesso (polimorfismo)
		//pessoas.add(aluno);
		
		Pessoa[] pessoas1 = new Funcionario[3];
		// A atribuição abaixo produzira a excecao ArrayStoreException
		pessoas1[0] = aluno;
		
		
		
		
	}
}
