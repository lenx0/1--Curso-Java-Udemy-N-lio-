package entities;

public class Bulbasaur extends Pokemon {
	private int res = 100;
	private int fra = 150;

	public Bulbasaur() {

	}

	public Bulbasaur(int vida, int atk, int def, int res, int fra) {
		super(vida, atk, def);
		this.res = res;
		this.fra = fra;
	}

	public int getRes() {
		return res;
	}

	public void setRes(int res) {
		this.res = res;
	}

	public int getFra() {
		return fra;
	}

	public void setFra(int fra) {
		this.fra = fra;
	}

}
