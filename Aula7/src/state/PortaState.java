package state;

public interface PortaState {
	PortaAbrindo abrir();

	PortaFechando fechar();

	PortaAberta aberta();

	PortaFechada fechada();

	PortaAberta manterPermanente();
}