package entities;

public abstract class Pokemon {
	private int vida;
	private int atk;
	private int def;
	
	public Pokemon() {
		
	}

	public Pokemon(int vida, int atk, int def) {
		super();
		this.vida = vida;
		this.atk = atk;
		this.def = def;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDefesa() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
	public void evoluir() {
		
	}
	

}
