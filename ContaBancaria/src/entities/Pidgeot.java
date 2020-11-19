package entities;

import java.awt.font.NumericShaper.Range;
import java.util.Random;

public class Pidgeot {
	private int vida = 2000;
	private int forca = 100;
	private int def = 200;
	private int agi = 300;
	private int  = 
	
	private Random random = new Random();
	
	public Pidgeot() {
	}

	public Pidgeot(int vida, int forca, int def, int agi) {
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

	public double airSlash() {
		
		int n = random.nextInt(50) + 100;
		return n;
	}
	


}
