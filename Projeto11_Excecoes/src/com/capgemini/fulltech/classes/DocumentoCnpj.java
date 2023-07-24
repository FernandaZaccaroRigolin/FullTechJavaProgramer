package com.capgemini.fulltech.classes;

import com.capgemini.fulltech.interfaces.Documento;

public class DocumentoCnpj implements Documento {
	
	private String numero;
	
	public DocumentoCnpj(String numero) {
		this.setNumero(numero);
	}
	
	@Override
	public void setNumero(String numero) {
		if(numero == null || !numero.matches("[0-9]{14}")) {
			throw new IllegalArgumentException("O CNPJ deve ter 14 dígitos numéricos");	
		}
		this.numero = numero;
		
	}

	@Override
	public String getInfoDocumentos() {
		
		return "CNPJ: " + this.numero;
	}
}
