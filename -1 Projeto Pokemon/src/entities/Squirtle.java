package entities;

public class Squirtle {
	private int vida = 2500;
	private int ataqueFisico = 20;
	private int ataqueMagico = 44;
	private int defesa = 46;
	private int agilidade = 17;
	
	
	public int bolhas() {
		return ataqueMagico + agilidade;
	}
	
	public int surf() {
		return ataqueMagico + 100;
	}
	
}
