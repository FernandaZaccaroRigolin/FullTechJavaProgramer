package com.capgemini.fulltech.set;

import java.util.HashSet;
import java.util.Set;

public class AppSet01 {

	public static void main(String[] args) {
		Set<String> cidades = new HashSet<String>();
		
		cidades.add("Blumenau");
		cidades.add("Rio de Janeiro");
		cidades.add("São Paulo");
		cidades.add("Curitiba");
		cidades.add("Porto Feliz");
		cidades.add("Curitiba");
		
		cidades.forEach( s-> System.out.println(s));

	}

}
