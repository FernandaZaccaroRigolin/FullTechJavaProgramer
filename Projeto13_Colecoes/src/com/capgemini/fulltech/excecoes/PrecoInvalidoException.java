package com.capgemini.fulltech.excecoes;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrecoInvalidoException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1787997603210292492L;

	public PrecoInvalidoException() {
		super();
	}
	
	public PrecoInvalidoException(String msg) {
		super(msg);
	}

	@Override
	public String getMessage() {
		// dd/MM/yyyy HH:mm
		Date data = new Date();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");		
		
		return "[" + df.format(data) + "] - " + super.getMessage();
	}
	
}
