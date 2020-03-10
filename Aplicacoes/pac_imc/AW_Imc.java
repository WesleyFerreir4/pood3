package pac_imc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AW_Imc {

	private JFrame frame;
	private JTextField txtpeso;
	private JTextField txtaltura;
	private JTextField txtimc;
	private JTextField txtclassific;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AW_Imc window = new AW_Imc();
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
	public AW_Imc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IMC");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 28));
		lblNewLabel.setBounds(174, 11, 80, 27);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Peso");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(10, 62, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Altura");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(10, 87, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("IMC\r\n");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(10, 112, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Classifica\u00E7\u00E3o");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_1_3.setBounds(10, 137, 98, 14);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		txtpeso = new JTextField();
		txtpeso.setBounds(168, 62, 86, 20);
		frame.getContentPane().add(txtpeso);
		txtpeso.setColumns(10);
		
		txtaltura = new JTextField();
		txtaltura.setColumns(10);
		txtaltura.setBounds(168, 87, 86, 20);
		frame.getContentPane().add(txtaltura);
		
		txtimc = new JTextField();
		txtimc.setEditable(false);
		txtimc.setColumns(10);
		txtimc.setBounds(168, 112, 63, 20);
		frame.getContentPane().add(txtimc);
		
		txtclassific = new JTextField();
		txtclassific.setEditable(false);
		txtclassific.setBounds(168, 137, 86, 20);
		frame.getContentPane().add(txtclassific);
		txtclassific.setColumns(10);
		
		JButton btncalc = new JButton("Calcular");
		btncalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Imc i = new Imc ();
				i.altura = Float.parseFloat(txtaltura.getText());
				i.peso = Float.parseFloat(txtpeso.getText());
				i.CalcImc();
				i.MostrarClassific();
				txtimc.setText(String.valueOf(i.imc));
				txtclassific.setText(i.classific);
			}
		});
		btncalc.setFont(new Font("Tahoma", Font.BOLD, 16));
		btncalc.setBounds(168, 227, 111, 23);
		frame.getContentPane().add(btncalc);
	}

}
