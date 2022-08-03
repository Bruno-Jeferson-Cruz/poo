package Candidatos;

public abstract class Candidato {
	private String nome;
	private String partido;
	private Long numVotos;
	private String tipo;
	public Candidato(String nome,String partido,long numVotos,String tipo) {
		this.nome=nome;
		this.partido=partido;
		this.numVotos=numVotos;
		this.tipo=tipo;
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
	public Long getNumvotos() {
		return numVotos;
	}
	public void setNumVotos(Long numvotos) {
		this.numVotos = numvotos;
	}
	public abstract int getNumero();
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public void incrementaVotos() {
		this.numVotos++;
	}
	@Override
	public String toString() {
		return "|| NOME:" + nome + "---PARTIDO:" + partido ;
	}
	
}
