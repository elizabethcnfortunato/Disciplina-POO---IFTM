package Template;

public abstract class Relatorio {
	DadosBanco dadosBanco;
	public Relatorio(DadosBanco dadosBanco){
		super();
		this.dadosBanco = dadosBanco;
	}
	
abstract void imprimiRelatorio();
	//cabe�alho
	//corpo 
	//rodap�
	

}
