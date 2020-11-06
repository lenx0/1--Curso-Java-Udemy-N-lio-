package application;

import entities.Account;
import entities.BusinessAccount;

public class Program {
	public static void main(String[] args) {

	BusinessAccount acc1 = new BusinessAccount(20022, "Thiago", 100.00, 600.00);
	
	Account acc2 = new BusinessAccount(20023, "Regiane", 1000.00, 500.00);
	
	Account acc3 = acc1;


	}
}
