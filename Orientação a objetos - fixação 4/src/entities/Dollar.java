package entities;

public class Dollar {
	public static double valorDollar;
	
	public static double valorFinalDolar() {
		return valorDollar += valorDollar * 6 / 100;
	}
}
