
public class Candidato {
	private String nome;
	private String partido;
	private int numVotos;
	
	public Candidato() {
		this.nome="Indefinido";
		this.partido="Indefinido";
		this.numVotos=0;
	}
	public void incrementaVoto() {
		this.numVotos++;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPartido() {
		return partido;
	}
	public void setPartido(String partido) {
		this.partido = partido;
	}
	public int getNumVotos() {
		return numVotos;
	}
	public void setNumVotos(int numVotos) {
		this.numVotos = numVotos;
	}
	
}
