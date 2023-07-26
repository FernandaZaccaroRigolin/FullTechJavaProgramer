package com.capgemini.fulltech.classes;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

import com.capgemini.fulltech.enumeracoes.Sexos;

public class Aluno extends Pessoa {
	private int matricula;
	private List<Curso> cursos;

	public Aluno(String nome, int idade, Sexos sexo, int matricula) {
		super(nome, idade, sexo);
		this.setMatricula(matricula);
	}

	public Aluno(String nome, int idade, Sexos sexo, int matricula, List<Curso> cursos) {
		this(nome, idade, sexo, matricula);
		this.setCursos(cursos);
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
		this.setCursos(new ArrayList<Curso>());
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	@Override
	public String getDados() {

		return new StringBuilder(super.getDados()).append("\n\nMatrícula").append(this.getMatricula()).append("\n")
				// .append(this.getCurso() == null ? "Nenhum curso matriculado" :
				// this.getCurso().getDados())
				.toString();
	}

	public String listarCursos() {
		Formatter formatter = new Formatter();
		String linha = "-".repeat(47);
		String cabecalho = formatter
				.format("%s%n%-6s %-20s %-3s %15s%n%s", linha, "CODIGO", "DESCRIÇÃO", "CH", "PREÇO", linha).toString();
		StringBuilder sb = new StringBuilder(cabecalho);

		if (this.getCursos().size() > 0) {

			for (Curso curso : this.getCursos()) {

				sb.append(curso.getLinha());

			}

		} else {
			sb.append("\nNenhum curso atribuido para o aluno");
		}
		formatter.close();
		return sb.toString();
	}

}
