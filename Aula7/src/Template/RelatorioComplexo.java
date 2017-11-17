package Template;

import java.util.Date;
import java.text.SimpleDateFormat;

public class RelatorioComplexo extends Relatorio{

	public RelatorioComplexo(DadosBanco dadosBanco) {
		super(dadosBanco);
		// TODO Auto-generated constructor stub
	}
	Date data = new Date();
	SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
	@Override
	void imprimiRelatorio() {
		//CABECALHO
		System.out.println("**** RELATÓRIO SIMPLES ****");
		System.out.println(" ");
		System.out.println("**CABEÇALHO**");
		System.out.println("BANCO: " + dadosBanco.nomeBanco);
		System.out.println("ENDEREÇO: "+dadosBanco.endereco);
		System.out.println("TELEFONE: "+dadosBanco.telefone);
		
		//CORPO
		System.out.println("TITULAR: ");
		System.out.println("SALDO: ");
		
		//RODAPE
		System.out.println("**RODAPÉ**");
		System.out.println("DATA ATUAL:" + formatador);
		
		
		
		
	}



}
