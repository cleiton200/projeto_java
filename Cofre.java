package cofrinho;

import java.util.ArrayList;

public class Cofre {
	private ArrayList <Moeda> ListaDeMoedas =  new ArrayList<Moeda>();

	void addMoeda(Moeda m) {
		ListaDeMoedas.add(m);
	}
	void Remover(Moeda m) {
		ListaDeMoedas.remove(m);
	}

	public String toString() {
		return "Cofre ListaDeMoedas = " + ListaDeMoedas ;
	}

	void infoCofre() {
		for (Moeda m : ListaDeMoedas) {
			System.out.println(m);
		}
	}

	 double Converter() {
		double total = 0;
		for (Moeda m : ListaDeMoedas) {
			total += m.Converter() ;
			
		}
		return total;
	}	
}


