package entities;

public abstract class Account {
	private String name;
	private Integer number;
	private Double balance;

	public Account() {

	}

	public Account(String name, Integer number, Double balance) {
		super();
		this.name = name;
		this.number = number;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

}
