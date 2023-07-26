package com.capgemini.fulltech.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.capgemini.fulltech.classes.Curso;

public class AppList03 {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		try {
			cursos.add(new Curso(100, "Java", 60));
			cursos.add(new Curso(200, "Java Script", 40, 1000));
			cursos.add(new Curso(300, "Angular", 100, 2000));
			cursos.add(new Curso(400, "Business Intelligente", 100, 5000));
			
			cursos.forEach(s -> System.out.println(s));
			System.out.println("-".repeat(20));
			Collections.sort(cursos);
			cursos.forEach(s -> System.out.println(s));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
