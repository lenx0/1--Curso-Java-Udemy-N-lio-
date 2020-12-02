package model.entities;

public class BusinessAccount extends Account {
	protected Double tax = 12.00;

	public BusinessAccount() {
	}

	public BusinessAccount(Integer number, String name, Double balance, Double tax) {
		super(number, name, balance);
		this.tax = tax;
	}

	public Double getTax() {
		return tax;
	}

	
}
