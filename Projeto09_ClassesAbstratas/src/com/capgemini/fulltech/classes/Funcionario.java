package com.capgemini.fulltech.classes;

import java.text.NumberFormat;

import com.capgemini.fulltech.enumeracoes.Sexos;

public class Funcionario extends Pessoa {
	private String cargo;
	private double salario;
	private double irpf;
	
	
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
		this.irpf = calcularIrpf();
	}
	

	public double getIrpf() {
		return irpf;
	}

	// métodos complementares
	@Override
	public String getDados() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		StringBuilder sb = new StringBuilder()
			.append(super.getDados())	
			.append("\n\nCargo: ").append(this.getCargo())
			.append("\nSalário: ").append(nf.format(this.getSalario()))
			.append("\nIRPF: ").append(nf.format(this.getIrpf()));
		
		return sb.toString();
		
	}		
	
	private double calcularIrpf() {
		double[] taxas = { 0, 7.5, 15, 22.5, 27.5 };
		double[] valores = {0, 1903.98, 2826.65, 3751.05, 4664.68 };
		
		double baseCalculo = this.getSalario();
		double imposto = 0;

		for (int i = taxas.length - 1; i > 0 ; i--) {
			
			if(baseCalculo > valores[i]) {
				imposto += (baseCalculo - valores[i]) * taxas[i] / 100.0; 
				baseCalculo = valores[i];
			}
			
		}  

		return imposto;
		
	}
	
}
