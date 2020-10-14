package entities;


public class Terreno {
	public static double largura, comprimento;
	public static final double VALOR_METRO = 210.50; //a váriavel está escrita assim pois é uma constante, final porque o valor NAO MUDA
	
	
	public static double area() {
		return largura * comprimento;
	}

	public double valorFinal() {
		return area() * VALOR_METRO;
	}
}
