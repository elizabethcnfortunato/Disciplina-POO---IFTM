public class Piloto {
	/* private CarroDeCorrida veiculo;
	 public Piloto(){
		 this.veiculo = new CarroDeCorrida(100); 
	 }*/
	
	private Veiculo veiculo;

	public Piloto(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public void aumentaVelocidade() {
		veiculo.acelerar();
	}
}
