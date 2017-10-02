
public class CarroDeCorrida implements Veiculo {
	 private final int capacidadeTanqueCombustivel;
	  private int quantidadeCombustivel;
	  private int potencia = 0;
	  
	  public CarroDeCorrida(int combustivel ){
		 this.capacidadeTanqueCombustivel =  combustivel;
		 this.quantidadeCombustivel =  combustivel;
	  }
	  public void acelerar(){
		  System.out.println("Quantidade de Combustível antes: "+this.quantidadeCombustivel);
		  System.out.println("Potência Antes: "+this.potencia);
		  
		  potencia++;
	      quantidadeCombustivel--;
	      
	      System.out.println("Quantidade de Combustível depois: "+this.quantidadeCombustivel);
		  System.out.println("Potência Depois: "+this.potencia);
	  }
}
