package Votacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import Candidatos.Candidato;
import Cadastros.TelaInicial;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Resultado extends JFrame {
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static String resultado(String tipo) {
		long maior=0;
		String nome="";
		for(Candidato c:TelaInicial.listaCandidatos) {
			if(maior<c.getNumvotos() && tipo==c.getTipo()) {
				maior=c.getNumvotos();	
				nome=c.getNome();
			}
		}
		return nome;
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
					Resultado frame = new Resultado();
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
	public Resultado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("RESULTADOS:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(144, 25, 167, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Presidente:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(20, 60, 100, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Governador:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(20, 90, 100, 20);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Senador:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(20, 120, 100, 19);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Dep.Federal:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(20, 150, 100, 19);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Dep.Estadual:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(20, 180, 114, 19);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblPresidente = new JLabel(resultado("Presidente"));
		lblPresidente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPresidente.setBounds(130, 60, 230, 19);
		contentPane.add(lblPresidente);
		
		JLabel lblGovernador = new JLabel(resultado("Governador"));
		lblGovernador.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblGovernador.setBounds(130, 90, 240, 19);
		contentPane.add(lblGovernador);
		
		JLabel lblSenador = new JLabel(resultado("Senador"));
		lblSenador.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSenador.setBounds(130, 120, 240, 19);
		contentPane.add(lblSenador);
		
		JLabel lblDepFederal = new JLabel(resultado("DepFederal"));
		lblDepFederal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDepFederal.setBounds(130, 150, 211, 19);
		contentPane.add(lblDepFederal);
		
		JLabel lblDepEstadual = new JLabel(resultado("DepEstadual"));
		lblDepEstadual.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDepEstadual.setBounds(130, 180, 211, 19);
		contentPane.add(lblDepEstadual);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnOK.setBounds(317, 210, 89, 23);
		contentPane.add(btnOK);
	    
	}
}
