package entities;

public class Charmander {
	private double vida = 1000;
	private double ataque = 50;
	private double defesa = 35;
	
	public Charmander(double vida, double ataque, double defesa) {
		super();
		this.vida = vida;
		this.ataque = ataque;
		this.defesa = defesa;
	
	}
	
	public double getVida() {
		return vida;
	}

	public void setVida(double vida) {
		this.vida = vida;
	}

	public double getAtaque() {
		return ataque;
	}

	public void setAtaque(double ataque) {
		this.ataque = ataque;
	}

	public double getDefesa() {
		return defesa;
	}

	public void setDefesa(double defesa) {
		this.defesa = defesa;
	}


}



