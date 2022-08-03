package Cadastros;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import Candidatos.Governador;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class CadastroGovernador extends JFrame {
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textPartido;
	private JTextField textNumero;

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
					CadastroGovernador frame = new CadastroGovernador();
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
	public CadastroGovernador() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 435, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(50, 70, 100, 14);
		contentPane.add(lblNewLabel);
		
		textNome = new JTextField();
		textNome.setBounds(50, 85, 330, 25);
		contentPane.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Partido:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(50, 127, 100, 14);
		contentPane.add(lblNewLabel_1);
		
		textPartido = new JTextField();
		textPartido.setBounds(50, 141, 330, 25);
		contentPane.add(textPartido);
		textPartido.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("N\u00FAmero:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(50, 184, 100, 14);
		contentPane.add(lblNewLabel_2);
		
		textNumero = new JTextField();
		textNumero.setBounds(50, 197, 330, 25);
		contentPane.add(textNumero);
		textNumero.setColumns(10);
		
		JButton btnNewCadastrar = new JButton("Cadastrar");
		btnNewCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome=textNome.getText();
				String partido=textPartido.getText();
				int numero=Integer.parseInt(textNumero.getText());
				Governador g=new Governador(nome,partido,0,"Governador",numero);
				Governador gov=new Governador(nome,partido,0,"Governador",g.setNumero(numero));
				TelaInicial.cadastro(gov);
				setVisible(false);
			}
		});
		btnNewCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewCadastrar.setBounds(130, 233, 144, 23);
		contentPane.add(btnNewCadastrar);
		JLabel lblNewLabel_3 = new JLabel("Cadastro de Governadores:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(115, 25, 236, 34);
		contentPane.add(lblNewLabel_3);
	}

}
