package Template;

public class Teste {
	
	public static void main(String[] args){
		DadosBanco b1 = new DadosBanco("Bradesco",34913767,"Rua Yole Fonseca Ribeiro","itau@hotmail.com");
		
		Conta a = new Conta("Elizabeth Fortunato", "1239", 466182, 5000.00);
		b1.addConta(a);
		
		a = new Conta("Cleidson Gomes","03115",58741, 10000.00);
		b1.addConta(a);
		
		Relatorio r1 = new RelatorioSimples(b1);
		r1.imprimiRelatorio();
		System.out.println("****** FIM ******");
		
		Relatorio r2 = new RelatorioComplexo(b1);
		r2.imprimiRelatorio();
		System.out.println("****** FIM ******");
	}

}
