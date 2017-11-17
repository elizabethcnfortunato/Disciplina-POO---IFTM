package state;

public class PortaFechando implements PortaState {

	@Override
	public PortaAbrindo abrir() {
		return null;
	}

	@Override
	public PortaFechando fechar() {
		System.out.println("***Porta Fechando...***");
		return this;
	}

	@Override
	public PortaAberta aberta() {
		return null;
	}

	@Override
	public PortaFechada fechada() {
		System.out.println("****Porta Fechada****");
		return new PortaFechada();
	}

	@Override
	public PortaAberta manterPermanente() {
		return null;
	}

}