package com.capgemini.fulltech.set;

import java.util.Set;
import java.util.TreeSet;

public class AppSet03 {

	public static void main(String[] args) {
		// requerem elementos de classes que implementaca comparable
		// elemento são inseridos na ordem
		Set<String> cidades = new TreeSet<String>();
		
		cidades.add("Blumenau");
		cidades.add("Rio de Janeiro");
		cidades.add("São Paulo");
		cidades.add("Curitiba");
		cidades.add("Porto Feliz");
		cidades.add("Curitiba");	
		
		cidades.forEach( s-> System.out.println(s));
		
	}

}
