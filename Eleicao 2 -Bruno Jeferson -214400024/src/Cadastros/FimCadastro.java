package Cadastros;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import Votacao.Resultado;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FimCadastro extends JFrame {

	private JPanel contentPane;

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
					FimCadastro frame = new FimCadastro();
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
	public FimCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 446, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("VOTOS COMPUTADOS!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(107, 25, 266, 20);
		contentPane.add(lblNewLabel);
		
		JRadioButton rdbtnExibir = new JRadioButton("Exibir resultados");
		rdbtnExibir.setBounds(151, 75, 139, 23);
		contentPane.add(rdbtnExibir);
		
		JRadioButton rdbtnFinalizar = new JRadioButton("Finalizar");
		rdbtnFinalizar.setBounds(151, 130, 109, 23);
		contentPane.add(rdbtnFinalizar);
		
			ButtonGroup grupo=new ButtonGroup();
			grupo.add(rdbtnExibir);
			grupo.add(rdbtnFinalizar);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnExibir.isSelected()) {
					new Resultado().setVisible(true);
				}else if(rdbtnFinalizar.isSelected()) {
					new TelaInicial().setVisible(true);
				}
			}
		});
		btnOK.setBounds(171, 175, 89, 23);
		contentPane.add(btnOK);
	}
}
