package com.capgemini.fulltech.classes;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Objects;

import com.capgemini.fulltech.excecoes.PrecoInvalidoException;

public class Curso implements Comparable<Curso> {
	private int codigo;
	private String descricao;
	private int ch;
	private double preco;

	public Curso() {
		super();
	}

	public Curso(int codigo, String descricao, int ch) throws NoSuchFieldException, IllegalAccessException {
		this();
		this.setCodigo(codigo);
		;
		this.setDescricao(descricao);
		;
		this.setCh(ch);
		;
	}

	public Curso(int codigo, String descricao, int ch, double preco)
			throws NoSuchFieldException, IllegalAccessException {
		this(codigo, descricao, ch);
		this.setPreco(preco);
	}

	public int getCodigo() {
		return codigo;
	}

//	public void setCodigo(int codigo) {
//		if(codigo <= 0 || codigo %  10 != 0) {
//			throw new IllegalArgumentException("O código deve ser positivo e múltiplo de 10");
//		}
//		this.codigo = codigo;
//	}
	public void setCodigo(int codigo) {
		try {

			if (codigo <= 0 || codigo % 10 != 0) {
				throw new IllegalArgumentException("O código deve ser positivo e múltiplo de 10");
			}
			this.codigo = codigo;
		} catch (IllegalArgumentException e) {
			// detalhar melhor o erro
			e.initCause(new NumberFormatException("Erro gerado devido a inconsistência na entrada de dados."));
			throw e;
		}

	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) throws NoSuchFieldException, IllegalAccessException {
		if (ch <= 0) {
			throw new IllegalAccessException("A carga horária não foi informada corretamente.");
		}

		if (ch < 4) {
			throw new NoSuchFieldException("A carga horária deve ser no mínimo 4 horas.");
		}
		this.ch = ch;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0) {
			throw new PrecoInvalidoException("O preço não pode ser negativo.");
		}

		this.preco = preco;
	}

	// metodos complementares
	public String getDados() {
		return new StringBuilder().append("Dados do Curso: ").append("\nCódigo: ").append(this.getCodigo())
				.append("\nDescrição: ").append(this.getDescricao()).append("\nCarga Horária: ").append(this.getCh())
				.append("\nPreço: ").append(NumberFormat.getCurrencyInstance().format(this.getPreco())).toString();
	}

	@Override
	public String toString() {

		return this.getCodigo() + " - " + this.getDescricao();
	}

	@Override
	public int compareTo(Curso o) {
		// a ordenação será feita pela descrição
		return this.getDescricao().compareTo(o.getDescricao());
	}

	@Override
	public int hashCode() {
		Double preco = this.getPreco();
		return this.getCodigo() + this.getDescricao().hashCode() + this.getCh() + preco.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Curso) {
			Curso c = (Curso) obj;
			if (this.getDescricao().equals(c.getDescricao()) && this.getCodigo() == c.getCodigo()
					&& this.getCh() == c.getCh() && this.getPreco() == c.getPreco()) {
				return true;

			}
		}
		return false;
	}

	// método para retornar uma linha contendo os dados do curso para a listage
	public String getLinha() {

		Formatter formatter = new Formatter();
		String linha = formatter.format("%n%-6s %-20s %-3s %15s", 
				this.getCodigo(), 
				this.getDescricao(), 
				this.getCh(),
				new DecimalFormat("#,##0.00").format(this.getPreco()))
				.toString();

		formatter.close();
		return linha;
	}

}
