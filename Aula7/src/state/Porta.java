package state;

public class Porta {

	protected PortaState estado;

	public Porta() {
		estado = new PortaFechada();
	}

	public void abrir() {
		estado = estado.abrir();
		estado = estado.aberta();
	}

	public void abertaPermanente() {		
		estado = estado.manterPermanente();
	}
	public void fechar() {
		estado = estado.fechar();
		estado = estado.fechada();		
	}

}