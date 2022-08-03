package Cadastros;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import Votacao.VotarPresidente;
import Votacao.VotarGovernador;
import Votacao.VotarSenador;
import Votacao.VotarDepFederal;
import Votacao.VotarDepEstadual;
import Votacao.Resultado;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import Candidatos.Candidato;
import javax.swing.JOptionPane;

import java.awt.Font;

public class TelaInicial extends JFrame {
	public static ArrayList<Candidato> listaCandidatos=new ArrayList<Candidato>();
	private JPanel contentPane;
	public static void cadastro(Candidato c) {
		listaCandidatos.add(c);
	}
	public static void busca(int numero,String tipo) {
		boolean cont=false;
		for(Candidato c:listaCandidatos) {
			if(c.getNumero()==numero && tipo==c.getTipo()){
				c.incrementaVotos();
				cont=true;
			}
		}
		if(cont==false) {
			JOptionPane.showMessageDialog(null,"Candidato nao encontrado!");
		}
	}
	public static String viraString(String tipo) {
		String dados="";
		for(Candidato c:listaCandidatos) {
			if(tipo==c.getTipo()) {
				dados+=c.toString()+"\n";
			}
		}
		return dados;
	}
	
	public static void main(String[] args) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
        	System.err.println(ex);           
        } catch (InstantiationException ex) {
           System.err.println(ex);
        } catch (IllegalAccessException ex) {
            System.err.println(ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            System.err.println(ex);
        }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 488, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewSenador = new JButton("CADASTRAR CANDIDATO A SENADOR");
		btnNewSenador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CadastroSenador().setVisible(true);
			}
		});
		btnNewSenador.setBounds(51, 159, 354, 23);
		contentPane.add(btnNewSenador);
		
		JButton btnNewPresidente = new JButton("CADASTRAR CANDIDATO A PRESIDENCIA");
		btnNewPresidente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CadastroPresidente().setVisible(true);
			}
		});
		btnNewPresidente.setBounds(51, 114, 354, 23);
		contentPane.add(btnNewPresidente);
		
		JButton btnNewGovernador = new JButton("CADASTRAR CANDIDATO A GOVERNADOR");
		btnNewGovernador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CadastroGovernador().setVisible(true);
			}
		});
		btnNewGovernador.setBounds(51, 204, 354, 23);
		contentPane.add(btnNewGovernador);
		
		JButton btnNewDepFederal = new JButton("CADASTRAR CANDIDATO A DEPUTADO FEDERAL");
		btnNewDepFederal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CadastroDepFederal().setVisible(true);
			}
		});
		btnNewDepFederal.setBounds(51, 249, 354, 23);
		contentPane.add(btnNewDepFederal);
		
		JButton btnNewDepEstadual = new JButton("CADASTRAR CANDIDATO A DEPUTADO ESTADUAL");
		btnNewDepEstadual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new CadastroDepEstadual().setVisible(true);
			}
		});
		btnNewDepEstadual.setBounds(51, 294, 354, 23);
		contentPane.add(btnNewDepEstadual);
		
		JButton btnNewFinalizar = new JButton("Iniciar vota\u00E7\u00E3o");
		btnNewFinalizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new FimCadastro().setVisible(true);
				new VotarDepEstadual().setVisible(true);
				new VotarDepFederal().setVisible(true);
				new VotarSenador().setVisible(true);
				new VotarGovernador().setVisible(true);
				new VotarPresidente().setVisible(true);
			}
		});
		btnNewFinalizar.setBounds(94, 339, 259, 23);
		contentPane.add(btnNewFinalizar);
		
		JLabel lblNewLabel = new JLabel("CADASTRO DE CANDIDATOS:");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel.setBounds(78, 60, 327, 23);
		contentPane.add(lblNewLabel);
	}
}
