import java.util.ArrayList;

import javax.swing.JOptionPane;
public class Eleicao {
	//----------------------------Métodos-----------------------------------//
	public static ArrayList <Prefeito> listPrefeito=new ArrayList<Prefeito>();
	public static ArrayList <Vereador> listVereador=new ArrayList<Vereador>();
	public static void candidatosPrefeito() {
		String candidatos="";
		for(Prefeito p : listPrefeito) {
			  candidatos+=p.getNumero()+"-"+p.getNome()+"-"+p.getPartido()+"\n";
			}
		int voto=Integer.parseInt(JOptionPane.showInputDialog("Escolha um prefeito:\n"+candidatos));
		int cont=0;
		for(Prefeito P: listPrefeito) {
			if(P.getNumero()==voto) {
				P.incrementaVoto();
				cont ++;
			}
		}
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "Prefeito nao encontrado!!");
		}
		
	}
	public static void candidatosVereador() {
		String candidato="";
		for(Vereador v : listVereador) {
			  candidato+=v.getNumero()+"-"+v.getNome()+"-"+v.getPartido()+"\n";
			}
		int voto=Integer.parseInt(JOptionPane.showInputDialog("Escolha um vereador:\n"+candidato));
		int cont=0;
		for(Vereador V: listVereador) {
			if(V.getNumero()==voto) {
				V.incrementaVoto();
				cont++;
			}
		}
		if(cont==0) {
			JOptionPane.showMessageDialog(null, "Vereador nao encontrado!!");
		}	
	}
	public static  void cadastraPrefeito() {
		Prefeito novoPrefeito=new Prefeito();
		String nome=JOptionPane.showInputDialog("Nome do candidato: ");
		novoPrefeito.setNome(nome);
		String partido=JOptionPane.showInputDialog("Partido do candidato: ");
		novoPrefeito.setPartido(partido);
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Numero do candidato: "));
		novoPrefeito.setNumero(numero);
		listPrefeito.add(novoPrefeito);
	}
	public static void cadastraVereador() {
		Vereador novoVereador=new Vereador();
		String nome=JOptionPane.showInputDialog("Nome do vereador: ");
		novoVereador.setNome(nome);
		String partido=JOptionPane.showInputDialog("Partido do vereador: ");
		novoVereador.setPartido(partido);
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Numero do vereador: "));
		novoVereador.setNumero(numero);
		listVereador.add(novoVereador);
	}
	public static String prefeitoMaisVotado() {
		int maior=0;
		String maisVotado="";
		for(Prefeito p:listPrefeito) {
			if(maior<p.getNumVotos()) {
				maior=p.getNumVotos();
				maisVotado=p.getNome();
			}
		}
		return maisVotado;
	}
	public static String vereadorMaisVotado() {
		int maior=0;
		String maisVotado="";
		for(Vereador v:listVereador) {
			if(v.getNumVotos()>maior) {
				maior=v.getNumVotos();
				maisVotado=v.getNome();			
			}
		}
		return maisVotado;
	}
	public static void menuCadastro() {	
		int escolha=0;
		while (escolha!=3){	
			escolha=Integer.parseInt(JOptionPane.showInputDialog("1-Cadastrar candidato a Prefeito: \n2-Cadastrar candidato a Vereador: \n3-Sair: "));
			switch (escolha) {
			case 1:
				cadastraPrefeito();
				break;
			case 2:
				cadastraVereador();
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"Hora de votar!");			
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite apenas 1,2 ou 3!!");
				menuCadastro();
				break;
			}
		}
	}
	public static void menuVotacao() {
		int escolha=0;
		while(escolha!=3) {			
			escolha=Integer.parseInt(JOptionPane.showInputDialog("1-Votar em um prefeito: \n2-Votar em um vereador:\n3-Sair e exibir resultados: "));
			switch (escolha) {
			case 1:
				candidatosPrefeito();
				break;
			case 2:
				candidatosVereador();
				break;
			case 3:
				JOptionPane.showMessageDialog(null,"Prefeito mais votado: "+prefeitoMaisVotado()+"\nVereador mais votado: "+vereadorMaisVotado());
				break;
			default:
				JOptionPane.showMessageDialog(null, "Digite apenas 1,2 ou 3!!");
				menuVotacao();
				break;
			}
		}
	}
	//------------------------------------//
	public static void main(String[] args) {
		menuCadastro();
		menuVotacao();
	}
}