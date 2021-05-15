package model.entities;

public class IndividualAccount extends Account {
	public Double tax = 3.00;

	public IndividualAccount() {

	}

	public IndividualAccount(Integer number, String name, Double balance, Double tax) {
		super(number, name, balance);
		this.tax = tax;
	}

	public Double getTax() {
		return tax;
	}

	
}