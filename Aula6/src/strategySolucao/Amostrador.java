package strategySolucao;


public class Amostrador {
	private int[] populacao;

	public Amostrador(int[] codigosZip) {
			populacao = codigosZip;
	}

	public int[] selecionaSubconjunto(Randomico randomico, int tamanhoAmostra) {
			return randomico.retornaSubconjunto(populacao, tamanhoAmostra);
	}

	public int[] getPopulacao() {
			return populacao;
	}

	public void setPopulacao(int[] populacao) {
			this.populacao = populacao;
	}

	public int[] selecionaSubconjunto(Sistemico sistemico, int tamanhoAmostra) {
		// TODO Auto-generated method stub
		return null;
	}
}
