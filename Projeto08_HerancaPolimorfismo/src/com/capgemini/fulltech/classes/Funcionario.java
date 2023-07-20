package com.capgemini.fulltech.classes;

import com.capgemini.fulltech.enumeracoes.Sexos;

public class Funcionario extends Pessoa {
	private String cargo;
	private double salario;
	
	
	public Funcionario(String nome, String cargo) {
		super(nome);
		this.setCargo(cargo);
	}
	public Funcionario(String nome,int idade, Sexos sexo, String cargo) {
		super(nome, idade, sexo);
		this.setCargo(cargo);
	}	
	public Funcionario(String nome,int idade, Sexos sexo, String cargo, double salario) {
		this(nome, idade, sexo, cargo);
		this.setSalario(salario);
	}		
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	// métodos complementares
	@Override
	public String getDados() {
		StringBuilder sb = new StringBuilder()
			.append(super.getDados())	
			.append("\n\nCargo: ").append(this.getCargo())
			.append("\nSalário: ").append(this.getSalario());
		
		return sb.toString();
		
	}		
	

}
