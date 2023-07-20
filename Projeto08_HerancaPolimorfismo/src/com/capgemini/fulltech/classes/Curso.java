package com.capgemini.fulltech.classes;

public class Curso {
	private int codigo;
	private String descricao;
	private int ch;
	private double preco;
	
	public Curso() {
		super();
	}

	public Curso(int codigo, String descricao, int ch) {
		this();
		this.setCodigo(codigo);;
		this.setDescricao(descricao);;
		this.setCh(ch);;
	}	
	
	public Curso(int codigo, String descricao, int ch, double preco) {
		this(codigo, descricao, ch);
		this.setPreco(preco);
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
}
