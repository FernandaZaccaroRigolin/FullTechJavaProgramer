package com.capgemini.fulltech.set;

import java.util.LinkedHashSet;
import java.util.Set;

import com.capgemini.fulltech.classes.Curso;

public class AppSet04 {

	public static void main(String[] args) {
		Set<Curso> cursos = new LinkedHashSet<Curso>();
		try {
			
			cursos.add(new Curso(100, "Java", 60));
			cursos.add(new Curso(200, "Java Script", 40, 1000));
			cursos.add(new Curso(300, "Angular", 100, 2000));
			cursos.add(new Curso(400, "Business Intelligente", 100, 5000));
			
			cursos.add(new Curso(300, "Angular", 100, 2000));
			
			cursos.forEach(s -> System.out.println(s));
			
			System.out.println("-".repeat(20));
			
			Curso c1 = new Curso(300, "Angular", 100, 2000);
			Curso c2 = new Curso(300, "Angular", 100, 2000);
			
			System.out.println(c1.hashCode());
			System.out.println(c2.hashCode());
			
			System.out.println(c1.equals(c2));

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
