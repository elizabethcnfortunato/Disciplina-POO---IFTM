package Observer;

public class Delegacia implements Observer {

	@Override
	public void atualizar(Subject s) {
		System.out.println("****DELEGACIA NOTIFICADA****");
		System.out.println(" ");
		System.out.println("Estado Atual do Alarme " + s.getAlerta());
	}

}