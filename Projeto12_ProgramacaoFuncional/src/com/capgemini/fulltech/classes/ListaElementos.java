package com.capgemini.fulltech.classes;

import java.util.function.Predicate;

import com.capgemini.fulltech.interfaces.funcoes.Apresentacao;

public class ListaElementos<T> {
	
	private T[] elementos;
	
	public ListaElementos(T[] elementos) {
		this.setElementos(elementos);
	}

	public T[] getElementos() {
		return elementos;
	}

	public void setElementos(T[] elementos) {
		this.elementos = elementos;
	}
	
	public T buscar(Predicate<T> busca) {
		for(T item : elementos) {
			if(busca.test(item)) {
				return item;
			}
		}
		return null;
	
	}
	
	public void pesquisar(Apresentacao app) {
		for (T item : elementos) {
			app.executar(item);
		}
	}

}
