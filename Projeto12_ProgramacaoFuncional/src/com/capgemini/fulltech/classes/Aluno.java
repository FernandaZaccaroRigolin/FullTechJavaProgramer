package com.capgemini.fulltech.classes;

import com.capgemini.fulltech.enumeracoes.Sexos;

public class Aluno extends Pessoa {
	private int matricula;
	private Curso curso;
	
	
	public Aluno(String nome, int idade, Sexos sexo, int matricula) {
		super(nome, idade, sexo);
		this.setMatricula(matricula);
	}
	public Aluno(String nome, int idade, Sexos sexo, int matricula, Curso curso) {
		this(nome, idade, sexo, matricula);
		this.setCurso(curso);
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	@Override
	public String getDados() {
		
		return new StringBuilder(super.getDados())
				.append("\n\nMatrícula").append(this.getMatricula())
				.append("\n")
				.append(this.getCurso() == null ? "Nenhum curso matriculado" : this.getCurso().getDados())
				.toString();
	}

}
