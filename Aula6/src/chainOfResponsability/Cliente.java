package chainOfResponsability;

public class Cliente {
	public static void main(String args[]){
		Maquina maquina = new Maquina();
		maquina.selecionaProduto(new Refrigerante());
		maquina.pagamento(15.00);
		
		maquina.selecionaProduto (new Salgadinho());
		maquina.pagamento(1.00);
		
		

	}

}
