package Observer;

public class Teste {
	
	public static void main(String[] args) {
		Alarme alarme = new Alarme();	
		alarme.observar(new Delegacia());
		alarme.observar(new CompanhiaSeguro());		
		alarme.alterarAlerta();	
	}
	
}