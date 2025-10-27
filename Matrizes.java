package classesBPM;

public class Matrizes {
	
	private int numero;
	private char sexo;
	private String nome;
	private int idade;

	public Matrizes() {
		
	}
	
	public Matrizes(char sexo, String nome, int numero) {
		this.sexo = sexo;
		this.nome = nome;
		this.idade = numero;
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		
		this.numero = numero;
	}

	public char getSexo() {
		return sexo;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}
	
	
	
	public String toString() {
		
		
		return "Nome: " + nome + ", Idade: " + idade + ", Genero: " + sexo;
	}


	
}
