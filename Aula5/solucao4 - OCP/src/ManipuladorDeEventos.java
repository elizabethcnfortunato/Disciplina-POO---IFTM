
public class ManipuladorDeEventos {
	
	private Veiculo veiculo;
	
	public ManipuladorDeEventos(ModoDirecao modo) {
		this.veiculo = modo.modoDirecao();
	}
		
	public Veiculo getVeiculo() {
		return veiculo;
	}

}
