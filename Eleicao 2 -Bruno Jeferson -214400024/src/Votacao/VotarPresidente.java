package Votacao;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import Candidatos.Presidente;
import Cadastros.TelaInicial;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class VotarPresidente extends JFrame {
	private JPanel contentPane;
	private JTextField textVoto;
	private JLabel lblNewLabel_1;
	private JTextArea textDados;

	/**
	 * Launch the application.
	 */
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
					VotarPresidente frame = new VotarPresidente();
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
	public VotarPresidente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero do Candidato a Presidencia escolhido:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(44, 204, 414, 25); 
		contentPane.add(lblNewLabel);
		
		textVoto = new JTextField();
		textVoto.setBounds(195, 240, 89, 25);
		contentPane.add(textVoto);
		textVoto.setColumns(10);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero=Integer.parseInt(textVoto.getText());
				String tipo="Presidente";
				TelaInicial.busca(numero, tipo);
				setVisible(false);
			}
		});
		btnConfirmar.setBounds(195, 290, 89, 23);
		contentPane.add(btnConfirmar);
		
		lblNewLabel_1 = new JLabel("Candidatos Concorrendo:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(44, 11, 430, 25);
		contentPane.add(lblNewLabel_1);
		
		textDados = new JTextArea(TelaInicial.viraString("Presidente"));
		textDados.setEditable(false);
		textDados.setBounds(44, 49, 400, 144);
	    textDados.setWrapStyleWord(true);
	    textDados.setLineWrap(true);
		contentPane.add(textDados);
	}

}
