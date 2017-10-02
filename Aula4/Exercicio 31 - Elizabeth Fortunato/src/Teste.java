
public class Teste {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("North", "000.123.258.23");
	
		
		
		Conta cc = new Conta(cliente,150.00);		
		System.out.println(cc.toString());
		
		cc.DebitarConta(300.00);
		
		
		
		
	
	}
}
