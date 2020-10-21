package entities;

public class Bulbasaur {
	private int vida = 2500;
	private int ataqueFisico = 21;
	private int ataqueMagico = 40;
	private int defesa = 32;
	private int agilidade = 26;
	
	
	
	
	public int chicote() {
		return ataqueMagico + agilidade + ataqueFisico;
	}
	
	public int raioSolar() {
		return ataqueMagico + 100;
	}
	
}
