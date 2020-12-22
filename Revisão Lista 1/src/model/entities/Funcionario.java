package model.entities;

public abstract class Funcionario {
	protected String nome;
	protected Double salario;

	public Funcionario() {

	}

	public Funcionario(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public String toString() {
		return "\nNome: "+getNome()
		+"\nSal�rio: R$ "+getSalario();
	}
}
