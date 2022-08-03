
public class Prefeito extends Candidato{
	private int numero;
	private static int limite=44;
	public Prefeito() {
		super();
		this.numero=0;

	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(numero>limite && numero<=99) {
			this.numero=numero;
		}else {
			this.numero=limite;
		}	
	}		
}
