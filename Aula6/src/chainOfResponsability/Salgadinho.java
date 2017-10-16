package chainOfResponsability;

public class Salgadinho implements Produto{
	@Override
	public double getValor(){
		return 10.00;
	}
	
	@Override
	public String getNome(){
		return "SALGADINHO";
	}
}
