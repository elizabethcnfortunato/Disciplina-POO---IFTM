package Template;

import java.util.ArrayList;
import java.util.List;



public class DadosBanco {
	
	private List<Conta> listaDeContas;
	
	String nomeBanco;
	int telefone;
	String endereco;
	String email;
	
	public DadosBanco(String nomeBanco,int telefone,String endereco,	String email){
		this.email = email;
		this.endereco = endereco;
		this.nomeBanco = nomeBanco;
		this.telefone = telefone;
	}
	public List<Conta> getContas(){
		return listaDeContas;
	}
	public String getEmail(){
		return email;
	}
	public String getEndereco(){
		return endereco;
	}
	public String getNomeBanco(){
		return nomeBanco;
	}
	public int getTelefone(){
		return telefone;
	}
	public void addConta(Conta conta){
		this.listaDeContas.add(conta);
	}
}
