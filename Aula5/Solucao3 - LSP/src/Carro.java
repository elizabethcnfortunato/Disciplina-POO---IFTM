
public class Carro {
	private Veiculo veiculo;

	public Carro() {
		this.veiculo = new Veiculo();
	}

	public void mudaMarcha(Marcha marcha) {
		if ((this.veiculo.getMarcha() != null)
				&& (Marcha.R.equals(marcha) && this.veiculo.getMarcha().equals(Marcha.D))) {
			throw new RuntimeException("N�o pode mudar para REVERSE quando " + this.veiculo.getMarcha().toString()
					+ " marcha est� engatada!");
		} else {
			this.veiculo.mudaMarcha(marcha);
		}
	}

	public Marcha getMarcha() {
		return this.veiculo.getMarcha();
	}

}
