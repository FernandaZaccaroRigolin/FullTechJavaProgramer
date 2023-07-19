package com.capgemini.fulltech.classes;

public class Endereco {
	// atributos da classe
	// acesso default ausencia de modificador: acesso de pacote  
//	String logradouro;
//	int numero;
//	String cidade;
//	String cep;

	// acesso publico: acesso total e irrestrito
//	public String logradouro;
//	public int numero;
//	public String cidade;
//	public String cep;
	
	// acesso private: acesso somente na classe onde foi inserido
	private String logradouro;
	private int numero;
	private String cidade;
	private String cep;
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	// métodos complementares
	public String getDados() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Logradouro: ").append(this.getLogradouro())
			.append("\nNúmero: ").append(this.getNumero())
			.append("\nCidade: ").append(this.getCidade())
			.append("\nCEP: ").append(this.getCep());
		
		return sb.toString();
		
	}
	
	
}
