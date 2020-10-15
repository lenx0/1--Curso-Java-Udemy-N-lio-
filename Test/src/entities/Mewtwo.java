package entities;

public class Mewtwo {
	public double vida = 50000;
	public double ataque = 50;
	
	public double Psychic() {
		double DanoBasePsychic = 890;
		return DanoBasePsychic + this.ataque + this.magia;
		
	}

}
