package entities;

public class Pokedex {
	public String nome;
	private String tipo1;
	private String tipo2;
	private String evolucao;
	private String atk1;
	private String atk2;
	private String atk3;
	private String atk4;

	public Pokedex() {

	}

	public Pokedex(String nome, String tipo1, String tipo2, String evolucao, String atk1, String atk2, String atk3,
			String atk4) {
		this.nome = nome;
		this.tipo1 = tipo1;
		this.tipo2 = tipo2;
		this.evolucao = evolucao;
		this.atk1 = atk1;
		this.atk2 = atk2;
		this.atk3 = atk3;
		this.atk4 = atk4;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo1() {
		return tipo1;
	}

	public void setTipo1(String tipo1) {
		this.tipo1 = tipo1;
	}

	public String getTipo2() {
		return tipo2;
	}

	public void setTipo2(String tipo2) {
		this.tipo2 = tipo2;
	}

	public String getEvolucao() {
		return evolucao;
	}

	public void setEvolucao(String evolucao) {
		this.evolucao = evolucao;
	}

	public String getAtk1() {
		return atk1;
	}

	public void setAtk1(String atk1) {
		this.atk1 = atk1;
	}

	public String getAtk2() {
		return atk2;
	}

	public void setAtk2(String atk2) {
		this.atk2 = atk2;
	}

	public String getAtk3() {
		return atk3;
	}

	public void setAtk3(String atk3) {
		this.atk3 = atk3;
	}

	public String getAtk4() {
		return atk4;
	}

	public void setAtk4(String atk4) {
		this.atk4 = atk4;
	}

	public String toString() {
		return "Nome: \n" + nome + "Tipo 1: \n" + tipo1 + "Tipo 2: \n" + tipo2 + "Evolui para: \n" + evolucao
				+ "Ataque : \n" + atk1 + "Ataque 2: \n" + atk2 + "Ataque 3: \n" + atk3 + "Ataque 4: \n" + atk4;

	}

}
