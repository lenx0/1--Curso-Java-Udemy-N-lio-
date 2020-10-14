package util;

import entities.Dollar;

public class CurrencyConverter {
	
	public static double calculoFinal(double quantidade) {
		return quantidade * Dollar.valorDollar;
	}
	
	

}
