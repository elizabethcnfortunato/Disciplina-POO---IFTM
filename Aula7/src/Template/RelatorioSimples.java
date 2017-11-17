package Template;

public class RelatorioSimples extends Relatorio {
	public RelatorioSimples(DadosBanco dadosBanco){
		super(dadosBanco);
	}
	@Override
	void imprimiRelatorio() {
		//CABECALHO
		System.out.println("**** RELATÓRIO SIMPLES ****");
		System.out.println(" ");
		System.out.println("**CABEÇALHO**");
		System.out.println("BANCO: " + dadosBanco.nomeBanco);
		System.out.println("TELEFONE: "+dadosBanco.telefone);
		
		//CORPO
		for(Conta conta: dadosBanco.getContas()){
			System.out.println("TITULAR: " + conta.getTitular());
			System.out.println("SALDO: "+conta.getSaldo());
		}
	
		
		//RODAPE
		System.out.println("**RODAPÉ**");
		System.out.println("BANCO: " + dadosBanco.nomeBanco);
		System.out.println("TELEFONE: "+dadosBanco.telefone);
		

		
	}


	

}
