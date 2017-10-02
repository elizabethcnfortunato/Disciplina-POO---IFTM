
public class ModoDirecaoPasseio implements ModoDirecao {
	
	private Veiculo veiculo;
	
	//@Override
	public Veiculo modoDirecao() {
		this.veiculo = new Veiculo(400, 20);
		return veiculo;
	}

}
