package pac_boletim;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class AW_boletim {

	private JFrame frame;
	private JTextField txtnota1;
	private JTextField txtnota2;
	private JTextField txtnota3;
	private JTextField txtmedia;
	private JTextField txtsituacao;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AW_boletim window = new AW_boletim();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AW_boletim() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.RED);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Boletim");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
		lblNewLabel.setBounds(181, 11, 106, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1a Nota");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(20, 47, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2a Nota");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(20, 72, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("3a Nota");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(20, 97, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Media");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(20, 154, 46, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Situa\u00E7\u00E3o");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(20, 179, 46, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					boletim b = new boletim();
					b.nota1 = Float.parseFloat(txtnota1.getText());
					b.nota2 = Float.parseFloat(txtnota2.getText());
					b.nota3 = Float.parseFloat(txtnota3.getText());
					b.CalcularMedia();
					b.MostrarSituacao();
					txtmedia.setText(String.valueOf(b.media));
					txtsituacao.setText(b.situacao);
			}
		});
		btnNewButton.setBounds(182, 213, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		txtnota1 = new JTextField();
		txtnota1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtnota1.setBounds(88, 44, 46, 20);
		frame.getContentPane().add(txtnota1);
		txtnota1.setColumns(10);
		
		txtnota2 = new JTextField();
		txtnota2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtnota2.setBounds(88, 69, 46, 20);
		frame.getContentPane().add(txtnota2);
		txtnota2.setColumns(10);
		
		txtnota3 = new JTextField();
		txtnota3.setHorizontalAlignment(SwingConstants.RIGHT);
		txtnota3.setBounds(88, 94, 46, 20);
		frame.getContentPane().add(txtnota3);
		txtnota3.setColumns(10);
		
		txtmedia = new JTextField();
		txtmedia.setEditable(false);
		txtmedia.setHorizontalAlignment(SwingConstants.RIGHT);
		txtmedia.setBounds(88, 151, 46, 20);
		frame.getContentPane().add(txtmedia);
		txtmedia.setColumns(10);
		
		txtsituacao = new JTextField();
		txtsituacao.setEditable(false);
		txtsituacao.setHorizontalAlignment(SwingConstants.CENTER);
		txtsituacao.setBounds(88, 176, 89, 20);
		frame.getContentPane().add(txtsituacao);
		txtsituacao.setColumns(10);
	}
}
