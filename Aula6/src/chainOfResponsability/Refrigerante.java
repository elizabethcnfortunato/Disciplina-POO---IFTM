package chainOfResponsability;

public class Refrigerante implements Produto {
	@Override
	public double getValor() {
		return 2.00;
	}

	@Override
	public String getNome() {
		return "REFRI";
	}
}
