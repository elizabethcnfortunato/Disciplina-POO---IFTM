package Observer;

public interface Subject {
	
	public Boolean getAlerta();
	
	public void observar(Observer o);

	public void removerObservador(Observer o);

	public void notificarObservadores();
}