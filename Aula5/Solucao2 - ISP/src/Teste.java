
public class Teste {
	
	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.ligar();
		carro.ligarRadio();
		System.out.println("Ligando o Carro: " + carro.isMotorRodando()+" -- R�dio Ligado? " +carro.isRadioOn());
		
		carro.desligarRadio();
		carro.desligar();
		System.out.println("Desligando o Carro: " + carro.isMotorRodando()+" -- R�dio Ligado? " +carro.isRadioOn());
		
		Drone drone = new Drone();
		drone.ligar();
		drone.ligarCamera();
		System.out.println("Ligando o Drone: " + drone.isMotorRodando()+" -- C�mera Ligada? " +drone.isCameraOn());
		drone.desligarCamera();
		drone.desligar();
		System.out.println("Desligando o Drone: " + drone.isMotorRodando()+" -- C�mera Ligada? " +drone.isCameraOn());
	}

}
