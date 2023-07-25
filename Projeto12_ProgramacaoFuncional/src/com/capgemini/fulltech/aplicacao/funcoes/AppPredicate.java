package com.capgemini.fulltech.aplicacao.funcoes;

import java.util.function.Predicate;

public class AppPredicate {
	public static void main(String[] args) {
		Predicate<String> p1 = p -> p.startsWith("A") || p.startsWith("a");
		
		System.out.println("p1: " + p1.test("Formação Full Tech"));
		
	}

}

