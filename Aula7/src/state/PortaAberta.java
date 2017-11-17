package state;

public class PortaAberta implements PortaState {

	@Override
	public PortaAbrindo abrir() {
		return null;
	}

	@Override
	public PortaFechando fechar() {
		System.out.println("*Fechando Porta.*");
		return new PortaFechando();
	}

	@Override
	public PortaAberta aberta() {
		System.out.println("****Porta Aberta!!!****");
		return this;
	}

	@Override
	public PortaFechada fechada() {
		return null;
	}

	@Override
	public PortaAberta manterPermanente() {
		System.out.println("***!!!Porta Aberta Permanente!!!***");
		return this;
	}

}