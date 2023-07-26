package com.capgemini.fulltech.classes;

public class Endereco {
	// atributos da classe
	private String logradouro;
	private int numero;
	private String cidade;
	private String cep;

	public Endereco(String logradouro, int numero, String cidade, String cep) {
		this.setLogradouro(logradouro);
		this.setNumero(numero);
		this.setCidade(cidade);
		this.setCep(cep);
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		if (logradouro == null || logradouro.length() == 0) {
			throw new NullPointerException("Logradouro não informado corretamente.");
		}
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			throw new IllegalArgumentException("Número deve ser positivo.");
		}
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		if (cidade == null || cidade.length() == 0) {
			throw new NullPointerException("Cidade não informada corretamente.");
		}
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		if (cep == null || !cep.matches("[0-9]{5}-?[0-9]{3}")) {
			throw new NullPointerException("CEP não informado corretamente.");
		}
		this.cep = cep;
	}

	// métodos complementares
	public String getDados() {
		StringBuilder sb = new StringBuilder();

		sb.append("Logradouro: ").append(this.getLogradouro()).append("\nNúmero: ").append(this.getNumero())
				.append("\nCidade: ").append(this.getCidade()).append("\nCEP: ").append(this.getCep());

		return sb.toString();

	}

	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", numero=" + numero + ", cidade=" + cidade + ", cep=" + cep
				+ "]";
	}
	
	

}
