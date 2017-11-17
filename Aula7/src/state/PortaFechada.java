package state;

public class PortaFechada implements PortaState {
	
	@Override
	public PortaAberta aberta() {
		return null;
	} 
	@Override
	public PortaAberta manterPermanente() {
		return null;
	}
	@Override
	public PortaAbrindo abrir() {
		System.out.println("Abrindo porta.");
		return new PortaAbrindo();
	}
	@Override
	public PortaFechando fechar() {
		return null;
	}
	@Override
	public PortaFechada fechada() {
		System.out.println("Porta Fechada.");
		return this;
	}

	

	
	

	

	
}