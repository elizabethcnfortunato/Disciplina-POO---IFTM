
public class Abastecimento {
	Veiculo abastecimentoNoVeiculo;
	int abastecimentoAtual;
	public Abastecimento(Veiculo veiculo){
		this.abastecimentoNoVeiculo = veiculo;
	}
	public void reabastecimento(Veiculo veiculo ){
		
        abastecimentoAtual = veiculo.getCapacidadeTanqueCombustivel()- veiculo.getQuantidadeCombustivel();
        int aux = abastecimentoAtual + veiculo.getQuantidadeCombustivel();
        veiculo.setQuantidadeCombustivel(aux);
    }

}
