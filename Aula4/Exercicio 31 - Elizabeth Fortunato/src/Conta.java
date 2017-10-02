
public class Conta {
	private int numeroConta;
	private double saldoConta;
	
	Cliente cliente;
	
	public Conta(Cliente ref,double saldo){
		this.cliente = ref;
		this.saldoConta = saldo;
	}
	
	public double getSaldoConta(){
		return saldoConta;
	}


	
	
	public boolean ValidarSaldoByValor(double valor){ // verifica se tem valor na conta, para ser debitado.
		if(saldoConta>= valor){
			return true;
		}else{
			return false;
		}
	}
	
	public void DebitarConta(double valor){
	

		if(ValidarSaldoByValor(valor)){
			saldoConta = saldoConta- valor;
			EmitirComprovante();
		}else{
			System.out.print("Saldo Insuficiente");
		}
	}
	
	public void EmitirComprovante(){
		System.out.print("Seu Saldo Atual: "+saldoConta + "Nome Cliente: "+cliente.nomeCliente);
		
		
	}
	
	public String toString(){
		return " Numero da Conta: "+numeroConta+ " Nome do Cliente:"+cliente.nomeCliente+" Saldo Conta: " + saldoConta;
	}

}
