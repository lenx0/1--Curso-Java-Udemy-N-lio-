package model.entities;

public class Business extends Account {
	protected Double taxToOpen = 200.00;

	public Business() {
		
	}

	public Business(Integer number, String name, Double balance, Double iniDeposit, Double withdrawLimit,
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

}
