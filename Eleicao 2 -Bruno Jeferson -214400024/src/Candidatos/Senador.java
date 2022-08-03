package Candidatos;
public class Senador extends Candidato{
	private int numero;
	private int limiteinferior=44;
	public Senador(String nome,String partido,long numVotos,String tipo,int numero) {
		super(nome,partido,numVotos,tipo);
		this.numero=numero;
	}
	@Override
	public int getNumero() {	
		return numero;
	}
	public  int setNumero(int numero) {
		if(numero<limiteinferior || numero>99) {
			return this.numero=limiteinferior;
		}else {
			return this.numero=numero;
		}	
	}
	@Override
	public String toString() {
		return super.toString()+"---NUMERO: "+numero+" ||";
	}
}
