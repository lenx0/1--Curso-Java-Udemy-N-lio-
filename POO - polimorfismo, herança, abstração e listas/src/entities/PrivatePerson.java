package entities;

public class PrivatePerson extends TaxPayer {
	private Double healthCost;

	public PrivatePerson() {
		super();
	}

	public PrivatePerson(String name, Double income, Double healthCost) {
		super(name, income);
		this.healthCost = healthCost;
	}

	public Double getHealthCost() {
		return healthCost;
	}

	public void setHealthCost(Double healthCost) {
		this.healthCost = healthCost;
	}

	@Override
	public double tax() {
		if (income < 20000.00) {
			return income * 0.15 - healthCost * 0.50;

		} else
			return income * 0.25 - healthCost * 0.50;

	}

}
