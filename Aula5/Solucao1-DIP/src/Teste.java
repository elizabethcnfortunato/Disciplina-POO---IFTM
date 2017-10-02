
public class Teste {
	public static void main(String[] args) {
		Veiculo veiculo = new CarroDeCorrida(300);
		Piloto piloto = new Piloto(veiculo);
		piloto.aumentaVelocidade();
		
		
	}
}
