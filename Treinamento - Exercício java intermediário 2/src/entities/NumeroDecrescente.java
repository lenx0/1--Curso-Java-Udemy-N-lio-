package entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumeroDecrescente {
	
	List<Integer> list = new ArrayList<>();
	
	public void imprimeNumero(int n) {
		for(int i = 0; i <=n; i++) {
			list.add(i);
			
		}
	Collections.reverse(list);
	System.out.println(list);
	}

}
