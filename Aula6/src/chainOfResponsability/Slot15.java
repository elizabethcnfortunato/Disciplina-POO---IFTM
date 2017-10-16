package chainOfResponsability;

public class Slot15 extends Slot{
	private double valor = 15.00;
	
	@Override 
	public double processaRequisicao(Double valor){
		if (this.valor == valor){
			return this.valor;
		}else{
			return this.getSucessor().processaRequisicao(valor);
		}
	}
}
