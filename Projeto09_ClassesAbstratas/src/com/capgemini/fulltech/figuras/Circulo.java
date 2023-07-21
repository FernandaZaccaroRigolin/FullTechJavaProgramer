package com.capgemini.fulltech.figuras;

public class Circulo extends Figura{
	
	private double raio;

	public Circulo(double raio) {
		this.setRaio(raio);
	}	
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calcularArea() {
		return Math.PI * Math.pow(getRaio(), 2);
	}
	

}
