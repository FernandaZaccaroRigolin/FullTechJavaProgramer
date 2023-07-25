package com.capgemini.fulltech.interfaces.funcoes;

import com.capgemini.fulltech.classes.Pessoa;

@FunctionalInterface
public interface Validacao<T extends Pessoa> {
	boolean validar(T item);
}
