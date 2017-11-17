package state;

public class PortaAbrindo implements PortaState {

	
	@Override
	public PortaFechando fechar() {
		return null;
	}
	@Override
	public PortaAberta aberta() {
		System.out.println("Porta Aberta.");
		return new PortaAberta();
	}

	@Override
	public PortaFechada fechada() {
		return null;
	}
	@Override
	public PortaAbrindo abrir() {
		System.out.println("Abrindo porta.");
		return this;
	}

	@Override
	public PortaAberta manterPermanente() {
		return null;
	}

	

	

}