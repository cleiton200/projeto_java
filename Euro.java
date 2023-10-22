package cofrinho;

public class Euro extends Moeda{
	double cambioEuro= 5.35;

	
	public Euro(double valor) {
		super(valor);
	}

	public String toString() {
		return "Euro " + valor ;
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

	void InfoEuro() {
		
	}

	
	void ConverterEuro() {
		
		
	}

	@Override
	double Converter() {
		return valor *cambioEuro;
	}
}


