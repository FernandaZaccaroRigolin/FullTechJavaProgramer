package com.capgemini.fulltech.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AppLIst02 {

	public static void main(String[] args) {
		List<String> cursos = new ArrayList<String>();
		cursos.add("PHP");
		cursos.add("Java");
		cursos.add("Scrum Master");
		
		cursos.add(0, "SQL Server");
		cursos.add("Cloud Computing");
		cursos.add(1, "DevOps");
		
		// ordena a lista
		Collections.sort(cursos);
		cursos.forEach(s -> System.out.println(s));
		System.out.println("-".repeat(20));
		cursos.stream().filter(s -> s.contains("a")).forEach(s -> System.out.println(s));

	}

}
