package chainOfResponsability;
	
	
public class Maquina {
	Slot slot;
	Produto produto;
	double valorTotal;
	
	
	public Maquina(){
		slot = new Slot1();
		slot.setSucessor(new Slot1());
		slot.setSucessor(new Slot5());
		slot.setSucessor(new Slot10());
		slot.setSucessor(new Slot15());
	}
	
	public void selecionaProduto(Produto produto){
		this.produto = produto;
	}
	public void pagamento(double valor){
		valorTotal +=slot.processaRequisicao(valor);
		if(valorTotal >= produto.getValor()){
			valorTotal = valorTotal - produto.getValor();
			System.out.println("Comprou: "+ (produto.getNome()));
		
		}else{
			System.out.println("Saldo Insuficiente: " +(produto.getNome()));
		}
		System.out.println("Troco: "+valorTotal);
	}
}
