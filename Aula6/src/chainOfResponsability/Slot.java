package chainOfResponsability;

public abstract class Slot {
	private Slot sucessor;
	
	public Slot(){
		sucessor = null;
	}
	
	public abstract double processaRequisicao(Double valor);
	
	public void setSucessor(Slot sucessor){
		if(this.sucessor == null){
			this.sucessor = sucessor;
		}else{
			this.sucessor.setSucessor(sucessor);
		}
	}
	public Slot getSucessor(){
		if(this.sucessor == null){
			System.out.println("A máquina não aceita");
			return null;
		}else{
			return this.sucessor;
		}
	}
}
