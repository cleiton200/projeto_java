package cofrinho;

public class Real extends Moeda{

	public Real(double valor) {
		super(valor);
	}
	
	public String toString() {
			return "Real " + valor ;
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
		return valor;
	}

}

	
