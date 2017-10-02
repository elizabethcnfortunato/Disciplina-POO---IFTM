
public class ModoDirecaoEsporte implements ModoDirecao {
	private Veiculo veiculo;


	public Veiculo modoDirecao() {
		this.veiculo = new Veiculo(500, 10);
		return this.veiculo;
	} 

}
