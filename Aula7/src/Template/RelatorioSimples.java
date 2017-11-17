package Template;

public class RelatorioSimples extends Relatorio {
	public RelatorioSimples(DadosBanco dadosBanco){
		super(dadosBanco);
	}
	@Override
	void imprimiRelatorio() {
		//CABECALHO
		System.out.println("**** RELAT�RIO SIMPLES ****");
		System.out.println(" ");
		System.out.println("**CABE�ALHO**");
		System.out.println("BANCO: " + dadosBanco.nomeBanco);
		System.out.println("TELEFONE: "+dadosBanco.telefone);
		
		//CORPO
		for(Conta conta: dadosBanco.getContas()){
			System.out.println("TITULAR: " + conta.getTitular());
			System.out.println("SALDO: "+conta.getSaldo());
		}
	
		
		//RODAPE
		System.out.println("**RODAP�**");
		System.out.println("BANCO: " + dadosBanco.nomeBanco);
		System.out.println("TELEFONE: "+dadosBanco.telefone);
		

		
	}


	

}
