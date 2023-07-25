package com.capgemini.fulltech.classes;

import com.capgemini.fulltech.interfaces.Documento;

public class DocumentoCpf implements Documento {
	private String numero;
	
	public DocumentoCpf(String numero) {
		this.setNumero(numero);
	}
	
	@Override
	public void setNumero(String numero) {
		if(numero == null || !numero.matches("[0-9]{11}")) {
			throw new IllegalArgumentException("O CPF deve ter 11 dígitos numéricos");		
		}
		this.numero = numero;
		
	}

	@Override
	public String getInfoDocumentos() {
		
		return "CPF: " + this.numero;
	}

}
