
public abstract class Veiculo implements Ligar,Desligar {
	
	 private boolean motorLigado;
	 public boolean isMotorRodando() {
			return motorLigado;
		}

	public void ligar(){
		motorLigado = true;		
	}

   
    public void desligar(){
    	motorLigado = false;
    }
    
}
