package entities;

public class Gengar {
	private int vida = 2000;
	private int forca = 200;
	private int def = 300;
	private int agi = 400;

	public Gengar() {
	}

	public Gengar(int vida, int forca, int def, int agi) {
		super();
		this.vida = vida;
		this.forca = forca;
		this.def = def;
		this.agi = agi;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getForca() {
		return forca;
	}

	public void setForca(int forca) {
		this.forca = forca;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getAgi() {
		return agi;
	}

	public void setAgi(int agi) {
		this.agi = agi;
	}

	
}
