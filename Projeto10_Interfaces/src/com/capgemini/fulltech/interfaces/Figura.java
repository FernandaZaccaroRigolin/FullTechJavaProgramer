package com.capgemini.fulltech.interfaces;

public interface Figura {
	// //por definição, atributos de interface são (public, static e final) são constantes 
	String curso = "Full Tech";
	
	//por definição, métodos de interfaces são públicos e abstratos
	double calcularArea();
	
	default String mostrarFigura() {
		String resultado = "Classe da figura: " + this.getClass().getSimpleName()
				+ "\nàrea da figura: " + this.calcularArea();
		return resultado;
	}

}
