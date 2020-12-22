package model.entities;

public class Interno extends Funcionario {
	protected Double desconto;

	public Interno() {
		super();
	}

	public Interno(String nome, Double salario, Double desconto) {
		super(nome, salario);
		this.desconto = desconto;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	@Override
	public String toString() {
		return "\nNome: " + getNome() + "\nSalário: R$ " + getSalario() + "\nBônus: R$ " + getDesconto();
	}
}