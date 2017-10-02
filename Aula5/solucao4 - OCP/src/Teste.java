
public class Teste {
	public static void main(String[] args) {
		//ManipuladorDeEventos manipulador = new ManipuladorDeEventos(new ModoDirecaoDefault());
		//Veiculo veiculo = manipulador.getVeiculo();
	
		ManipuladorDeEventos manipulador = new ManipuladorDeEventos(new ModoDirecaoEsporte());
		System.out.println("Opção Esporte: ");
		Veiculo veiculo = manipulador.getVeiculo();
		veiculo = manipulador.getVeiculo();
		System.out.println("Potência: " + veiculo.getPotencia());
		System.out.println("Altura da Suspenção: " + veiculo.getAlturaSuspencao());


		System.out.println("Opção Passeio: ");
		manipulador = new ManipuladorDeEventos(new ModoDirecaoPasseio());
		veiculo = manipulador.getVeiculo();
		System.out.println("Potência: " + veiculo.getPotencia());
		System.out.println("Altura da Suspenção: " + veiculo.getAlturaSuspencao());
		
	}

}
