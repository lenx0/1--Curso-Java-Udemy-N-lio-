package model.entities;

public class Externo extends Funcionario {
	protected Double bonus;

	public Externo() {
		super();
	}

	public Externo(String nome, Double salario, Double bonus) {
		super(nome, salario);
		this.bonus = bonus;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
	@Override
	public String toString() {
		return "\nNome: "+getNome()
		+"\nSalário: R$ "+getSalario()
		+"\nBônus: R$ "+getBonus();
	}

}
