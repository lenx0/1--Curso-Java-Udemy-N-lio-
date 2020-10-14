package entities;

public class Mewtwo {
	public double vida = 50000;
	public double ataque = 3000;
	public double defesa = 1250;
	public double agilidade = 1890;
	public double magia = 1790;
	
	public double Psychic() {
		double DanoBasePsychic = 890;
		return DanoBasePsychic + this.ataque + this.magia;
		
	}

}
