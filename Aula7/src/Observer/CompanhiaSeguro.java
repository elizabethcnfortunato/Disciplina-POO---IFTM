package Observer;

public class CompanhiaSeguro implements Observer {

	@Override
	public void atualizar(Subject s) {
		System.out.println("Notificando a Companhia de Seguros ");
		System.out.println("Estado Atual do Alarme: " + s.getAlerta());
	}

}
