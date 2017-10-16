package chainOfResponsability;

public class Slot10 extends Slot{
	private double valor = 10.00;
	
	@Override 
	public double processaRequisicao(Double valor){
		if (this.valor == valor){
			return this.valor;
		}else{
			return this.getSucessor().processaRequisicao(valor);
		}
	}
}
