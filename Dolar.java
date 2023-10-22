package cofrinho;

public class Dolar extends Moeda {
	double cambioDolar = 4.89;

	public Dolar(double valor) {
		super(valor);
	}


	public String toString() {
		return "Dolar " + valor ;
	}
	
	public void Info() {
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}


	@Override
	double Converter() {
		
		return valor*cambioDolar;
	}


	
		
}
