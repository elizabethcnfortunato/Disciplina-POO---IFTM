
public class Teste {
	public static void main(String[] args) {
		//ManipuladorDeEventos manipulador = new ManipuladorDeEventos(new ModoDirecaoDefault());
		//Veiculo veiculo = manipulador.getVeiculo();
	
		ManipuladorDeEventos manipulador = new ManipuladorDeEventos(new ModoDirecaoEsporte());
		System.out.println("Op��o Esporte: ");
		Veiculo veiculo = manipulador.getVeiculo();
		veiculo = manipulador.getVeiculo();
		System.out.println("Pot�ncia: " + veiculo.getPotencia());
		System.out.println("Altura da Suspen��o: " + veiculo.getAlturaSuspencao());


		System.out.println("Op��o Passeio: ");
		manipulador = new ManipuladorDeEventos(new ModoDirecaoPasseio());
		veiculo = manipulador.getVeiculo();
		System.out.println("Pot�ncia: " + veiculo.getPotencia());
		System.out.println("Altura da Suspen��o: " + veiculo.getAlturaSuspencao());
		
	}

}
