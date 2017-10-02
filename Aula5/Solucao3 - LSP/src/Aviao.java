
public class Aviao {
	private Veiculo veiculo;

	public Aviao() {
		this.veiculo = new Veiculo();
	}

	public <Marcha> void mudaMarcha(Marcha marcha) {
		this.veiculo.mudaMarcha(getMarcha());
		
	}

	public Marcha getMarcha() {
		return this.veiculo.getMarcha();
	}
}
