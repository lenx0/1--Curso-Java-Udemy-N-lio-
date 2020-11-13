package model.entities;

public class Individual extends Account {

	protected Double taxToOpen = 50.00;

	public Individual() {
		super();
	}

	public Individual(Integer number, String name, Double balance, Double iniDeposit, Double withdrawLimit,
			Double depositLimit, Double taxToOpen) {
		super(number, name, balance, iniDeposit, withdrawLimit, depositLimit);
		this.taxToOpen = taxToOpen;

	}

	public Double getTaxToOpen() {
		return taxToOpen;
	}

	public void setTaxToOpen(Double taxToOpen) {
		this.taxToOpen = taxToOpen;
	}

	public String toString() {
		return "\nNúmero: "
				 +number
				 +"\nNome: "
				 +name
				 +"\nSaldo: $"
				 +getBalance();
	}
}
