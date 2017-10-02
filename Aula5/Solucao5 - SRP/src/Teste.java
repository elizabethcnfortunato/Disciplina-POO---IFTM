
public class Teste {
	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo(300);
		veiculo.acelerar();
		System.out.println(veiculo.getQuantidadeCombustivel());
		Abastecimento abastece = new Abastecimento(veiculo);
		abastece.reabastecimento(veiculo);
		System.out.println(veiculo.getQuantidadeCombustivel());
	}
}
