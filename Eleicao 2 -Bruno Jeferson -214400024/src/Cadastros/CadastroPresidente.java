package Cadastros;
import Candidatos.Presidente;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

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

public class CadastroPresidente extends JFrame {
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
					CadastroPresidente frame = new CadastroPresidente();
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
	public CadastroPresidente() {
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
				Presidente p=new Presidente(nome,partido,0,"Presidente",numero);
				Presidente presidente=new Presidente(nome,partido,0,"Presidente",p.setNumero(numero));
				TelaInicial.cadastro(presidente);
				setVisible(false);
			}
		});
		btnNewCadastrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewCadastrar.setBounds(130, 233, 144, 23);
		contentPane.add(btnNewCadastrar);
		JLabel lblNewLabel_3 = new JLabel("Cadastro de Presidentes:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3.setBounds(115, 25, 236, 34);
		contentPane.add(lblNewLabel_3);
	}

}
