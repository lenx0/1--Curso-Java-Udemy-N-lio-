package entities;

public class LegalPerson extends TaxPayer {
	private Integer employeNumber;

	public LegalPerson() {

	}

	public LegalPerson(String name, Double income, Integer employeNumber) {
		super(name, income);
		this.employeNumber = employeNumber;
	}

	public Integer getEmployeNumber() {
		return employeNumber;
	}

	public void setEmployeNumber(Integer employeNumber) {
		this.employeNumber = employeNumber;
	}

	@Override
	public double tax() {
		if (employeNumber > 10) {
			return income * 0.14;
		} else {
			return income * 0.16;
			
		}

		
	}

}
