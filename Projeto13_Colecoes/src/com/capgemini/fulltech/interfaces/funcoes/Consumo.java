package com.capgemini.fulltech.interfaces.funcoes;

@FunctionalInterface
public interface Consumo<T> {
	String executar(T item);
}
