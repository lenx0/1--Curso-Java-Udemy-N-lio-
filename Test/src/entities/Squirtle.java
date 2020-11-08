package entities;

public class Squirtle extends Pokemon {
	private int res = 100;
	private int fra = 150;

	public Squirtle() {

	}

	public Squirtle(int vida, int atk, int defesa, int res, int fra) {
		super(vida, atk, defesa);
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
