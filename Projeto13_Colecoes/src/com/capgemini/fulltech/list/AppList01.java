package com.capgemini.fulltech.list;

import java.util.ArrayList;
import java.util.List;

public class AppList01 {

	public static void main(String[] args) {
		List<String> cursos = new ArrayList<String>();
		cursos.add("PHP");
		cursos.add("Java");
		cursos.add("Scrum Master");
		
		cursos.add(0, "SQL Server");
		cursos.add("Cloud Computing");
		cursos.add(1, "DevOps");
		
		// exibindo com foreach
		for (String curso : cursos) {
			System.out.println(curso);
		}
		
		System.out.println("-".repeat(20));
		
		// exibindo com o metodo forEach()
		cursos.forEach(s -> System.out.println(s));
		
		System.out.println("-".repeat(20));
		
		// remover um elemento
		cursos.remove("PHP");
		
		// remover todos os cursos terminando em 's'
		cursos.removeIf(s -> s.endsWith("s"));
		System.out.println(cursos);
	}

}
