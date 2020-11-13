package model.entities;

public abstract class Account {
	protected static Integer number;
	protected static String name;
	protected Double balance;
	protected static Double iniDeposit;
	protected Double withdrawLimit;
	protected Double depositLimit;
	


	public Account() {

	}

	public Account(Integer number, String name, Double balance, Double iniDeposit, Double withdrawLimit,
			Double depositLimit) {
		super();
		this.number = number;
		this.name = name;
		this.balance = balance;
		this.iniDeposit = iniDeposit;
		this.withdrawLimit = withdrawLimit;
		this.depositLimit = depositLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getIniDeposit() {
		return iniDeposit;
	}

	public void setIniDeposit(Double iniDeposit) {
		this.balance = iniDeposit;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Double getDepositLimit() {
		return depositLimit;
	}

	public void setDepositLimit(Double depositLimit) {
		this.depositLimit = depositLimit;
	}

	public static void menu() {
		System.out.println("[1]-Cadastrar nova conta\n" 
				+ "[2]-Sacar\n" 
				+ "[3]-Depositar\n" 
				+ "[4]-Extrato\n"
				+ "[5]-Ver limites de crédito\n" 
				+ "[6]-Sair\n");
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	
	

}
