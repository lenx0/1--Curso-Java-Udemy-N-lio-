package entities;

public class Aluno {
	public String nome;
	public double nota1, nota2, nota3;
	
	public double notaFinal() {
		return (nota1 + nota2 + nota3) / 3;
		
	}

	public double notaFaltando() {
		return 6.0 - notaFinal();
	}
	
	public String toString() {
		return "Nota Final: "+String.format("%.1f", notaFinal());
	}
	
}
