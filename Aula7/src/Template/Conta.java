package Template;

public class Conta {
	private String titular;
	private String agencia;
	int numConta;
	private Double saldo;

	
	public Conta(String titular, String agencia, int numConta, Double saldo){
		this.titular = titular;
		this.numConta = numConta;
		this.saldo = saldo;
		this.agencia = agencia;
	}
	public String getTitular(){
		return titular;
	}
	public int getNumConta(){
		return numConta;
	}
	public String getAgencia(){
		return agencia;		
	}
	public Double getSaldo(){
		return saldo;
	}
	

}
