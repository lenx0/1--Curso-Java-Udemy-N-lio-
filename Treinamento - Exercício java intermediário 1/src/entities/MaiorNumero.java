package entities;

public class MaiorNumero {
	
	
	public void mostraOMaiorNumero(int n1, int n2) {
		if(n1 > n2) {
			System.out.println("O número "+n1+" é maior que "+n2);
			
		}
		else if(n1 < n2) {
			System.out.println("O número "+n2+" é maior que "+n1);
		}
		else {
			System.out.println("Os números são iguais");
		}	
		
	}
}