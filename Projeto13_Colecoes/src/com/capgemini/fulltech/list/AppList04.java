package com.capgemini.fulltech.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.capgemini.fulltech.classes.Endereco;
import com.capgemini.fulltech.classes.OrdenacaoLogradouro;

public class AppList04 {

	public static void main(String[] args) {
		try {
			List<Endereco> enderecos = new ArrayList<Endereco>();
			enderecos.add(new Endereco("Rua Maceio", 151, "São José", "88110-300"));
			enderecos.add(new Endereco("Rua Augusta", 2847, "São Paulo", "01574-000"));
			enderecos.add(new Endereco("Av Paulista", 1009, "São Paulo", "01311-100"));
			enderecos.add(new Endereco("Rua Vergueiro", 1974, "São Paulo", "01458-000"));
			enderecos.add(new Endereco("Rua Riachuelo", 35, "Rio de Janeiro", "22667-001"));
			
			// ordenação pelo logradouro, usando a classe OrdenacaoLogradouro
			Collections.sort(enderecos, new OrdenacaoLogradouro());
			enderecos.forEach(s -> System.out.println(s.getDados() + '\n'));
			
			System.out.println("-".repeat(20));
			
			// ordenação usando o métido sort() da coleção
			enderecos.sort((s1, s2) -> s1.getCidade().compareTo(s2.getCidade()));
			enderecos.forEach(s -> System.out.println(s.getDados() + '\n'));
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
