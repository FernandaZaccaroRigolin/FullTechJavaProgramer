package com.capgemini.fulltech.aplicacao;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

import com.capgemini.fulltech.figuras.Circulo;
import com.capgemini.fulltech.figuras.Figura;
import com.capgemini.fulltech.figuras.Retangulo;

public class AppFigura {
	public static void main(String[] args) {
		Retangulo r1 = new Retangulo(2, 3);
		Circulo c1 = new Circulo(4);
		
		Figura r2 = new Retangulo(3, 3);
		Figura c2 = new Circulo(1);
		
		mostrarFigura(r2);
		mostrarFigura(c2);
		
		//mostrarFigura(new Retangulo(10.0, 20.0));
		//mostrarFigura(new Circulo(20.0));
	}
	
	private static void mostrarFigura(Figura figura) {
		DecimalFormat df = new DecimalFormat("0.##");
		
		String resultado = "Classe da figura: " + figura.getClass().getSimpleName()
				+ "\nÁrea da figura: " + df.format(figura.calcularArea());
		
		JOptionPane.showMessageDialog(null, resultado);
	}
}
