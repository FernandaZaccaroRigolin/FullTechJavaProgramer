package com.capgemini.fulltech.classes;

import com.capgemini.fulltech.enumeracoes.Sexos;

public abstract class Pessoa {
	
	private final int codigo;
	private String nome;
	private int idade;
	private Sexos sexo;
	private Endereco endereco;
	
	private static int CONTADOR = 1;
	
	//construtores
	public Pessoa(String nome) {
		this.codigo = CONTADOR++;
		this.setNome(nome);
	}
	
	public Pessoa(String nome, int idade) {
		this(nome);
		this.setIdade(idade);
	}	
	
	public Pessoa(String nome, int idade, Sexos sexo) {
		this(nome, idade);
		this.setSexo(sexo);
	}
	
	public Pessoa(String nome, int idade, Sexos sexo, Endereco endereco) {
		this(nome, idade, sexo);
		this.setEndereco(endereco);
	}		
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public Sexos getSexo() {
		return sexo;
	}
	public void setSexo(Sexos sexo) {
		this.sexo = sexo;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public int getCodigo() {
		return codigo;
	}	
	
	// métodos complementares
	public String getDados() {
		StringBuilder sb = new StringBuilder("Código : ").append(this.getCodigo())
			.append("\nNome: ").append(this.getNome())
			.append("\nIdade: ").append(this.getIdade())
			.append("\nSexo: ").append(this.getSexo());
		
		if(this.getEndereco() != null)
			sb.append("\n\nEndereco: \n").append(this.getEndereco().getDados());
		
		return sb.toString();
		
	}	
	
	
}
