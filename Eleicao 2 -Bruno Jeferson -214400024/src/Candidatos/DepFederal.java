package Candidatos;
public class DepFederal extends Candidato{
	private int numero;
	private int limitesuperior=40002;
	public DepFederal(String nome,String partido,long numVotos,String tipo,int numero) {
		super(nome,partido,numVotos,tipo);
		this.numero=numero;
	}
	@Override
	public int getNumero() {
		return numero;
	}
	public  int setNumero(int numero) {
		if(numero>limitesuperior || numero<10000) {
			return this.numero=limitesuperior;
		}else {
			return this.numero=numero;
		}	
	}
	@Override
	public String toString() {
		return super.toString()+"---NUMERO: "+numero+" ||";
	}
}
