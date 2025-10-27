package classesBPM;

public class ExtruturasdeRepeticao {

	private Integer[] tabuada = new Integer[10];

	public ExtruturasdeRepeticao() {

	}

	public Integer[] getTabuada() {
		return tabuada;
	}

	public void setTabuada(Integer[] tabuada) {
		this.tabuada = tabuada;
	}

	public void tabuada(int num) {

		
		for (int i = 1; i < tabuada.length; i++) {

			tabuada[i] = num*i;

		}
		
		
	}
	public Integer[] tabuada(){
		
		
		return getTabuada();
	}
}
