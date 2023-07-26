package com.capgemini.fulltech.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class AppSet02 {

	public static void main(String[] args) {
		Set<String> cidades = new LinkedHashSet<String>();
		
		cidades.add("Blumenau");
		cidades.add("Rio de Janeiro");
		cidades.add("São Paulo");
		cidades.add("Curitiba");
		cidades.add("Porto Feliz");
		cidades.add("Curitiba");
		
		cidades.forEach( s-> System.out.println(s));
		
		System.out.println();
		
		String s1 = "Curitiba";
		String s2 = "Curitiba";
		
		System.out.println("s1 == s2 ? " + (s1 == s2)); // true
		
		String s3 = new String("Curitiba");
		String s4 = new String("Curitiba");
		
		System.out.println("s3 == s4 ? " + (s3 == s4)); //false
		
		System.out.println("s3.equals(s4) ? " + s3.equals(s4)); //true
		
		System.out.println();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}

}
