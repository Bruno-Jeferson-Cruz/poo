
public class Vereador extends Candidato {
	private int numero;
	private static int limiteSup=40002;
	
	public Vereador() {
		super();
		this.numero=0;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero>limiteSup && numero<=99999) {
			this.numero=numero;
		}else {
			this.numero=limiteSup;
		}
	}		
}

